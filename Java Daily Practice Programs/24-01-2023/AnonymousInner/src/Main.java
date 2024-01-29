public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        if (door.getLock().isUnlocked("Qrious")){
            System.out.println("Welcome to the shop, we are opened");
        }else {
            System.out.println("We are closed, visit later");
        }
    }
}