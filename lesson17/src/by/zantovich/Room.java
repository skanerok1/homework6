package by.zantovich;

public class Room {
    private static Room room = new Room();
    private Seat seat = new Seat();

    public static Room getInstance() {
        return room;
    }


    public synchronized void occupy() {
        Thread thread = Thread.currentThread();
        System.out.println(Thread.currentThread().getName() + " calls occupy()");
        try {
            if(thread.getName().equals("Man")) {
                seat.wait(5000);
                System.out.println(thread.getName() + " in wait");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void release() {
        synchronized (seat) {

        }
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "call release");
        if (thread.getName().equals("Woman")) {
            seat.notifyAll();
        }
    }

}


class Seat {

}
