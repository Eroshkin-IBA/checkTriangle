package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckTriangleTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isPositive() {
        System.out.println("Тест на позитивные значения");
        CheckTriangle checkTriangle = new CheckTriangle(1,5,6);
        assertTrue(checkTriangle.isPositive());
    }

    @Test
    void isNegative() {
        System.out.println("Тест на негативные значения");
        CheckTriangle checkTriangle = new CheckTriangle(56,-89,21);
        assertFalse(checkTriangle.isPositive());
    }

    @Test
    void isTriangle() {
        System.out.println("Тест на треугольник");
        CheckTriangle checkTriangle = new CheckTriangle(68.98f,75.36f,94.55f);
        assertTrue(checkTriangle.isTriangle());
    }

    @Test
    void isEquilateralTriangle() {
        System.out.println("Тест на равносторонний треугольник");
        CheckTriangle checkTriangle = new CheckTriangle(6,6,6);
        assertTrue(checkTriangle.isEquilateralTriangle());
    }

    @Test
    void isIsoscelesTriangle() {
        System.out.println("Тест на равнобедренный треугольник");
        CheckTriangle checkTriangle = new CheckTriangle(2.9f,6,6);
        assertTrue(checkTriangle.isIsoscelesTriangle());
    }

    @Test
    void isEqualsNull() {
        System.out.println("Тест на нулевое значение");
        CheckTriangle checkTriangle = new CheckTriangle(0,5,6);
        assertFalse(checkTriangle.isPositive());
    }

    @Test
    void isNotTriangle() {
        System.out.println("Тест на треугольник");
        CheckTriangle checkTriangle = new CheckTriangle(15,100,26);
        assertFalse(checkTriangle.isTriangle());
    }


}