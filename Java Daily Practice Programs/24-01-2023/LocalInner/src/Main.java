public class Main {
    public static void main(String[] args) {

        Door door = new Door();

        if (door.isLocked("Test")){
            System.out.println("The door is closed, visit latter");
        }
        else{
            System.out.println("Welcome to the shop, we are opened");
        }
    }
}