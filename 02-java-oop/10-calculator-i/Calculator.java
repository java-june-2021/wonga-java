public class Calculator {
    private Double operandOne;
    private Character operation;
    private Double operandTwo;
    private Double results;
    public Calculator(Double operandOne, Character operation, Double operandTwo){
        this.operandOne = operandOne;
        this.operation = operation;
        this.operandTwo = operandTwo;
    }
    public Calculator(){
        this.operandOne = 0.0;
        this.operation = '+';
        this.operandTwo = 0.0;
    }

    public void performOperation(){
        if(this.operation == '+'){
            results = operandOne + operandTwo;
        }
        if(this.operation == '-'){
            results = operandOne - operandTwo;
        }
        if(this.operation == '*'){
            results = operandOne*operandTwo;
        }
        if(this.operation == '/'){
            results = operandOne/operandTwo;
        }
    }

    public void getResults(){
        System.out.println(results);
    }

    public void setOperandOne(Double num){
        this.operandOne = num;
    }
    public void setOperandTwo(Double num){
        this.operandTwo = num;
    }
    public void setOperation(Character operand){
        this.operation  = operand;
    }
}