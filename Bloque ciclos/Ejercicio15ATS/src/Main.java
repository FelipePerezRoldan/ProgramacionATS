/*
Pedir 10 números y escribir la suma total.
 */
//Importamos librerias.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //propiedades.
        int numero;
        int acumulador = 0;
        for(int i = 1; i <= 10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " + i +" número."));
            acumulador += numero;
        }
        JOptionPane.showMessageDialog(null, "La suma de los 10 números ingresados es de: " + acumulador);
    }
}