package ru.skypro;

// Задание2
public class Base2 {
    int n2;
    boolean valueSet2 = false;

    synchronized int get() {
        while (!valueSet2)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение перехвачено.");
            }
        if (n2 % 7 == 0)
            System.out.println("YOU FORGOT TO EAT! " + n2 + " SECONDS HAVE PASSED!");
        valueSet2 = false;
        notify();
        return n2;

    }

    synchronized void put(int n2) {
        while (valueSet2)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение перехвачено.");
            }
        this.n2 = n2;
        valueSet2 = true;
        notify();
    }
}
