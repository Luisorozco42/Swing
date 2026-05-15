package gm;

import com.formdev.flatlaf.FlatDarculaLaf;
import ui.Forma;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        FlatDarculaLaf.setup();// Laf signigica look and feel (tecnicamente es para poner en modo oscuro)
        Forma forma = new Forma();

        forma.setVisible(true);
    }
}
