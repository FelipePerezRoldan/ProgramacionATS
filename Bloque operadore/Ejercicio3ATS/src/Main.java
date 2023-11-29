/*
Hacer un programa que calcule el cuadrado de una suma.
 */
//Importar Scanner y math.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Instaciamos Scanner.
        Scanner sc = new Scanner(System.in);
        //Propiedades.
        float numeroA;
        float numeroB;
        float cuadradoDeLaSuma;
        //Toma de datos.
        System.out.println("Ingrese el primer termino: ");
        numeroA = sc.nextFloat();
        System.out.println("Ingrese el segundo termino: ");
        numeroB = sc.nextFloat();
        //Deducción del cuadrado de la suma.
        cuadradoDeLaSuma = (numeroA * numeroA) + (numeroB * numeroB) + (numeroB * numeroA * 2);
        //Damos el resultado.
        System.out.println("El cuadrado de la suma entre " + numeroA + " y " + numeroB + " es: ");
        System.out.println(cuadradoDeLaSuma);
    }
}