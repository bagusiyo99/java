package org.belajar;

public class Shop {

    Lock lock = new Lock ();



    public void setLock(Lock lock) {
        this.lock = lock;
    }

    public void shopStatus(){
        if (lock.isLocking()) {
            System.out.println("toko tutup ");
        }else{
            System.out.println("toko buka");
        }

    }

    public Lock getLock() {
        return lock;
    }
    public   class Lock {
        private boolean locking = true;

        public boolean isLocking() {
            return locking;
        }

        public void setLocking(boolean locking) {
            this.locking = locking;
        }
    }

}
