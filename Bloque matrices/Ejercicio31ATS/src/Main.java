import javax.swing.*;
import java.awt.*;
import java.text.MessageFormat;

/*
Crear una matriz de 7x7 y rellenarla de forma que los elementos de la diagonal principal sea 1 y el resto 0.
 */
public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7]; //Creamos la matriz.
        StringBuilder resultado = new StringBuilder();
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = 0;
                if (i == j){
                    matriz[i][j] = 1;
                }
                resultado.append(matriz[i][j]);
                resultado.append(" ");
            }
            resultado.append("\n");
        }
        JOptionPane.showMessageDialog(null, MessageFormat.format("La matriz identidad de 7x7 es:\n{0}",resultado));
        System.out.println("Hello world!");
    }
}