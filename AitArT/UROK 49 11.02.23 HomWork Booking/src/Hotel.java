import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hotel {
        private String title;
        private List<Room>rooms =new ArrayList<>();

    public Hotel(String title, Room... rooms) {
        this.title = title;
        this.rooms.addAll(Arrays.asList(rooms));
    }

    public String getTitle() {
        return title;
    }

    public List<Room> getRooms() {
        return rooms;
    }
    public Room getRoomByNumber(int roomNumber){
        for (Room room : rooms) {
            if (room.getNum()==roomNumber){
                return room;
            }
        }
        return null;
    }
    public List<Room> getListofRoomsByType(List<Room>roomList, RoomType roomType){
        List<Room>ouList=new ArrayList<>();
        for (Room room : roomList) {
            if (room.getRoomType()==roomType){
                ouList.add(room);
            }
        }
        return ouList;
    }
    public List<Room> getListOfFreeRoomsOnDates(List<Room>roomList, List<LocalDate> desiredDates){
        List<Room>ouList=new ArrayList<>();
        for (Room room : roomList) {
            if (room.checkRoomStatus(desiredDates)==RoomStatus.AVAILABLE){
                ouList.add(room);
            }
        }
        return ouList;
    }
public void getListOfRoomsPrice(List<Room>rooms,List<LocalDate>desiredDates){
    for (Room room : rooms) {
        System.out.println(room + ". Total Prices = " + room.calculatePrice(desiredDates));
    }
}


    @Override
    public String toString() {
        System.out.println("Hotel " + title);
        for (Room room:rooms){
            System.out.println(room);
        }
        return "";
    }
}
