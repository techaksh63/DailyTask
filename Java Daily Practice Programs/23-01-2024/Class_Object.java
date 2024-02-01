public class Class_Object {
    public static void main(String[] args){
        Person p1 = new Person();  // This is the object of person class
        p1.age = 22;
        p1.name = "Aksh"; 
        System.out.println(p1.age + " " + p1.name);


        Truck truck = new Truck("closed","on","seated",10);
        System.out.println(truck.run());

    }
}

class Person {     // This is the person class, or we can say blueprint from which we can make many objects
    String name;   // This is the state of the class
    int age;
}

class Truck {
    private String doors;
    private String engine;
    private String driver;
    private int speed;

    public Truck(){
        doors = "opened";
        engine = "off";
        driver = "absent";
        speed = 0;
    }

    public Truck(String doors, String engine, String driver, int speed) {

        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
    public String getDoors() {
        return doors;
    }
    public void setDoors(String doors) {
        this.doors = doors;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getDriver() {
        return driver;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    public String run(){
        if(doors.equals("closed") && engine.equals("on")
                && driver.equals("seated") && speed >0	){
            return "running";
        }else
            return "not running";
    }
}