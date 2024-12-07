package InterviewAttended;

import java.util.HashMap;
import java.util.Map;

public class Euronet {
    private final Object lock = new Object();
    private boolean evenTurn = false; // Flag to track whose turn it is

    public static void main(String[] args) {
        Euronet test = new Euronet();

        Runnable r1 = () -> {
            for (int i = 1; i <= 10; i += 2) {
                test.odd(i);
            }
        };

        Runnable r2 = () -> {
            for (int i = 2; i <= 10; i += 2) {
                test.even(i);
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }

    public void even(int num) {
        synchronized (lock) {
            while (!evenTurn) {
                try {
                    lock.wait(); // Wait until it's even's turn
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Even Thread: " + num);
            evenTurn = false; // Switch to odd's turn
            lock.notify(); // Notify the waiting thread (odd thread)
        }
    }

    public void odd(int num) {
        synchronized (lock) {
            while (evenTurn) {
                try {
                    lock.wait(); // Wait until it's odd's turn
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Odd Thread: " + num);
            evenTurn = true; // Switch to even's turn
            lock.notify(); // Notify the waiting thread (even thread)
        }
    }
}

