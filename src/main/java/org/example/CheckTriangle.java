package org.example;

import java.util.Scanner;

public  class CheckTriangle {
    private enum TriangleTypes {
        EQUILATERAL_TRIANGLE("равносторонний треугольник"),
        ISOSCELES_TRIANGLE("равнобедренный треугольник"),
        VERSATILE_TRIANGLE("разносторонний треугольник");

        String type;

        TriangleTypes(String type) {
            this.type = type;
        }
    }


    private float a;
    private float b;
    private float c;
    private Scanner scanner;

    public CheckTriangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public CheckTriangle() {
        scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        System.out.println("число 1: ");
        this.a = scanner.nextFloat();
        System.out.println("число 2: ");
        this.b = scanner.nextFloat();
        System.out.println("число 3: ");
        this.c = scanner.nextFloat();
    }

    public Boolean isPositive() {
        if (a > 0 && b > 0 && c > 0) {
            return true;
        } else return false;
    }

    public Boolean isTriangle() {
        if (a + b > c &&
                a + c > b &&
                b + c > a
        ) {
            return true;
        } else return false;
    }

    public Boolean isEquilateralTriangle() {
        if (a == b &&
                b == c &&
                c == a) {
            return true;
        } else return false;
    }

   public Boolean isIsoscelesTriangle() {
        if (a == b && a != c ||
                b == c && c != a ||
                c == a && c != b) {
            return true;
        } else return false;
    }


    public void triangleType() {



        if ( isPositive() && isTriangle()) {
            if (isEquilateralTriangle()) {
                System.out.println("Это " + TriangleTypes.EQUILATERAL_TRIANGLE.type);
            } else if (isIsoscelesTriangle()) {
                System.out.println("Это " + TriangleTypes.ISOSCELES_TRIANGLE.type);
            } else System.out.println("Это " + TriangleTypes.VERSATILE_TRIANGLE.type);
        } else System.out.println("Это не треугольник");
    }

    @Override
    public String toString() {
        return "" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ' ';
    }
}
