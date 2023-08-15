package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import view.View;

public class Controller {
    // Atributos
    private Model model;
    private View view;

    // Constructor
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        // Asociar un ActionListener al botón de suma
        view.getAddButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAddition();
            }
        });

        // Asociar un ActionListener al botón de resta
        view.getSubtractButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSubtraction();
            }
        });

        // Asociar un ActionListener al botón de multiplicación
        view.getMultiplyButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateMultiplication();
            }
        });

        // Asociar un ActionListener al botón de división
        view.getDivideButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateDivision();
            }
        });
    }

    // Método para realizar la operación de suma
    public void calculateAddition() {
        int operand1 = view.getOperand1();
        int operand2 = view.getOperand2();

        model.setOperand1(operand1);
        model.setOperand2(operand2);

        int result = model.add();
        view.setResultField(String.valueOf(result));
    }

    // Método para realizar la operación de resta
    public void calculateSubtraction() {
        int operand1 = view.getOperand1();
        int operand2 = view.getOperand2();

        model.setOperand1(operand1);
        model.setOperand2(operand2);

        int result = model.subtract();
        view.setResultField(String.valueOf(result));
    }

    // Método para realizar la operación de multiplicación
    public void calculateMultiplication() {
        int operand1 = view.getOperand1();
        int operand2 = view.getOperand2();

        model.setOperand1(operand1);
        model.setOperand2(operand2);

        int result = model.multiply();
        view.setResultField(String.valueOf(result));
    }

    // Método para realizar la operación de división
    public void calculateDivision() {
        int operand1 = view.getOperand1();
        int operand2 = view.getOperand2();

        model.setOperand1(operand1);
        model.setOperand2(operand2);

        try {
            double result = model.divide();
            view.setResultField(String.valueOf(result));
        } catch (ArithmeticException e) {
            view.displayErrorMessage("Error: " + e.getMessage());
        }
    }
}
