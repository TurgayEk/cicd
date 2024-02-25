package com.example.cicd;
import org.junit.jupiter.api.*;
public class CalculatorTests {
    Calculator  calculator;

    @BeforeEach
    void beforeTests(){
        calculator=new Calculator();
    }

    @DisplayName("Adding two integers should return accurate sum value")
    @Test
    void addTwoIntTest(){
        int a=3;
        int b=9;
        int sum=calculator.add(a,b);
        Assertions.assertEquals(12,sum);
    }

    @DisplayName("Subtracting two integers should return accurate difference value")
    @Test
    void subtractTwoIntTest(){
        int a=8;
        int b=2;
        int difference=calculator.subtract(a,b);
        Assertions.assertEquals(6,difference);
    }

    @DisplayName("Multiplying two integers should return accurate product value")
    @Test
    void multiplyTwoIntTest(){
        int a=3;
        int b=4;
        int product=calculator.multiply(a,b);
        Assertions.assertEquals(12,product);
    }

    @DisplayName("Dividing two doubles should return accurate quotient value")
    @Test
    void divideTwoDoubleTest(){
        int a=20;
        int b=8;
        double quotient=calculator.divide(a,b);
        Assertions.assertEquals(2.5,quotient);
    }

    @DisplayName("Dividing a double to zero should return positive infinity")
    @Test
    void divideDoubleToZeroTest(){
        int a=20;
        int b=0;
        double quotient=calculator.divide(a,b);
        Assertions.assertEquals(Double.POSITIVE_INFINITY,quotient);
    }

    @DisplayName("Square root of a number should return accurate value")
    @Test
    void squareRootOfNumberTest(){
        int a=16;
        double square=calculator.squareRootOf(a);
        Assertions.assertEquals(4,square);
    }

    @DisplayName("Calculating the area of a circle with positive radius")
    @Test
    void getAreaPositiveNumberTest(){
        int a=4;
        double area=calculator.getArea(a);
        Assertions.assertEquals(50.27,area);
    }

    @DisplayName("Calculating the area of a circle with negative radius")
    @Test
    void getAreaNegativeNumberTest(){
        int a=-4;
        double area=calculator.getArea(a);
        Assertions.assertTrue(Double.isNaN(area));
    }
    @DisplayName("Calculating the Circumference of a circle with positive radius")
    @Test
    void getCircumferencePositiveTest(){
        int a=6;
        double circum=calculator.getCircumference(a);
        Assertions.assertEquals(37.7,circum);
    }

    @DisplayName("Calculating the Circumference of a circle with negative radius")
    @Test
    void getCircumferenceNegativeTest(){
        int a=-6;
        double circum=calculator.getCircumference(a);
        Assertions.assertTrue(Double.isNaN(circum));
    }
}
