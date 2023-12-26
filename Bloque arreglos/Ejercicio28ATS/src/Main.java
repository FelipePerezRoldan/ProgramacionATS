import javax.swing.*;
import java.lang.reflect.Array;
import java.text.MessageFormat;
import java.util.Arrays;

/*
Leer dos series de 10 entero que estarán ordenados crecientemente.
Fusionar las dos tablas en una tercera de forma que sigan ordenados.
 */
public class Main {
    public static void main(String[] args) {
        int auxiliar;
        int[] serieA = new int[20]; //Creación de arreglo para seria A.
        int[] serieB = new int[20];
        String[] ordinales = {"primer","segundo","tercer","cuarto","quinto","sexto","septimo","octavo","noveno","decimo"};

        for (int i = 0; i < serieA.length/2; i++){
            serieA[i] = Integer.parseInt(JOptionPane.showInputDialog(MessageFormat.format("Ingrese el {0} número del arreglo", ordinales[i]),"Serie A"));
            serieB[i] =  serieA[i];
        }
        for (int i = 10; i < serieA.length; i++){
            serieA[i] = Integer.parseInt(JOptionPane.showInputDialog(MessageFormat.format("Ingrese el {0} número del arreglo", ordinales[i-10]),"Serie B"));
            serieB[i] =  serieA[i];
        }
        for (int i = 0; i < serieA.length; i++){
            for(int j = 0; j < serieA.length; j++){
                if(serieA[i] <= serieA[j]){
                    auxiliar = serieA[i];
                    serieA[i] = serieA[j];
                    serieA[j] = auxiliar;
                }
            }
        }
        JOptionPane.showMessageDialog(null,MessageFormat.format("Los arreglos antiguos poseían el " +
                "siguiente orden:\n1.{0}\n2.{1}\n El nuevo arreglo compuesto y ordenado de forma ascendente es:\n{2} ",
                Arrays.toString(Arrays.copyOfRange(serieB,0,10)),Arrays.toString(Arrays.copyOfRange(serieB,10,20)),
                Arrays.toString(serieA)));
    }
}
