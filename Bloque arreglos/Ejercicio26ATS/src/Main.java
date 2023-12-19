/*
Crear una programa que lea por teclado una tabla de 10 números enteros y desplace N posiciones en el arreglo.
 */
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        int posiciones;
        for(int i = 0; i < 10; i++){ //Llenamos el arreglo.
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " + (i+1) + " número del arreglo."));
        }
        posiciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de posiciones que desea desplzar."));
        int[] posicioneSalvadas = new int[posiciones];
        for(int i = 10 - posiciones, j = 0; i < 10; i++, j++){ //Salvamos las posiciones.
            posicioneSalvadas[j] = arreglo[i];

        }
        for(int j = 0; j < posiciones; j++) {//Movemos el arreglo Nveces.
            for (int i = 9; i > 0; i--) {
                arreglo[i] = arreglo[i - 1];
            }
        }
        for (int i = 0; i < posiciones; i++){
            arreglo[i] = posicioneSalvadas[i];
        }
        JOptionPane.showMessageDialog(null,Arrays.toString(arreglo));
    }
}