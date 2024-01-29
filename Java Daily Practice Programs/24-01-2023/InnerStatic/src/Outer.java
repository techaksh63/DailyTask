public class Outer {
    public static void outerMethod(){
        System.out.println("Values of inner class static int is : "+Inner.y);
        Inner.testingInnerMethod();

    }
    public static class Inner{
        public static int y = 8;
        public static void testingInnerMethod(){

            System.out.println("Testing Inner class method");
        }
    }
}
