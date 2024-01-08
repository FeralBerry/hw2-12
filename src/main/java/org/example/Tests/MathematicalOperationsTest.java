package org.example.Tests;

import org.example.Services.HomeService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathematicalOperationsTest {
    private HomeService homeService = new HomeService();
    @Before
    public void setUp() {
        homeService = new HomeService();
    }
    @Test
    public void plus() {
        int a = 15; int b = 20;
        int expectedResult = 35;
        long result = homeService.plus(a, b);
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void minus(){
        int a = 20; int b = 15;
        int expectedResult = 5;
        long result = homeService.minus(a, b);
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void multiply(){
        int a = 10; int b = 15;
        int expectedResult = 150;
        long result = homeService.multiply(a, b);
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void divide(){
        int a = 150; int b = 15;
        int expectedResult = 10;
        long result = homeService.divide(a, b);
        Assert.assertEquals(expectedResult, result);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int a = 15; int b = 0;
        homeService.divide(a, b);
    }
}
