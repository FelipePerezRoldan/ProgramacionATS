/*
Leer 10 números enteros, guardarlos en un arreglo.
Debemos mostrarlos en el siguiente orden: el primero,
el último, el segundo, el penúltimo…
 */
import javax.swing.JOptionPane; //Importing JOptinePane.
import java.text.MessageFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // Creating Array
        int indexMax = 9; //Maximun index.
        int indexMin = 0; //Minimun index.
        for(int i = 0; i < 10; i++){ //fill the array.
            if (i % 2 == 0){ //Even indexes.
                numbers[indexMin] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the " + (i+1) + " number."));
                indexMin ++;
            }
            else {
                numbers[indexMax] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the " + (i+1) + " number."));
                indexMax--;
            }
        }
        JOptionPane.showMessageDialog(null,MessageFormat.format("The order of the truncated numbers is:\n{0}", Arrays.toString(numbers)));
    }
}