import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {


    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    Guest guest;
    DiningRoom diningRoom;


    @Before
    public void before(){
        hotel = new Hotel("Codeclan Towers");
        bedroom1 = new Bedroom(1, 1, RoomType.SINGLE, 20.00);
        bedroom2 = new Bedroom(2, 2, RoomType.DOUBLE, 30.00);
        bedroom3 = new Bedroom(3, 3, RoomType.TRIPLE, 60.00);
        bedroom4 = new Bedroom(4, 4, RoomType.FAMILY, 70.00);
        conferenceRoom1 = new ConferenceRoom(20, "meetings");
        conferenceRoom2 = new ConferenceRoom(40, "parties");
        guest = new Guest("Jon Snow");
        hotel.addBedroom(bedroom1);
        diningRoom = new DiningRoom("main", 5);

    }

    @Test
    public void canAddBedroomToHotel(){
        hotel.addBedroom(bedroom1);
        assertEquals(2, hotel.countBedrooms());
    }

    @Test
    public void canCheckGuestIn(){
        hotel.checkGuestIn(guest, bedroom1);
        assertEquals(1, hotel.countGuestsInRoom(bedroom1));
    }

    @Test
    public void canCheckGuestOut(){
        hotel.checkGuestIn(guest, bedroom1);
        hotel.checkGuestOut(guest, bedroom1);
        assertEquals(0, hotel.countGuestsInRoom(bedroom1));
    }

    @Test
    public void canCheckGuestInConferenceRoom(){
        hotel.checkGuestIn(guest, conferenceRoom1);
        assertEquals(1, hotel.countGuestsInRoom(conferenceRoom1));
    }

    @Test
    public void canCheckGuestOutConferenceRoom(){
        hotel.checkGuestIn(guest, conferenceRoom1);
        hotel.checkGuestOut(guest, conferenceRoom1);
        assertEquals(0, hotel.countGuestsInRoom(conferenceRoom1));
    }

    @Test
    public void canMakeBooking(){
        hotel.bookRoom(bedroom1, 4);
        assertEquals( 1, hotel.countBookings());
    }

    @Test
    public void canAddDiningRoom(){
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.countDiningRooms());
    }

    @Test
    public void canCheckVacantRooms(){
        hotel.addBedroom(bedroom2);
        hotel.checkGuestIn(guest, bedroom1);
        hotel.addBedroom(bedroom3);
        hotel.addBedroom(bedroom4);
        assertEquals(3, hotel.checkVacantRooms().size());
    }




}
