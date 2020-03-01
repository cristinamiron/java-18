package interfaces;



public interface Operator {
    double compute(double operand1, double operand2);

    boolean canHandle(String operator);

}
