package ru.skypro;

public class Main {
    public static void main(String[] args) {
        // Задание1
        Base base = new Base();
        new TheFirstT(base);
        new TheSecondT(base);

        // Задание2
        Base2 base2 = new Base2();
        new TheThirdT(base2);
        new TheFourthT(base2);
    }
}
