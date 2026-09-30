public class Main {
    public static void main(String[] args) {

        //Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Задача 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Задача 3
        for (int i = 0; i < 17; i+=2) {
            System.out.println(i);
        }

        //Задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Задача 5
        for (int i = 1904; i <= 2096; i++) {
            if ((i % 4 == 0 && i % 100 != 0)|| i % 400 == 0) {
                System.out.println(i + " год является високосным.");
            }
        }

        for (int i = 1904; i <= 2096; i+=4) {
            System.out.println(i + " год является високосным.");
        }

        //Задача 6
        for (int i = 7; i < 100; i+=7) {
            System.out.println(i);
        }

        //Задача 7
        for (int i = 1; i < 550; i*=2) {
            System.out.println(i);
        }

        //Задача 8
        for (int i = 1; i <= 12; i++) {
            int investmentAmount = 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (i * investmentAmount) + " рублей.");
        }

        //Задача 9
        int investmentAmount = 29000;
        float accumulatedAmount = 0f;
        for (int i = 1; i <= 12; i++) {
            accumulatedAmount = accumulatedAmount * 1.01f + investmentAmount;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + accumulatedAmount + " рублей.");
        }

        //Задача 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (i * 2));
        }

    }
}