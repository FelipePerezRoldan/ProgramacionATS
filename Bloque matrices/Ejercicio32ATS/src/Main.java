import javax.swing.*;
import java.text.MessageFormat;

/*
Utilizando dos matrices 5x9 y 9x5, cargar la primera y transponerla en la segunda.
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrizA = new int[5][9]; //Creamos la matriz inicial.
        int[][] matrizB = new int[9][5]; //Creamos la matriz final.
        StringBuilder matrizAResultado = new StringBuilder();//Recopilación de la matriz inicial.
        StringBuilder matrizBResultado = new StringBuilder();//Recopilación de la matriz final.
        for(int i = 0; i < matrizA.length; i++){//Llenamos la mantriz inicial.
            for(int j = 0; j < matrizA[0].length; j++){
                matrizA[i][j] = Integer.parseInt(JOptionPane.showInputDialog(MessageFormat.format("Ingrese el termina [{0},{1}] de la matriz A.",
                        i+1,j+1)));
                matrizAResultado.append(matrizA[i][j]);
                matrizAResultado.append(" ");
            }
            matrizAResultado.append("\n");
        }

        for(int i = 0; i < matrizB.length; i++){//Llenamos la mantriz inicial.
            for(int j = 0; j < matrizB[0].length; j++){
                matrizB[i][j] = matrizA[j][i];
                matrizBResultado.append(matrizB[i][j]);
                matrizBResultado.append(" ");
            }
            matrizBResultado.append("\n");
        }
        //Mostramos el resultado de la transposición.
        JOptionPane.showMessageDialog(null,MessageFormat.format("El resultado de transponer la matriz:\n" +
                "{0}\n" +
                "es:\n" +
                "{1}",
                matrizAResultado,
                matrizBResultado));
    }
}