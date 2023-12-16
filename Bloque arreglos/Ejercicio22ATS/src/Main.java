/*
Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden inverso introducido.
 */
import java.util.Scanner; //Importamos Scanner.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Instanciamos la clase Scanner.
        int[] numeros = new int[5]; //Creamos el arreglo.
        for (int i = 5, j = 1; i > 0; i-- , j++){ //llenamos el arreglo.
            System.out.print(j + ". Ingrese un número: ");
            numeros[i-1] = sc.nextInt();
        }
        System.out.printf("El orden contrario de los números ingresados es:\n");
        for(int numero : numeros){// mostramos el arreglo.
            System.out.print(numero + "\n");
        }
    }
}