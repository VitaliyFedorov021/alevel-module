package ua.com.alevel.module.task3;

import java.util.Scanner;

public class Main {
    public static double sqr(double a) {
        return a * a;
    }
    public static double square(Point A, Point B, Point C) {
        double AB, AC, BC;
        AB = Math.sqrt(sqr(B.x - A.x) + sqr(B.y - A.y));
        AC = Math.sqrt(sqr(C.x - A.x) + sqr(C.y - A.y));
        BC = Math.sqrt(sqr(B.x - C.x) + sqr(B.y - C.y));
        double p = (AB + AC + BC) / 2;
        double res = Math.sqrt(p * (p - AB) * (p - BC) * (p - AC));
        return res;
    }
    public static void main(String[] args) {
        int x, y;
        Point A = new Point();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты точки A");
        while (!sc.hasNextInt()) {
            System.out.println("Некорректнный ввод, ввелите целое число");
            sc.next();
        }
        x = sc.nextInt();
        while (!sc.hasNextInt()) {
            System.out.println("Некорректнный ввод, ввелите целое число");
            sc.next();
        }
        y = sc.nextInt();
        A.setXY(x, y);
        int x1, y1;
        Point B = new Point();
        System.out.println("Введите координаты точки B");
        while (!sc.hasNextInt()) {
            System.out.println("Некорректнный ввод, ввелите целое число");
            sc.next();
        }
        x1 = sc.nextInt();
        while (!sc.hasNextInt()) {
            System.out.println("Некорректнный ввод, ввелите целое число");
            sc.next();
        }
        y1 = sc.nextInt();
        B.setXY(x1, y1);
        int x2, y2;
        Point C = new Point();
        System.out.println("Введите координаты точки C");
        while (!sc.hasNextInt()) {
            System.out.println("Некорректнный ввод, ввелите целое число");
            sc.next();
        }
        x2 = sc.nextInt();
        while (!sc.hasNextInt()) {
            System.out.println("Некорректнный ввод, ввелите целое число");
            sc.next();
        }
        y2 = sc.nextInt();
        C.setXY(x2, y2);
        double res = square(A, B, C);
        System.out.println("Площадь треугольника = " + res);
    }
}
