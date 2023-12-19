/*
Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 números.
Después se debe pedir  un número y una posición, insertarlo en la posición indicada desplazando los que estén detrás.
 */
import javax.swing.JOptionPane;
import java.text.MessageFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] elementos = new int[10]; //Arreglo de elementos inicial.
        int numeroExtra;
        int numeroExtraPos;
        int auxilar;

        for (int i = 0; i < 8; i++){ //Llenamos el arrelgo.
            elementos[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " + (i+1) + " termino del arreglo."));
        }
        //Pedimos el numero extra y su posición.
        numeroExtra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número que desea insertar en el arreglo."));
        numeroExtraPos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición del 1 al 10 en la cual desea insertarlo."));
        //Ordenamos el arreglo.
        for(int i = 8  ; i > numeroExtraPos - 1 ; i--){
            elementos[i] = elementos [i - 1];
        }
        elementos[numeroExtraPos - 1] = numeroExtra;
        JOptionPane.showMessageDialog(null, MessageFormat.format("El arreglo inicial es: {0}", Arrays.toString(elementos)));
    }
}