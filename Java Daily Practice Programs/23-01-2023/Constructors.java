public class Constructors {
    public static void main(String[] args) {
        Car c1 = new Car(110);  
        Car c2 = new Car(500, "Ferrari");
    }
}


class Car {
    static int a;                               // Static keyword use to define a class property not depend on object
    int speed;
    String model;
    Car(){                                      // Default Constructure with no argument
        System.out.println("I am simple car");  
    };
    Car(int a){                                 // Constructor with int argument
        this();                                 // Calling the default constructor form another constructor
        System.out.println("Car run at the speed of " + a);
    };
    Car(int speed, String model){
        this.speed = speed;                    // Static keyword is also used for showing current class property
        this.model = model;
       System.out.println(model + " is running at the speed of "+ speed);
    }
}