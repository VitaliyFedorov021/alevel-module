package ua.com.alevel.module.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        while(!sc.hasNextInt()) {
            System.out.println("Некорректнный ввод, ввелите целое число");
            sc.next();
        }
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < arr.length; ++i) {
            while(!sc.hasNextInt()) {
                System.out.println("Некорректнный ввод, ввелите целое число");
                sc.next();
            }
            arr[i] = sc.nextInt();
        }
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count == 0) {
                result++;
            }
        }
        System.out.println(result);
    }
}
