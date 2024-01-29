public class Abstraction {
    public static void main(String[] args) {
        Audi a1 = new Audi();
        BMW b1 = new BMW();

        a1.start();
        b1.start();
    }
}

class Audi extends Cars{
 
    @Override                                         //Abstract method form parent class - Cars is overriding 
    void start() {
       System.out.println("Audi is started");
    }
}

class BMW extends Cars{

    @Override                                        //Abstract method form parent class - Cars is overriding 
    void start() {
        System.out.println("BMW is started");
    }
    
}

abstract class Cars{    //Abstract class which have at list one abstract method and may have other behaviour and do not have object
    int price;
    abstract void start();                         //Abstract method which do not have it own behaviour
    public void run(){
        System.out.println("Car can run");
    }
}