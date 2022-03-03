package com.ssu.kristina_surkova.lesson_01.task_01;

public class Class_1 {

    public static void main(String[] args) {
        Class_1 app = new Class_1();
        app.startApplication();
    }

    //заполнение массива
    public void startApplication() {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * ((-10) ^ i));
        }
    }

    //В массиве целых чисел поменять местами максимальный отрицательный элемент и минимальный положительный.
    public void getSwappedArray(int[] arr) {
        int max = -100, min = 0;
        for (int i = 0; i < 20; i++) {
            if (arr[i] < min && arr[i] > 0) {
                min = arr[i];
            }

            if (arr[i] > max && arr[i] < 0) {
                max = arr[i];
            }
        }
    }

    //В массиве целых чисел определить сумму элементов, состоящих на чётных позициях.
    public int getSumEvenElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 20; i += 2) {
            sum += arr[i];
        }

        return sum;
    }

    //В массиве целых чисел заменить нулями отрицательные элементы.
    public void replaceWithZeroes(int[] arr) {
        for (int i = 0; i < 20; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
    }

    //В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным.
    public void triplePositiveElement(int[] arr) {
        for (int i = 0; i < 19; i++) {
            if (arr[i] > 0 && arr[i + 1] < 0) {
                arr[i] *= 3;
            }
        }
    }

    //В массиве целых чисел найти разницу между средним арифметическим и значение минимального элемента.
    public double getDifference(int[] arr) {
        int sum = 0, min = 0;
        for (int i = 0; i < 20; i++) {
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return (sum / 20.0 - min);
    }

    //В массиве целых чисел вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные.
    public void getSpecialElements(int[] arr) {
        int count = 0;
        for (int i = 1; i < 18; i += 2) {
            for (int j = i + 2; j < 20; j += 2) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " " + i + " " + j);
                }
            }
        }
    }
}
