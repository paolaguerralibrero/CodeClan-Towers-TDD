import java.util.ArrayList;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;
    private Double rates;

    public Bedroom(int capacity, int roomNumber, RoomType roomType, Double rates) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.rates = rates;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Double getRates(){
        return rates;
    }
}
