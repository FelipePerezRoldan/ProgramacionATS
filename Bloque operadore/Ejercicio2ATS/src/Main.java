/*
Una compañía de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales,
más una comisión de $150 por cada carro vendido, más el 5% del valor de la venta por carro.
Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes.
Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
*/
//Importamos Scanner.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Instanciamos Scanner.
        Scanner sc = new Scanner(System.in);
        //Propiedades.
        final double SALARIOMENSUAL = 1000;
        final double COMISIONPORCARRO = 150;
        final double COMISIONPORCENTUAL = 0.05;
        int carrosVendidos;
        double valorTotalCarrosVendidos;
        double salarioMensualVendedor;
        //Toma de datos.
        System.out.println("Ingrese la cantidad de carros vendidos: ");
        carrosVendidos = sc.nextInt();
        System.out.println("Ingrese la cantidad el costo total de los carros vendidos: ");
        valorTotalCarrosVendidos = sc.nextDouble();
        //Deducción del salario del vendedor.
        salarioMensualVendedor = SALARIOMENSUAL + (carrosVendidos * COMISIONPORCARRO) + (valorTotalCarrosVendidos * COMISIONPORCENTUAL);
        //Mostrar resultados.
        System.out.println("El salario mensual con los parametros: ");
        System.out.println("Carros vendidos: \n" + carrosVendidos);
        System.out.println("Costo total de los carros vendidos: \n" + valorTotalCarrosVendidos);
        System.out.println("Es: " + salarioMensualVendedor);
    }
}