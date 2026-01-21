package ru.birds;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird cuckoo = new Cuckoo();
        Bird parrot = new Parrot("Привет, я попугай!");

        // Птицы поют (полиморфизм)
        System.out.println("Воробей поет:");
        sparrow.sing();

        System.out.println("\nКукушка поет:");
        cuckoo.sing();

        System.out.println("\nПопугай поет:");
        parrot.sing();
    }
}
