/*
Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
 */
//Importar librería JOptionPane.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //Propiedades.
        int numero = 1;
        //Proceso.
        while (numero != 0){
            //Pedir datos.
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un númer: \n" +
                    "Para salir ingrese el número 0."));
            if (numero < 0){
                JOptionPane.showMessageDialog(null, "El número es negativo.");
            }
            if(numero > 0){
                JOptionPane.showMessageDialog(null,"El número es positivo.");
            }
        }
    }
}