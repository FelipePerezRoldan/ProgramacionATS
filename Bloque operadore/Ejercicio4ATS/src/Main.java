/*
Construir un programa que calcule y muestre por pantalla las raíces de la ecuación de segundo grado con
coeficientes reales ax² + bx + c = 0."
*/
//Importar la librería Scanner y math.
import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Instanciar la librería Scanner;
        Scanner sc = new Scanner(System.in);
        //Propiedades.
        double coeficienteA;
        double coeficienteB;
        double coeficienteC;
        double primeraRaiz;
        double segundaRaiz;
        double determinante;
        String salida = "null";
        //Tomamos los datos.
        do {
            System.out.println("Ingrese el coeficiente del termino cuadratico: ");
            coeficienteA = sc.nextDouble();
            System.out.println("Ingrese el coeficiente del termino unitario: ");
            coeficienteB = sc.nextDouble();
            System.out.println("Ingrese el coeficiente del termino independiente: ");
            coeficienteC = sc.nextDouble();
            //Verificamos el determinante.
            determinante = (coeficienteB * coeficienteB) - (4 * coeficienteA * coeficienteC);
            if (determinante < 0){
                System.out.println("La ecuación de segundo grado no tiene soluciones reales,\n" +
                        "intente con otros coeficientes.");
                System.out.println("Para continuar oprima la tecla y para salir oprima la tecla n.");
                salida = sc.next();
            }
        }while(determinante < 0 && salida.equals("y"));
        //Deducción de las raices.
        if (salida.equals("y") || salida.equals("null")){
            primeraRaiz = (((-coeficienteB) + Math.sqrt(determinante))/(2*coeficienteA));
            segundaRaiz = (((-coeficienteB) - Math.sqrt(determinante))/(2*coeficienteA));
            System.out.println("Las raices de la ecuación: " + coeficienteA + "x²+" + coeficienteB + "x+" + coeficienteC + " son: \n" +
                    "X1 = " + primeraRaiz + "\n" +
                    "X2 = " + segundaRaiz);
        }
    }
}