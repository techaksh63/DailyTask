public class Flight {
    private final int flightNumber;
    private final String passengerName;
    private final String origin;
    private final String destination;
    private final String date;
    private final int numPassengers;
    private final double price;
    private int confirmationNumber;
    public Flight() {
        this.flightNumber = 1546;
        this.passengerName = "Aksh";
        this.origin = "India";
        this.destination = "China";
        this.date = "2024-02-01";
        this.numPassengers = 3;
        this.price = 15000;
    }
    public Flight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price) {
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.numPassengers = numPassengers;
        this.price = price;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public double getPrice() {
        return price;
    }
    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    @Override
    public String toString() {
        return "Flight {" +
                "flightNumber=" + flightNumber +
                ", passengerName='" + passengerName + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                ", numPassengers=" + numPassengers +
                ", price=" + price +
                ", confirmationNumber=" + confirmationNumber +
                '}';
    }
}
