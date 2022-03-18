package ru.skypro;

// Задание2
public class TheFourthT implements Runnable {
    Base2 base2;

    TheFourthT(Base2 base2) {
        this.base2 = base2;
        new Thread(this, "TheThirdThread").start();
    }

    public void run() {
        int i = 1;
        while (true) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            base2.put(i++);
        }
    }
}
