package ru.birds;

import java.util.Random;

class Parrot extends Bird {

    private String text;
    private Random random = new Random();

    public Parrot(String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Текст для попугая не может быть пустым");
        }
        this.text = text;
    }

    @Override
    public void sing() {
        int n = random.nextInt(text.length()) + 1;
        System.out.println(text.substring(0, n));
    }}

