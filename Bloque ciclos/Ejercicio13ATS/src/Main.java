/*
Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
 */
//Importar JOptionPane.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //Propiedades.
        int numero;
        int acumulador = 0;
        //Ciclo
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            acumulador += numero;
        }while (numero != 0);
        JOptionPane.showMessageDialog(null,"La suma de los número ingresado es: " + acumulador);
    }
}