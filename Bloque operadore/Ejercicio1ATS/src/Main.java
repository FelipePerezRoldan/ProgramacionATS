/*
Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales trabajadas y
su salario por hora.
*/
//Importamos la librería Scanner.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Lectura de datos por medio de escaner.
        Scanner sc = new Scanner(System.in);
        //Propiedades.
        double horas;
        double sueldoHora;
        double salario;
        //Recolpilación de datos.
        System.out.println("Ingrese sus horas semanales trabajadas:");
        horas = sc.nextDouble();
        System.out.println("Ingrese su sueldo por hora:");
        sueldoHora = sc.nextDouble();
        //Deducción del salario semanal.
        salario = horas * sueldoHora;
        System.out.println("Su salario es de: ");
        System.out.println(salario);
    }
}