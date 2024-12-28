package ru.allelleo;

import static ru.allelleo.SymbolFinder.countSpecialCharacters;

public class Main {
    public static void main(String[] args) {
        int count = countSpecialCharacters("Привет! Как думаешь сколько тут специальных символов? (тут больше чем 2), а вот моя почта - test@test.test");
        System.out.println(count);
    }
}