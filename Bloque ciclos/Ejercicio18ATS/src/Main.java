/*
Pide un número del 0-10.
Entrega la tabla de multiplicar respectiva.
 */
import javax.swing.JOptionPane; //Libreria de interfaz gráfica.
public class Main {
    public static void main(String[] args) {
        int tabla = 0; //El número de la tabla buscada.
        String resultao = "La tabla de " + tabla + "es:\n" ; //Resultado final.
        tabla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tabla del 0-10, \nla cual desea conocer: "));//Ingresar el número de la tabla.
        for (int i = 0; i <= 10; i++){//Escribir la tabla y su respectivo resultado.
            resultao += i + "x" + tabla + "=" + (i*tabla) + "\n";//Acumulamos la tabla.
        }
        JOptionPane.showMessageDialog(null,resultao);//Mostramos el resultado.
    }
}