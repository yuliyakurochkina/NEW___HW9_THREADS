package ru.skypro;

// Задание1
public class Base {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение перехвачено.");
            }
        if (n % 5 == 0)
            System.out.println("WAKE UP! " + n + " SECONDS HAVE PASSED!");
        valueSet = false;
        notify();
        return n;

    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение перехвачено.");
            }
        this.n = n;
        valueSet = true;
        System.out.println("The first thread: " + n + " seconds.");
        notify();
    }
}
