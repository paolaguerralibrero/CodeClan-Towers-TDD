import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom bedroom;
    Booking booking;


    @Before
    public void before(){
        bedroom = new Bedroom(2, 2, RoomType.DOUBLE, 30.00);
        booking = new Booking(bedroom,4);

    }

    @Test
    public void canGetTotalBill(){
        assertEquals(120, booking.getTotalBill(booking), 00.00);

    }

}
