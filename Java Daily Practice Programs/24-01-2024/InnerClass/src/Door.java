public class Door {
    private Lock lock;

    public Door() {
        lock = new Lock(true);
    }

    public Lock getLock() {
        return lock;
    }

    public void shopStatus(){
        if(lock.isLock()){
            System.out.println("The Shop is Closed, please visit later.");
        }
        else{
            System.out.println("Welcome to the Shop, we are open.");
        }
    }

    class Lock{
        private boolean lock;
        public Lock(boolean lock) {
            this.lock = lock;
        }
        public boolean isLock() {
            return lock;
        }
        public void setLock(boolean lock) {
            this.lock = lock;
        }
    }


}
