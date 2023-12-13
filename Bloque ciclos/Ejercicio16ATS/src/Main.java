/*
Pedir un numero y calcular su factorial.
 */
//Importar librerias.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int factorial;
        long acumulador = 1;
        factorial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número al cual desea hayarle el factorial: "));
        for (int i = 1 ; i <= factorial; i++){
            acumulador *= i;
        }
        JOptionPane.showMessageDialog(null,"El factorial de " + factorial + " es: " + acumulador);
    }
}