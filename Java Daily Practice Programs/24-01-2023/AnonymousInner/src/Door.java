public class Door {
     private Lock lock = new Lock() {
        @Override
        public boolean isUnlocked(String keycode) {
            if(keycode.equals("Qrious")){
                return true;
            } else {
                return false;
            }
        }
    };
    public Lock getLock() {
        return lock;
    }
}

abstract class Lock{
    public abstract boolean isUnlocked(String keycode);
    public void test(){
        System.out.println("Test");
    }
}
