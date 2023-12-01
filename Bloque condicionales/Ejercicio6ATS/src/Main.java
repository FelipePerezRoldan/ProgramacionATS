/*
Hacer un programa que tome dos números y diga si ambos son pares o impares.
 */
//Importamos la libreria JOptionPane.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //propiedades.
        int numeroUno;
        int numeroDos;
        //toma de datos;
        numeroUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primero número: "));
        numeroDos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        //Deducción de paridad o imparidad.
        if (numeroUno % 2 == 0){
            if (numeroDos % 2 == 0){
                JOptionPane.showMessageDialog(null, "Ambos números son pares.");
            }
            else{
                JOptionPane.showMessageDialog(null, "El primer número es par y el segundo impar.");
            }
        }
        else{
            if (numeroDos % 2 == 0){
                JOptionPane.showMessageDialog(null, "El primer número es impar y el segundo par.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Ambos números son impares.");
            }
        }
    }
}