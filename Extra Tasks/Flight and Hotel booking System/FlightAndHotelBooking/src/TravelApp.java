import java.util.ArrayList;
import java.util.Random;

public class TravelApp {
    private final ArrayList < Flight > flights;
    private final ArrayList < Hotel > hotels;

    public TravelApp() {
        this.flights = new ArrayList < Flight > ();
        this.hotels = new ArrayList < Hotel > ();
    }
    Flight flightObj = new Flight();
    Hotel hotelObj = new Hotel();
    public void searchFlights(String origin, String destination, String date, int numPassengers) {
        if(flightObj.getOrigin().equals(origin) || flightObj.getDestination().equals(destination) || flightObj.getDate().equals(date) || flightObj.getNumPassengers() == numPassengers ){
            System.out.println("Based on Your Input the Available Flight is : ");
            System.out.println(flightObj.toString());
        }
        else{
            System.out.println("Based on your Input there are no available Flights");
        }
    }

    public void searchHotels(String location, String checkIn, String checkOut, int numGuests) {
        if (hotelObj.getLocation().equals(location) || hotelObj.getCheckIn().equals(checkIn) || hotelObj.getCheckOut().equals(checkOut) || hotelObj.getNumGuests() == numGuests){
            System.out.println("Based on Your Input the Available hotels are :  ");
            System.out.println(hotelObj.toString());
        }
        else{
            System.out.println("Based on your Input there are no available hotels");
        }
    }

    public void bookFlight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price) {
        Flight flight = new Flight(flightNumber, passengerName, origin, destination, date, numPassengers, price);
        int confirmationNumber = generateConfirmationNumber();
        flight.setConfirmationNumber(confirmationNumber);
        this.flights.add(flight);
        System.out.println("Flight booked! Confirmation number: " + confirmationNumber);
    }

    public void bookHotel(int hotelId, String guestName, String location, String checkIn, String checkOut, int numGuests, double price) {
        Hotel hotel = new Hotel(hotelId, guestName, location, checkIn, checkOut, numGuests, price);
        int confirmationNumber = generateConfirmationNumber();
        hotel.setConfirmationNumber(confirmationNumber);
        this.hotels.add(hotel);
        System.out.println("Hotel booked! Confirmation number: " + confirmationNumber);
    }

    public void cancelReservation(int confirmationNumber) {
        for (Flight flight: this.flights) {
            if (flight.getConfirmationNumber() == confirmationNumber) {
                this.flights.remove(flight);
                System.out.println("Flight reservation with confirmation number " + confirmationNumber + " cancelled.");
                return;
            }
        }
        for (Hotel hotel: this.hotels) {
            if (hotel.getConfirmationNumber() == confirmationNumber) {
                this.hotels.remove(hotel);
                System.out.println("Hotel reservation with confirmation number " + confirmationNumber + " cancelled.");
                return;
            }
        }
        System.out.println("No reservation found with confirmation number " + confirmationNumber + ".");
    }

    private int generateConfirmationNumber() {
        Random rand = new Random();
        return rand.nextInt(900000) + 100000;
    }
}
