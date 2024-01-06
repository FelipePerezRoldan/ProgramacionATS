import javax.swing.*;
import java.text.MessageFormat;

public class Atleta {
    //Propiedades
    private int numero;
    private String nombre;
    private double tiempoCarrera;

    //Funciones

    public Atleta(int numero, String nombre, double tiempoCarrera) {
        this.numero = numero;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public String mostrarDatosGanador() {
        return "Los datos del corredor más veloz son:\n" +
                "Numero: " + numero + "\n" +
                "Nombre: " + nombre + "\n" +
                "Tiempo: " + tiempoCarrera + "\n ";
    }

    public static int IndiceMasVeloz(Atleta[] atletas) {
        int indiceMasVeloz = 0;
        double tiempoMasVeloz = atletas[0].tiempoCarrera;
        for (int i = 1; i < atletas.length; i++) {
            if (tiempoMasVeloz > atletas[i].tiempoCarrera) {
                tiempoMasVeloz = atletas[i].tiempoCarrera;
                indiceMasVeloz = i;
            }
        }
        return indiceMasVeloz;
    }
}

