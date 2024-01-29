public class Main {
    public static void main(String[] args) {
            int x = 2;
            try{
                System.out.println("We don't know, what will be the outcome "+x/0);

            }catch(RuntimeException e){
                System.out.println("Runtime exception");

            }catch(Exception e){
                System.out.println("Exception!!!");
            }
            finally{
                System.out.println("Finally block always be printed");
                System.out.println();
            }
        System.out.println("This is all outside the Exception blocks");
    }
}