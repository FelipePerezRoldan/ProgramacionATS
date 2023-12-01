/*
Pedir un número entre 0 y 99999 y decir cuántas cifras tiene.
 */
//Importar el JOptionPane.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //Propiedades
        int numero;
        //Ingresar datos.
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a evaluar: "));
        //Deducción y respuesta.
        if (numero >= 0 && numero < 10){
            JOptionPane.showMessageDialog(null, "El número es de una sola cifra.");
        }
        if (numero >= 10 && numero < 100){
            JOptionPane.showMessageDialog(null, "El número es de dos cifras.");
        }
        if (numero >= 100 && numero < 1000){
            JOptionPane.showMessageDialog(null, "El número es de tres cifras.");
        }
        if (numero >= 1000 && numero < 10000){
            JOptionPane.showMessageDialog(null, "El número es de cuatro cifras.");
        }
        if (numero >= 10000 && numero < 100000){
            JOptionPane.showMessageDialog(null, "El número es de cinco cifras.");
        }
    }
}