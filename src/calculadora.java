import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton cuadradoButton;
    private JButton rectanguloButton;
    private JButton trianguloButton;
    private JButton circuloButton;
    private JButton romboButton;
    private JButton rectanguloButton1;
    private JButton trianguloButton1;
    private JButton circuloButton1;
    private JButton romboButton1;
    public JPanel mainpanel;
    private JLabel Resultado;

    // ----------------------------------AREAS DE LAS FIGURAS--------------


    public calculadora() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                Resultado.setText(String.valueOf(num1 * num1));
            }
        });
        rectanguloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                Resultado.setText(String.valueOf(num1 * num2));

            }
        });
        trianguloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                Resultado.setText(String.valueOf((num1 * num2)/2));
            }
        });
        circuloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                Resultado.setText(String.valueOf(num1*num1*3.1416));

            }
        });
        romboButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                Resultado.setText(String.valueOf((num1 * num2)/2));
            }
        });

        //---------------------- PERIMETRO DE LAS FIGURAS-----------------------------
        cuadradoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                Resultado.setText(String.valueOf(num1*4));

            }

        });


        rectanguloButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                Resultado.setText(String.valueOf((2*num1)+(2*num2)));
            }
        });
        trianguloButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());

                Resultado.setText(String.valueOf(3*num1));
            }
        });
        circuloButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                Resultado.setText(String.valueOf(num1*3.1416*2));
            }
        });
        romboButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());

                Resultado.setText(String.valueOf(Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2))+
                                                    Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2))+
                                                    Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2))+
                                                    Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2))));
            }
        });
    }


}
