package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forma extends JFrame {

    private JPanel panelPrincipal; //si el nombre de la variable es el mismo que el field name se asocia directamente
    private JTextField campoTexto;
    private JLabel replicadorLable;


    public Forma(){
        inicializarForma();
        campoTexto.addActionListener(e -> { // tecnicamente se esta llamando cuando doy enter
            System.out.println("Se ejecuto el action listener");
        });
    }

    private void inicializarForma() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);//Centramos la ventana
    }

}
