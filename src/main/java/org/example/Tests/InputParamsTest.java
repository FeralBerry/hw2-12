package org.example.Tests;

import org.example.Services.HomeService;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class InputParamsTest {
    public static class Plus{
        private final HomeService homeService = new HomeService();
        @Parameterized.Parameters
        public static Object[][] data() {
            return new Object[][]{
                    {3, 4, 7},
                    {4, 3, 7},
                    {8, 2, 10},
                    {-1, 4, 3},
                    {3256, 4, 3260}
            };
        }
        @Parameterized.Parameter()
        public int numberOne;
        @Parameterized.Parameter(1)
        public int numberTwo;
        @Parameterized.Parameter(2)
        public int expectedResult;
        @org.junit.Test
        public void plus() throws Exception {
            int actualResult = homeService.plus(numberOne, numberTwo);
            assertEquals(actualResult, expectedResult, 0);
        }
    }
    public static class Minus{
        private final HomeService homeService = new HomeService();
        @Parameterized.Parameters
        public static Object[][] data() {
            return new Object[][]{
                    {7, 4, 3},
                    {7, 3, 4},
                    {10, 2, 8},
                    {3, 4, -1},
                    {3260, 4, 3256}
            };
        }
        @Parameterized.Parameter()
        public int numberOne;
        @Parameterized.Parameter(1)
        public int numberTwo;
        @Parameterized.Parameter(2)
        public int expectedResult;
        @org.junit.Test
        public void minus() throws Exception {
            int actualResult = homeService.minus(numberOne, numberTwo);
            assertEquals(actualResult, expectedResult, 0);
        }
    }
    public static class Multiply{
        private final HomeService homeService = new HomeService();
        @Parameterized.Parameters
        public static Object[][] data() {
            return new Object[][]{
                    {3, 4, 12},
                    {4, 3, 12},
                    {8, 2, 16},
                    {-1, 4, -4},
                    {5, 4, 20}
            };
        }
        @Parameterized.Parameter()
        public int numberOne;
        @Parameterized.Parameter(1)
        public int numberTwo;
        @Parameterized.Parameter(2)
        public int expectedResult;
        @org.junit.Test
        public void multiply() throws Exception {
            int actualResult = homeService.multiply(numberOne, numberTwo);
            assertEquals(actualResult, expectedResult, 0);
        }
    }
    public static class Divide{
        private final HomeService homeService = new HomeService();
        @Parameterized.Parameters
        public static Object[][] data() {
            return new Object[][]{
                    {12, 4, 3},
                    {12, 3, 4},
                    {16, 2, 8},
                    {-4, 4, -1},
                    {20, 4, 5}
            };
        }
        @Parameterized.Parameter()
        public int numberOne;
        @Parameterized.Parameter(1)
        public int numberTwo;
        @Parameterized.Parameter(2)
        public int expectedResult;
        public void divide() throws Exception {
            int actualResult = homeService.divide(numberOne, numberTwo);
            assertEquals(actualResult, expectedResult, 0);
        }
    }
}
