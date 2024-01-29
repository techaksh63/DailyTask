import java.lang.Math;
public class Maths {
    public static void main(String[] args){
     MathOperations M = new MathOperations();
     M.math();
    }
}

class MathOperations {
    int x = 5;
    int y = 10;

    void math(){

        //Max Value
        System.out.println(Math.max(x,y));

        //Min Value
        System.out.println(Math.min(x,y));

        //Square root
        System.out.print(Math.sqrt(x));

        //Absolute
        System.out.print(Math.abs(-4.7));

        //Random Number Generator
        int random = (int) (Math.random() * 101 );
    }
}