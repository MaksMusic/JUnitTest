import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest extends Calculator {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(2, 3);
        Assertions.assertEquals(5.0, result);
    }

    @Test
    void testMinus() {
        Calculator calculator = new Calculator();
        double result = calculator.minus(15, 5);
        Assertions.assertEquals(10.0, result);
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(7, 7);
        Assertions.assertEquals(49.0, result);
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(100, 5);
        Assertions.assertEquals(20.0, result);
    }


}
