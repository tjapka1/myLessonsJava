import java.time.LocalDate;

public class Booking {

    private Hotel hotel;
    private Room room;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private double price;

    public Booking(Hotel hotel, Room room, LocalDate checkIn, LocalDate checkOut, double price) {
        this.hotel = hotel;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hotel " + hotel.getTitle() +
                ", room " + room +
                ", from " + checkIn +
                " to:" + checkOut +
                ". Total price" + price
                ;
    }
}
