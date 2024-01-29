public class TypeCasting {
    public static void main(String[] args){
       
       
        // This is the Example of Widening Casting
        int myInt1 = 9;
        double myDouble1;
        myDouble1 = myInt1;

        System.out.println(myInt1);
        System.out.println(myDouble1);



        // This is the Example of Narrowing Casting
        double myDouble2 = 8.454d;
        int myInt2 = (int) myDouble2;

        System.out.println(myDouble2);
        System.out.println(myInt2);
    }
}
