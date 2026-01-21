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

    @Override  // Важно: должна быть такая же видимость как в родителе (public)
    public void sing() {
        // N определяется случайно: не менее 1 и не более всех символов текста
        int n = random.nextInt(text.length()) + 1;

        // Выводим первые N символов
        System.out.println(text.substring(0, n));
    }}

