package by.zantovich;

import static java.lang.Thread.sleep;

public class SecondThread implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from thread Runnable: " +
                        Thread.currentThread().getName());
                Thread.currentThread().sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
