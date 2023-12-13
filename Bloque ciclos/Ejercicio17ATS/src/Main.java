/*
Pedir 10 sueldos.
Sumarlos y ver cuantos son mayores a $1000.
 */
//Importar librerías.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
       int sueldo = 0;
       int acumulaor = 0;
       int mayor = 0;
       for (int i = 0 ; i < 10; i++){
           sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " + (i+1) + " sueldo."));
           if(sueldo >= 1000){
               mayor++;
           }
           acumulaor += sueldo;
       }
       JOptionPane.showMessageDialog(null,"La suma de los sueldos es: " + acumulaor + ".\n" +
               "La cantidad de sueldos mayores a 1000 es de: " + mayor + ".");
    }
}