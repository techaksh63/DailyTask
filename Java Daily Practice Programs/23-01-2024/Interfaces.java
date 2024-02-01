public class Interfaces {
    public static void main(String[] args) {
       Device device = new Computer();
        System.out.println("Brand Name: "+device.brand());
        System.out.println("Ram :"+device.ram());

        Device device1 = new Laptops();
        System.out.println("Brand Name: "+device1.brand());
        System.out.println("Ram :"+device1.ram());

        Server server = new Server();
        System.out.println("Brand Name: "+server.brand());
        System.out.println("Ram :"+server.ram());
        System.out.println("Component :"+server.component());

    }
}

interface Device{    //Interface class which having all the method default - public abstract
    String brand();      //all the property abstract without body
    int ram();
}

interface hardware{
    String component();
}

class Computer implements Device {    //Use implements keyword to inherit class and do override of behaviour of parent class
    public String brand() {
        return "HP";
    }
    public int ram() {
        return 8;
    }
}

class Laptops implements Device {    //Use implements keyword to inherit class and do override of behaviour of parent class
    public String brand() {
        return "Dell";
    }
    public int ram() {
        return 4;
    }
}

class Server implements Device, hardware{
    @Override
    public String brand() {
        return "AWS";
    }
    @Override
    public int ram() {
        return 512;
    }
    @Override
    public String component() {
        return "Physical Server";
    }
}

