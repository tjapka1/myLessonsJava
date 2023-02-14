import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private  String firstName;
    private  String laststName;
    private LocalDate dateOfBirsd;
    private Address address;
    private List<Booking> clientBookingHistory=new ArrayList<>();

    public Person(String firstName, String laststName, LocalDate dateOfBirsd, Address address) {
        this.firstName = firstName;
        this.laststName = laststName;
        this.dateOfBirsd = dateOfBirsd;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLaststName() {
        return laststName;
    }

    public LocalDate getDateOfBirsd() {
        return dateOfBirsd;
    }

    public Address getAddress() {
        return address;
    }

    public List<Booking> getClientBookingHistory() {
        return clientBookingHistory;
    }

public List<LocalDate> notifyDesiredDates(LocalDate checkIn, int accommodationDays){
    if (checkIn==null || accommodationDays<=0) return null;
    List<LocalDate> ouList=new ArrayList<>();
    for (int i = 0; i < accommodationDays; i++) {
        ouList.add(checkIn.plusDays(i));
    }
    return ouList;
    }

    @Override
    public String toString() {
        return firstName + " '" + laststName + ", " + dateOfBirsd +", " + address ;
    }
    public void printBockingHistory(){
        for (Booking booking : clientBookingHistory) {
            System.out.println(booking);
        }
    }
    public boolean booking(Hotel hotel, int roomNumber, List<LocalDate> desiredDates){
       if(hotel == null|| roomNumber<=0 || roomNumber>hotel.getRooms().size() ||desiredDates==null|| desiredDates.isEmpty()){
           System.out.println("Ощибка ");
           return false;
       }
       Room room=hotel.getRoomByNumber(roomNumber);
        if (room.getRoomStatus()==RoomStatus.UNDER_REPAIR || room.checkRoomStatus(desiredDates)==RoomStatus.UNDER_REPAIR){
            System.out.println("Комната на Ремонте");
            return false;
        }
       if (room.getRoomStatus()==RoomStatus.ON_MAINTENANCE || room.checkRoomStatus(desiredDates)==RoomStatus.ON_MAINTENANCE){
           System.out.println("Комната на Обслуживании");
           return false;
       }
        if (room.getRoomStatus()==RoomStatus.RESERVED || room.checkRoomStatus(desiredDates)!=RoomStatus.RESERVED){
            System.out.println("Комната уже забронирована");
            return false;
        }
        if (room.checkRoomStatus(desiredDates)!=RoomStatus.AVAILABLE){
            System.out.println("Комната не Доступна");
            return false;
        }
        LocalDate checkIn=desiredDates.get(0);
        LocalDate checkOu=desiredDates.get(desiredDates.size()-1);
        double price=room.calculatePrice(desiredDates);
        room.reserveDates(desiredDates,  RoomStatus.RESERVED);
        clientBookingHistory.add(new Booking(hotel, room, checkIn, checkOu, price ));
        System.out.println("Бронирование прошло успешно");
        return true;
    }
}
