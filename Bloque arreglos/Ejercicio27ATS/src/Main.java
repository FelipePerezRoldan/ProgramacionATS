/*
Leer por teclado una tabla de 10 elementos numéricos enteros y una posición entre 0 y 9.
Eliminar el elemento situado en la posición dada sin dejar huecos.
 */
import javax.swing.JOptionPane;
import java.text.MessageFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] elementos = new int[10];//Arreglo de los elementos.
        int posEliminar;
        int numeroEliminado;
        String[] ordinal = {"primer","segundo","tercer","cuarto","quinto","sexto","septimo","octavo","noveno","decimo"};
        for(int i = 0; i < 10; i++){ //lleno el arreglo.
            do{//Contro de inserción de números en rango establecido 0-9
                elementos[i] = Integer.parseInt(JOptionPane.showInputDialog(MessageFormat.format("Ingrese el {0} " +
                        "número del arreglo.", ordinal[i])));
                if(elementos[i] < 0 || elementos[i] > 9){
                    JOptionPane.showMessageDialog(null,MessageFormat.format("El {0} no está dentro" +
                            " del rango de números permitido, el cual es de 0-9.", elementos[i]));
                }
            }while(elementos[i] < 0 || elementos[i] > 9);
        }
        //Pedimos la posición a eliminar
        posEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la número de la posición que desea eliminar.")) - 1;
        numeroEliminado = elementos[posEliminar];//Guardamos el número eliminado.
        for(int i = posEliminar; i < 9; i++){
            elementos[i] = elementos[i+1];
        }
        elementos[9] = 0;
        JOptionPane.showMessageDialog(null,MessageFormat.format("Se ha eliminado fortuitamente el " +
                "número de la posición {0} que era el {1}.\nEl nuevo arreglo es {2}.", posEliminar + 1,numeroEliminado,
                Arrays.toString(elementos)));
    }
}