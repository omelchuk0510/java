package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
       printThreeWords();
       checkSumSign();
       printColor();
       compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 15;
        int b = 8;
        int c = a + b;

        if(c >= 0) {
            System.out.println("Сумма положительная");
        } else if (c <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() {
        int value = 10;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 || value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }

    }

    static void compareNumbers() {
        int a = 14;
        int b = 26;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
