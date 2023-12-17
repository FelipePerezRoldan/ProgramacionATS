/*
Leer los datos correspondientes a dos tablas de 12 elementos
numéricos, y mezclarlos en una tercera de la forma: 3 de la Tabla A,
3 de la B, otros 3 de A, otros de la B. etc.
 */
import java.lang.reflect.Array;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner; //Instatiate.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayOne = new int[12]; //First Array.
        int[] arrayTwo = new int[12]; //Second Array.
        int[] arrayThree = new int[24]; //final array.

        for(int i = 0; i < 12; i++){
            System.out.print("Enter the " + (i+1) + " number of the first array: ");
            arrayOne[i] = sc.nextInt();
        }
        for(int i = 0; i < 12; i++){
            System.out.print("Enter the " + (i+1) + " number of the second array: ");
            arrayTwo[i] = sc.nextInt();
        }
        int jump = 0;
        for(int i = 0; i < 12; i+=3){
            arrayThree[jump] = arrayOne[i];
            jump++;
            arrayThree[jump] = arrayOne[i+1];
            jump++;
            arrayThree[jump] = arrayOne[i+2];
            jump++;
            arrayThree[jump] = arrayTwo[i];
            jump++;
            arrayThree[jump] = arrayTwo[i+1];
            jump++;
            arrayThree[jump] = arrayTwo[i+2];
            jump++;
        }
        System.out.println(MessageFormat.format("The mixed array is: \n {0}", Arrays.toString(arrayThree)));
    }
}