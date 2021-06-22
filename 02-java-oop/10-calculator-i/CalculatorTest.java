public class CalculatorTest {
    public static void main(String[] args) {
    Calculator calculations = new Calculator();
    calculations.setOperandOne(10.5);
    calculations.setOperation('+');
    calculations.setOperandTwo(5.2);
    calculations.performOperation();
    calculations.getResults();
    }
}
