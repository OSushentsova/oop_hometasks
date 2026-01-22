package ru.birds;

public class Main {

    public static void makeBirdsSing(Bird... birds) {
        int birdNumber = 1;

        for (Bird bird : birds) {
            System.out.print("Птица №" + birdNumber + ": ");
            bird.sing();
            birdNumber++;
        }
    }

    public static void main(String[] args) {
        Bird sparrow1 = new Sparrow();
        Bird sparrow2 = new Sparrow();
        Bird sparrow3 = new Sparrow();

        Bird cuckoo1 = new Cuckoo();
        Bird cuckoo2 = new Cuckoo();

        Bird parrot1 = new Parrot("Привет, я попугай Кеша!");
        Bird parrot2 = new Parrot("Каррамба!");
        Bird parrot3 = new Parrot("Таити, Таити... Нас и здесь неплохо кормят!");

        makeBirdsSing(sparrow1, cuckoo1, sparrow2, parrot1, sparrow3, parrot2, cuckoo2, parrot3);

}
}

