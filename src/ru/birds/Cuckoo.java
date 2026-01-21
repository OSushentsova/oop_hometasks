package ru.birds;

import java.util.Random;

class Cuckoo extends Bird {
    private Random random = new Random();

    @Override
    public void sing() {
        // Случайное количество от 1 до 10 (включительно)
        int count = random.nextInt(10) + 1;

        for (int i = 0; i < count; i++) {
            System.out.print("ку-ку");
            if (i < count - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}