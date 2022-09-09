package org.example;

import java.util.Scanner;

public class Triangle {
    private Long sideA;
    private Long sideB;
    private Long sideC;
    private Scanner scanner;


    public Triangle() {
        scanner = new Scanner(System.in);
        System.out.println("Введите сторону А: ");
        sideA = enterSide();
        System.out.println("Введите сторону B: ");
        sideB = enterSide();
        System.out.println("Введите сторону C: ");
        sideC = enterSide();



    }

    public Long getSideA() {
        return sideA;
    }

    public Long getSideB() {
        return sideB;
    }

    public Long getSideC() {
        return sideC;
    }

    private Long enterSide(){

        Long side = null;
        while (true) {
            side = scanner.nextLong();
            if (side < 1){
                System.out.println("Вы ввели отрицательное число, либо равное нулю! повторите попытку: ");
                continue;

            }else break;

        }

        return side;
    }

    @Override
    public String toString() {
        return "Треугольник со сторонами:" +
                " " + sideA +
                ", " + sideB +
                ", " + sideC +
                ' ';
    }
}
