package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // task1(args);
        // task2(null);
    }

    private static void task1(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int number = iScanner.nextInt();
        int summ = 0;
        for (int i = 1; i <= number; i++) {
            summ += i;
        }
        String msg = ("Сумма чисел равна:  ");
        System.out.println(msg + summ);

    }

    private static void task2(int[] args) {

        for (int j = 1; j <= 1000; j++) {
            boolean simple = false;

            for (int i = 2; i * i <= j; i++) {
                simple = (j % i == 0);
                if (simple) {
                    break;
                }
            }
            if (!simple) {
                System.out.print(j + " ");
            }
        }
    }

}
