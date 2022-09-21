package org.example;


import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CheckTriangleTest {


    @DataProvider(name = "forPositive")
    public static Object[][] forPositive() {
        return new Object[][]{{new CheckTriangle(1, 5, 6), true},
                {new CheckTriangle(1, 5, -6), false},
                {new CheckTriangle(25, 5, 6), true},
                {new CheckTriangle(1, -15, 6), false},
                {new CheckTriangle(30, 5, 6), true}};
    }

    @DataProvider(name = "forTriangle")
    public static Object[][] forTriangle() {
        return new Object[][]{{new CheckTriangle(10, 10, 10), true},
                {new CheckTriangle(25, 1, 1), false},
                {new CheckTriangle(25, 15, 16), true},
                {new CheckTriangle(1, 100, 1), false},
                {new CheckTriangle(30, 16, 16), true}};
    }

    @DataProvider(name = "forIsoscelesTriangle")
    public static Object[][] forNegative() {
        return new Object[][]{{new CheckTriangle(10, 11, 12), false},
                {new CheckTriangle(25, 15, 1), false},
                {new CheckTriangle(25, 16, 16), true},
                {new CheckTriangle(31, 100, 1), false},
                {new CheckTriangle(30, 30, 16), true}};
    }

    @DataProvider(name = "forEquilateralTriangle")
    public static Object[][] forEquilateralTriangle() {
        return new Object[][]{{new CheckTriangle(2.9f, 2.9f, 2.9f), true},
                {new CheckTriangle(10000, 10000, 10000), true},
                {new CheckTriangle(6, 6, 6), true},
                {new CheckTriangle(31, 100, 1), false},
                {new CheckTriangle(30, 30, 16), false}};
    }

    @DataProvider(name = "forNotTriangle")
    public static Object[][] forNotTriangle() {
        return new Object[][]{{new CheckTriangle(15, 100, 26), false},
                {new CheckTriangle(1, 10, 15), false},
               };
    }

    @Test(dataProvider = "forPositive")
    void isPositive(CheckTriangle checkTriangle, Boolean expected) {

        Assert.assertEquals(checkTriangle.isPositive(), expected);
    }

    @Test(dataProvider = "forTriangle")
    void isTriangle(CheckTriangle checkTriangle, Boolean expected) {

        Assert.assertEquals(checkTriangle.isTriangle(), expected);
    }

    @Test(dataProvider = "forIsoscelesTriangle")
    void isIsoscelesTriangle(CheckTriangle checkTriangle, Boolean expected) {

        Assert.assertEquals(checkTriangle.isIsoscelesTriangle(), expected);
    }

    @Test(dataProvider = "forEquilateralTriangle")
    void isEquilateralTriangle(CheckTriangle checkTriangle, Boolean expected) {

        Assert.assertEquals(checkTriangle.isEquilateralTriangle(), expected);
    }

    @Test(dataProvider = "forNotTriangle")
    void isNotTriangle(CheckTriangle checkTriangle, Boolean expected) {

        Assert.assertEquals(checkTriangle.isTriangle(), expected);
    }

//    @Test
//    void isNegative() {
//        System.out.println("Тест на негативные значения");
//        CheckTriangle checkTriangle = new CheckTriangle(56,-89,21);
//        assertFalse(checkTriangle.isPositive());
//    }
//
//    @Test
//    void isTriangle() {
//        System.out.println("Тест на треугольник");
//        CheckTriangle checkTriangle = new CheckTriangle(68.98f,75.36f,94.55f);
//        assertTrue(checkTriangle.isTriangle());
//    }
//
//    @Test
//    void isEquilateralTriangle() {
//        System.out.println("Тест на равносторонний треугольник");
//        CheckTriangle checkTriangle = new CheckTriangle(6,6,6);
//        assertTrue(checkTriangle.isEquilateralTriangle());
//    }
//
//    @Test
//    void isIsoscelesTriangle() {
//        System.out.println("Тест на равнобедренный треугольник");
//        CheckTriangle checkTriangle = new CheckTriangle(2.9f,6,6);
//        assertTrue(checkTriangle.isIsoscelesTriangle());
//    }
//
//    @Test
//    void isEqualsNull() {
//        System.out.println("Тест на нулевое значение");
//        CheckTriangle checkTriangle = new CheckTriangle(0,5,6);
//        assertFalse(checkTriangle.isPositive());
//    }
//
//    @Test
//    void isNotTriangle() {
//        System.out.println("Тест на треугольник");
//        CheckTriangle checkTriangle = new CheckTriangle(15,100,26);
//        assertFalse(checkTriangle.isTriangle());
//    }


}