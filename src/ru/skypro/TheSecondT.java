package ru.skypro;

// Задание1
public class TheSecondT implements Runnable {
    Base base;

    TheSecondT(Base base) {
        this.base = base;
        new Thread(this, "TheSecondThread").start();
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            base.get();
        }
    }
}
