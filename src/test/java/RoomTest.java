import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Bedroom bedroom;
    private ArrayList<Guest> guests;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(4, 14, RoomType.FAMILY, 70.00);
        conferenceRoom = new ConferenceRoom(20, "meetings");
        guest = new Guest("Pedro");

    }

    @Test
    public void checkBedroomHasCapacity(){
        assertEquals(4, bedroom.getCapacity());
    }

    @Test
    public void checkBedroomHasGuests(){
        assertEquals(0, bedroom.getGuests());
    }

    @Test
    public void checkBedroomHasRoomNumber(){
        assertEquals(14, bedroom.getRoomNumber());
    }

    @Test
    public void checkBedroomHasRoomType(){
        assertEquals(RoomType.FAMILY, bedroom.getRoomType());
    }

    @Test
    public void canAddGuestToRoom(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests());

    }

    @Test
    public void canRemoveGuest(){
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getGuests());
    }



}


