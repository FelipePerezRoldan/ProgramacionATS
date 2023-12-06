/*
Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
 */
//Importar el JOptionPane.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //Propiedad.
        int numero;
        int contador = 0;
        //Tomar datos y evaluar.
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            contador++;
        }while(numero >= 0);
        JOptionPane.showMessageDialog(null,"Se han introducido: " + contador + " números.");
    }
}