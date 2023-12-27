import javax.swing.*;
import java.text.MessageFormat;

/*
Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrizA = new int[3][3]; //Creamos la matriz A
        int[][] matrizB = new int[3][3]; //Creamos la matriz B
        StringBuilder suma = new StringBuilder(); //Variable para almacenar el resultado.

        for (int i = 0; i < matrizA.length; i++){ //Pedimos los elementos que componen la matriza A.
            for (int j = 0; j < matrizA[0].length; j++){
                matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog(MessageFormat.format("Ingrese el número" +
                        " de la matriz A en la posición [{0},{1}]", i+1,j+1)));
            }
        }
        for (int i = 0; i < matrizB.length; i++){ //Pedimos los elementos que componen la matriza B.
            for (int j = 0; j < matrizB[0].length; j++){
                matrizB[i][j] = Integer.parseInt(JOptionPane.showInputDialog(MessageFormat.format("Ingrese el número" +
                        " de la matriz B en la posición [{0},{1}]", i+1,j+1)));
            }
        }

        for (int i = 0; i < matrizA.length; i++){ //Sumar las matices y mostrar la matriz final.
            for (int j = 0; j < matrizA[0].length; j++){
                suma.append(String.valueOf(matrizA[i][j] + matrizB[i][j])).append(" ");
            }
            suma.append("\n");
        }
        JOptionPane.showMessageDialog(null,MessageFormat.format("La suma de las matrices A y B es:\n{0}",suma));
    }
}