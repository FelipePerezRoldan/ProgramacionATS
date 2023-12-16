/*
Pedir un número N, introducir N sueldo, y mostrar el sueldo máximo.
 */
import javax.swing.JOptionPane; // Importamos JOptionePane.
public class Main {
    public static void main(String[] args) {
        int N; //Numero de sueldos que se introducirán.
        int sueldoN; //Enesimo sueldo.
        int sueldoMax = 0; //Sueldo máximo.
        int sueldoMaxPos = 0;
        //Tomamos la cantidad de sueldos que se desean introducir.
        N = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de sueldos que desea ingresar:"));
        for (int i = 0; i < N; i++){//Repetimos la petición de sueldo N veces.
            sueldoN = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " + (i+1) + " sueldo:"));
            if(sueldoMax < sueldoN){
                sueldoMax = sueldoN;
                sueldoMaxPos = (i+1);
            }
        }
        JOptionPane.showMessageDialog(null, "El sueldo mayor fue el ingresado en la posición: " +
                sueldoMaxPos +
                "y corresponde a " + sueldoMax);
    }
}