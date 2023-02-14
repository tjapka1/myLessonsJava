import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Hotel kavkaz=new Hotel("Кавказ",
                new Room(1, RoomType.LOW_COST, 10, 30),
                new Room(2, RoomType.STANDART, 15, 35),
                new Room(3, RoomType.STANDART, 14, 33),
                new Room(4, RoomType.LOW_COST, 10, 30),
                new Room(5, RoomType.SUIT, 20, 40),
                new Room(6, RoomType.SUIT, 25, 45),
                new Room(7, RoomType.APARTMENT, 60, 50),
                new Room(8, RoomType.APARTMENT, 65, 55),
                new Room(9, RoomType.STUDIO, 70, 70),
                new Room(10, RoomType.STUDIO, 75, 75),
                new Room(11, RoomType.LUX, 120, 1000),
                new Room(12, RoomType.LUX, 150, 2000)
                );

        Person p1=new Person("Alex", "Smit", LocalDate.of(1988, 4, 14),
                         new Address("45711","Datteln", "Jahn str", "23a"));

        RoomType wishRoomType=RoomType.STANDART;
        LocalDate checkIn=LocalDate.of(2023,2,20);
        int accommodationDays =3;
        List<LocalDate> desiredDates=p1.notifyDesiredDates(checkIn, accommodationDays);

        List<Room>allRooms=kavkaz.getRooms();

        List<Room>standartRoom=kavkaz.getListofRoomsByType(allRooms,wishRoomType);


        List<Room> listOfFreeRooms = kavkaz.getListOfFreeRoomsOnDates(standartRoom, desiredDates);

        kavkaz.getListOfRoomsPrice(listOfFreeRooms, desiredDates);

        p1.booking(kavkaz, 3, desiredDates);

        p1.printBockingHistory();

        LocalDate checkIn2=LocalDate.of(2023,2,21);
        int accommodationDays2 =3;
        List<LocalDate> desiredDates2=p1.notifyDesiredDates(checkIn, accommodationDays);








    }
}