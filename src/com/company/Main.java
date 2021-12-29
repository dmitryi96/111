package com.company;

public class Main { //Первое задание
    public static void main(String[] args) {
        System.out.println("Hello, World!!!");
        printThreeWords();
        chekSumSign();
        printColor();
        compareNumbers();
    }

    //Второе задание!
    public static void printThreeWords() {
        System.out.println("orange");
        System.out.println("Banana");
        System.out.println("Aplee");
    }

    //третье задание
    public static void chekSumSign() {
        int a = 2;
        int b = 3;
        int c = a + b;
        if (c >= 0) {
            System.out.println("сумма положительна");
        } else {
            System.out.println("сумма отрицатаельна");
        }
    }

    //четвертое задание!
    public static void printColor() {
        int value = 58;
        if (value <= 0) {
            System.out.println("Красный");
        } else {
            if (value > 0 & value <= 100) {
                System.out.println("желтый");
                if (value > 100) {
                    System.out.println("зеленыйй");
                }
            }
        }
    }

    //пятое заданиe
    public static void compareNumbers() {
        int a = 77;
        int b = 68;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
