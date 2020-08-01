package ua.com.alevel.module.task2;

import java.util.Scanner;

public class Main {
    public static boolean isPossible(int a, int b, int c, int d) {
        boolean res = false;
        if ((a - 1 == c || a + 1 == c) && (b - 2 == d || b + 2 == d)) {
            res = true;
        } else if ((a - 2 == c || a + 2 == c) && (b - 1 == d || c + 1 == d)){
            res = true;
        }
        else{
            res = false;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите начальное положение коня");
        while (!sc.hasNextInt()) {
            System.out.println("Некорректнный ввод, ввелите целое число");
            sc.next();
        }
        int a = sc.nextInt();
        while (!sc.hasNextInt()) {
            System.out.println("Некорректнный ввод, ввелите целое число");
            sc.next();
        }
        int b = sc.nextInt();
        System.out.println("Введите положение, куда конь должен попасть");
        while (!sc.hasNextInt()) {
            System.out.println("Некорректнный ввод, ввелите целое число");
            sc.next();
        }
        int c = sc.nextInt();
        while (!sc.hasNextInt()) {
            System.out.println("Некорректнный ввод, ввелите целое число");
            sc.next();
        }
        int d = sc.nextInt();
        boolean res = isPossible(a, b, c, d);
        System.out.println(res);
    }
}
