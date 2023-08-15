package model;

public class Model {
    // Atributos
    private int operand1;
    private int operand2;

    // Método getter para obtener el valor de operand1
    public int getOperand1() {
        return operand1;
    }

    // Método setter para asignar un valor a operand1
    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    // Método getter para obtener el valor de operand2
    public int getOperand2() {
        return operand2;
    }

    // Método setter para asignar un valor a operand2
    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    // Método para realizar la operación de suma
    public int add() {
        return operand1 + operand2;
    }

    // Método para realizar la operación de resta
    public int subtract() {
        return operand1 - operand2;
    }

    // Método para realizar la operación de multiplicación
    public int multiply() {
        return operand1 * operand2;
    }

    // Método para realizar la operación de división
    public double divide() {
        if (operand2 == 0) {
            throw new ArithmeticException("División por cero no está permitida");
        }
        return (double) operand1 / operand2;
    }
}