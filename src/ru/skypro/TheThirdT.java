package ru.skypro;

// Задание2
public class TheThirdT implements Runnable {
    Base2 base2;

    TheThirdT(Base2 base2) {
        this.base2 = base2;
        new Thread(this, "TheThirdThread").start();
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            base2.get();
        }
    }
}
