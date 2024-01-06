import javax.swing.*;
import java.text.MessageFormat;

/*
Construir un programa para una competencia de atletismo. El programa debe gestionar una serie de atletas caracterizados
por su número de atleta, nombre y tiempo de carrera. Al final, el programa debe mostrar los datos del atleta ganador de
la carrera.
 */
public class Main {
    public static void main(String[] args) {
        //Variable
        int cantidadCorredores;
        int numero;
        String nombre;
        double tiempoCarrera;
        //cantidad de corredores y arreglo para almacenarlos.
        cantidadCorredores = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de corredores en competencia:"));
        Atleta[] atletas = new Atleta[cantidadCorredores];
        //Guardar los atletas y sus datos.
        for (int i = 0; i < cantidadCorredores; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del competidor " + (i + 1) + " en la lista:"));
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del corredor " + (i + 1) + " en la lista:");
            tiempoCarrera = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo registrado del corredor " + (i + 1) + " en la lista:"));

            atletas[i] = new Atleta(numero, nombre, tiempoCarrera);
        }
        //mostramos el corredor más Veloz
        JOptionPane.showMessageDialog(
                null,
                atletas[Atleta.IndiceMasVeloz(atletas)].mostrarDatosGanador()
        );
    }
}
