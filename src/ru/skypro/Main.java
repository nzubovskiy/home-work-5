package ru.skypro;

public class Main {

    // Задача №1
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        double[] array = {1.57, 7.654, 9.986};
        int[] numbers = {83, 56, 70, 34, 28, 69, 66};

        // Задача №2
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();

        for (int x = 0; x < array.length; x++) {
            if (x < array.length - 1) {
                System.out.print(array[x] + ", ");
            } else {
                System.out.print(array[x]);
            }
        }

        System.out.println();

        for (int y = 0; y < numbers.length; y++) {
            if (y < numbers.length - 1) {
                System.out.print(numbers[y] + ", ");
            } else {
                System.out.print(numbers[y]);
            }
        }

        System.out.println();

        //Задача №3

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();

        for (int x = array.length - 1; x >= 0; x--) {
            if (x > 0) {
                System.out.print(array[x] + ", ");
            } else {
                System.out.print(array[x]);
            }
        }

        System.out.println();

        for (int y = numbers.length - 1; y >= 0; y--) {
            if (y > 0) {
                System.out.print(numbers[y] + ", ");
            } else {
                System.out.print(numbers[y]);
            }
        }

        System.out.println();

        // Задача №4
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] % 2 != 0) {
                arr[a] = arr[a] + 1;
            }
            System.out.print(arr[a] + " ");
        }

    }
}
