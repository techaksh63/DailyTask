public class Hotel {
    private final int hotelId;
    private final String name;
    private final String location;
    private final String checkIn;
    private final String checkOut;
    private final int numGuests;
    private final double price;
    private int confirmationNumber;

    public Hotel() {
        this.hotelId = 1224;
        this.name = "Jay";
        this.location = "Mumbai";
        this.checkIn = "2024-01-30";
        this.checkOut = "2024-02-10";
        this.numGuests = 5;
        this.price = 5000;
    }

    public Hotel(int hotelId, String name, String location, String checkIn, String checkOut, int numGuests, double price) {
        this.hotelId = hotelId;
        this.name = name;
        this.location = location;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numGuests = numGuests;
        this.price = price;
    }

    public int getHotelId() {
        return hotelId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public double getPrice() {
        return price;
    }

    public int getNumGuests() {
        return numGuests;
    }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    @Override
    public String toString() {
        return "Hotel {" +
                "hotelId=" + hotelId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", checkIn='" + checkIn + '\'' +
                ", checkOut='" + checkOut + '\'' +
                ", numGuests=" + numGuests +
                ", price=" + price +
                ", confirmationNumber=" + confirmationNumber +
                '}';
    }
}