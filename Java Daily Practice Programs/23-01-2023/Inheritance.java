public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();    //method return from dog class
        d1.eat();     //method return form domestic class
        d1.Walk();    //method return form animal class

        Bike bike = new Bike("long", "Diesel",4, 5, 40, "LED");
        bike.run();
    }
}

class Animals{                                     //super parent class of dog
    void Walk(){
        System.out.println("Animal is walking");
    };
}

class Domestic extends Animals{                   // parent class of dog which extend form animal class
    void eat(){
        System.out.println("Domestic animal is eating");
    };
}

class Dog extends Domestic{   //dog class which extend domestic class which further extended form animal class
    void bark(){
        System.out.println("Dog is barking");
    }
}


class Vehicle {

    private String engine;
    private int wheels;
    private int seats;
    private int fuelTank;
    private String lights;

    public Vehicle() {
        this.engine = "petrol";
        this.wheels = 4;
        this.seats = 4;
        this.fuelTank = 35;
        this.lights = "LED";

    }

    public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {

        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTank = fuelTank;
        this.lights = lights;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public String getLights() {
        return lights;
    }

    public void run() {
        System.out.println("Running vehicle");
    }

}


class Bike extends Vehicle {
    private String handle;

    public Bike() {
        super();
        this.handle = "short";
    }

    public Bike(String handle, String engine, int wheels, int seats, int fuelTank, String lights) {
        super(engine, wheels, seats, fuelTank, lights);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    public String AllValues() {
        return "Bike [Handle=" + getHandle() + ", Engine=" + getEngine() + ", Wheels=" + getWheels()
                + ", Seats=" + getSeats() + ", FuelTank=" + getFuelTank() + ", Lights=" + getLights()
                + "]";
    }
    public void run() {
        System.out.println("Running bike");
        System.out.println(AllValues());
    }

}