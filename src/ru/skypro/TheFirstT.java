package ru.skypro;

// Задание1
public class TheFirstT implements Runnable {
    Base base;

    TheFirstT(Base base) {
        this.base = base;
        new Thread(this, "TheFirstThread").start();
    }

    public void run() {
        int i = 1;
        while (true) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            base.put(i++);
        }
    }
}
