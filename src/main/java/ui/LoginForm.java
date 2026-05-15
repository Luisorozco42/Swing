package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    public LoginForm() {
        inicializarForma();
        enviarBoton.addActionListener(e -> {
            validar();
        });
    }

    private void validar() {
        //leer los valores de la caja de textos
        String usuario = this.usuarioTexto.getText();
        var password = new String(this.passwordTexto.getPassword());

        if ("root".equals(usuario) && "admin".equals(password)) mostrarMensaje("Datos correctos,bienvenido!");
        else if ("root".equals(usuario)) mostrarMensaje("Password incorrecto, corregirlo");
        else mostrarMensaje("Usuario incorrectos, corregirlo");
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    private void inicializarForma() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);// centralizando
    }

}
