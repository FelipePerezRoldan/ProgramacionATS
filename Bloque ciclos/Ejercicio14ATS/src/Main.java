/*
Pedir un número N y mostrar todos los números del 1 al N.
 */
//Importar JOptionPane.
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Propiedades.
        int numero;
        String respuesta = "";
        //Proceder.
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        for (int i = 1; i <= numero; i++){
           respuesta += i + "\n";
        }
        JOptionPane.showMessageDialog(null,respuesta);
    }
}