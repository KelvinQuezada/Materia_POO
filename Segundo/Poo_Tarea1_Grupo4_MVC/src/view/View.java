package view;
// Tendremos toda las librerias  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
//daremos a conocer todo los botones con JFrame
public class View extends JFrame {
    private JButton addButton; // Botón de suma
    private JButton subtractButton; // Botón de resta
    private JButton multiplyButton; // Botón de multiplicación
    private JButton divideButton; // Botón de división
    private JTextField operand1Field; // Campo de texto para el operando 1
    private JTextField operand2Field; // Campo de texto para el operando 2
    private JTextField resultField; // Campo de texto para el resultado

    public View() {
        initComponents();
        setTitle("Calculadora");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        JPanel panel = new JPanel();
        addButton = new JButton("Suma");
        subtractButton = new JButton("Resta");
        multiplyButton = new JButton("Multiplicación");
        divideButton = new JButton("División");
        operand1Field = new JTextField(10);
        operand2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        panel.add(operand1Field);
        panel.add(operand2Field);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(new JLabel("Resultado:"));
        panel.add(resultField);

        setContentPane(panel);
    }

    // Método para obtener el valor del operando 1
    public int getOperand1() {
        return Integer.parseInt(operand1Field.getText());
    }

    // Método para obtener el valor del operando 2
    public int getOperand2() {
        return Integer.parseInt(operand2Field.getText());
    }

    // Método para establecer el resultado en el campo de texto
    public void setResultField(String result) {
        resultField.setText(result);
    }

    // Método para mostrar un mensaje de error en un cuadro de diálogo
    public void displayErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Método para obtener el botón de suma
    public JButton getAddButton() {
        return addButton;
    }

    // Método para obtener el botón de resta
    public JButton getSubtractButton() {
        return subtractButton;
    }

    // Método para obtener el botón de multiplicación
    public JButton getMultiplyButton() {
        return multiplyButton;
    }

    // Método para obtener el botón de división
    public JButton getDivideButton() {
        return divideButton;
    }
}
