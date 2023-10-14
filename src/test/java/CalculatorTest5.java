import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;


@DisplayName("calculator testing class")
class CalculatorTest5 extends Calculator {
    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
        System.out.println("create new calculator");
    }

    @AfterEach
    public void reset(){
        calculator = null;
        System.out.println("calculator = null");
    }

    @Test
    public void testAdd() {
        double result = calculator.add(2, 3);
        Assertions.assertEquals(5.0, result);
    }

    @Test
    @DisplayName("тест метода вычитания")
    void testMinus() {
        double result = calculator.minus(15, 5);
        Assertions.assertEquals(10.0, result);
    }

    @Test
    void testMultiply() {
        double result = calculator.multiply(7, 7);
        Assertions.assertEquals(49.0, result);
    }

    @Test
    void testDivide() {
        double result = calculator.divide(100, 5);
        Assertions.assertEquals(20.0, result);
    }


    @DisplayName("проверить число на четное")
    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10,11})
    void testEvenNumber(int num) {
       boolean result =  calculator.evenNumber(num);
       Assertions.assertEquals(true,result);
    }

    @Test
    @Tag("exception")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }


}