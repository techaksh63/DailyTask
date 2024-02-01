public class Polymorphism {
    public static void main(String[] args) {
        Father f1 = new Father();
        Son s1 = new Son();

        f1.run();               //Compile time Polymorphism because it is checking method during compile time
        f1.run(25);       //Compile time Polymorphism

        s1.run();               //Run time Polymorphism because it is checking method during run time
        s1.run(20);       //Run time Polymorphism
    }
}

class Father{
    void run(){                      //first form of method
        System.out.println("Father is running");
    };

    void run(int speed){             //second form of method with same name and differing agrument - overloading
        System.out.println("Father is running at the speed of "+ speed);
    };
}

class Son extends Father{
    void run(){                      //third form of method with same name - overloading
        System.out.println("Son is running");
    }
}