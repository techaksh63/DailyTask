public class Method {
    public static void main(String[] args){
        Man m1 = new Man();
        m1.eat();                     //calling method
        m1.walk();
        m1.walk(20);

        loop(2,8);
        System.out.print("********");
        loop(10,14);

        System.out.print("Area of Rectangle with length = 5.4 and width = 3.2 :"+areaRectangle(5.4,3.2));
        System.out.print("\nArea of square with side = 5 : :"+areaRectangle(5)+"\n");


        PrimeORNot P = new PrimeORNot();
       if (P.isPrimeORNot(7)){
           System.out.print("The number is Prime");
       }
       else {
           System.out.print("The number is Not Prime");
       }
    }

    public static void loop(int value, int finalValue){
        while(value<=finalValue){
            System.out.println(value);
            value++;
        }
    }

    public static double areaRectangle(double length, double width){
          return length*width;
    }
    public static double areaRectangle(int side){
          return side*side;
    }

}

class Man{
    void eat(){                                    // method or behaviour
        System.out.println("I am eating.");
    }

    void walk(){ 
        System.out.println("I am walking.");
    }

    void walk(int steps){
        System.out.println("I am walking " + steps + " steps");
    }
}


class PrimeORNot{
   public boolean isPrimeORNot(int num){
       int temp;
       boolean isPrime = true;
       for (int i=2;i<=num/2;i++){
          temp = num % i;
          if(temp == 0){
              isPrime = false;
              break;
          }
       }
       return isPrime;
   }
}