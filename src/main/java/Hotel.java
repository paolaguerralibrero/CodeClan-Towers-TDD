import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private String name;
    private ArrayList<Booking> bookings;
    private HashMap<String, DiningRoom> diningRooms;
    private ArrayList<Bedroom> emptyBedrooms;



    public Hotel(String name) {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.name = name;
        this.bookings = new ArrayList<>();
        this.diningRooms = new HashMap<>();

    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(ArrayList<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBedroom(Bedroom bedroom1) {
        this.bedrooms.add(bedroom1);

    }

    public int countBedrooms(){
       return this.bedrooms.size();

    }

    public int countGuestsInRoom(Room room) {
       return room.getGuests();
    }

    public void checkGuestIn(Guest guest, Room bedroom1) {
        bedroom1.addGuest(guest);
    }

    public void checkGuestOut(Guest guest, Room bedroom1) {
        bedroom1.removeGuest(guest);
    }

    public int countBookings() {
        return this.bookings.size();
    }

    public void bookRoom(Bedroom bedroom, int nights) {
        Booking booking = new Booking(bedroom, nights);
        this.bookings.add(booking);
    }

    public int countDiningRooms(){
        return this.diningRooms.size();
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.put(diningRoom.getName(), diningRoom);

    }

    public ArrayList<Bedroom> checkVacantRooms() {
        emptyBedrooms = new ArrayList<>();
//        for ( int i = 0; i < countBedrooms(); i++){
        for(Bedroom bedroom : this.bedrooms)
            if(bedroom.getGuests() == 0){
            emptyBedrooms.add(bedroom);
        }
        return emptyBedrooms;


    }
}
