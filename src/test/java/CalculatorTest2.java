import org.junit.jupiter.api.*;


class CalculatorTest2 extends Calculator {
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
}