package com.ssu.kristina_surkova.lesson_01.task_01;

import java.util.Scanner;

public class Class_2 {

    private void PrintResult(double res) {
        System.out.println("Результат: " + res);
    }

    private int getNumber(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        String inputString = "";
        int num = Integer.MAX_VALUE;
        while (num == Integer.MAX_VALUE) {
            try {
                inputString = in.nextLine();
                num = Integer.parseInt(inputString);
            } catch (Exception e) {
                System.out.print(msg);
            }
        }

        return num;
    }

    //сумма
    private int getSum(int a, int b) {
        return a + b;
    }

    //разность
    private int getDifference(int a, int b) {
        return a - b;
    }

    //произведение
    private int getProductNumbers(int a, int b) {
        return a * b;
    }

    //частное
    private double getQuotientNumbers(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Class_2 app = new Class_2();
        app.startApplication();
    }

    public void startApplication() {
        int choice = 0;
        while (choice != 5) {
            int a = getNumber("Введите первое число = ");
            int b = getNumber("Введите второе число = ");
            choice = getNumber("""
                    Выберите действие:
                    \t1. Сложить
                    \t2. Вычесть
                    \t3. Умножить
                    \t4. Разделить
                    \t5. Выйти
                    Выбор:\s""");
            switch (choice) {
                case 1 -> PrintResult(getSum(a, b));
                case 2 -> PrintResult(getDifference(a, b));
                case 3 -> PrintResult(getProductNumbers(a, b));
                case 4 -> PrintResult(getQuotientNumbers(a, b));
                default -> {
                }
            }
        }
    }
}
