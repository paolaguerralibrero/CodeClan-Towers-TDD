public class Booking {

    private Bedroom bedroom;
    private int nights;

    public Booking(Bedroom bedroom, int nights) {
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public Double getTotalBill(Booking booking) {
        return this.bedroom.getRates() * this.nights;
    }
}
