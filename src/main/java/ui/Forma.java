package ui;

import javax.swing.*;

public class Forma extends JFrame {

    private JPanel panel1; //si el nombre de la variable es el mismo que el field name se asocia directamente


    public Forma(){
        inicializarForma();
    }

    private void inicializarForma() {
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);//Centramos la ventana
    }

}
