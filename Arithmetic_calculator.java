import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticCalculator extends JFrame implements ActionListener {
    private JTextField numField1, numField2, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;
    
    public ArithmeticCalculator() {
        setTitle("Arithmetic Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));
        
        JLabel label1 = new JLabel("Number 1:");
        numField1 = new JTextField();
        JLabel label2 = new JLabel("Number 2:");
        numField2 = new JTextField();
        
        addButton = new JButton("Addition");
        subtractButton = new JButton("Subtraction");
        multiplyButton = new JButton("Multiplication");
        divideButton = new JButton("Division");
        
        resultField = new JTextField("Result: ");
        resultField.setEditable(false);
        
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        
        add(label1);
        add(numField1);
        add(label2);
        add(numField2);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(resultField);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(numField1.getText());
        double num2 = Double.parseDouble(numField2.getText());
        
        if (e.getSource() == addButton) {
            resultField.setText("Result: " + (num1 + num2));
        } else if (e.getSource() == subtractButton) {
            resultField.setText("Result: " + (num1 - num2));
        } else if (e.getSource() == multiplyButton) {
            resultField.setText("Result: " + (num1 * num2));
        } else if (e.getSource() == divideButton) {
            if (num2 != 0) {
                resultField.setText("Result: " + (num1 / num2));
            } else {
                resultField.setText("Cannot divide by zero");
            }
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ArithmeticCalculator calculator = new ArithmeticCalculator();
            calculator.setVisible(true);
        });
    }
}
