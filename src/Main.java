
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame(" Tu Calculadora de confianza");
        // conectar la interfaz con el main
        // e; contido del panel
        frame.setContentPane(new calculadora().mainpanel);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // para ajustar el tamaño
        frame.setSize(1020,850);
        // para una nueva dimension
        frame.setPreferredSize(new Dimension(540,330));


        frame.pack();
        // para q nos muestre la ventana de como nos esta quedando
        frame.setVisible(true);
    }
}