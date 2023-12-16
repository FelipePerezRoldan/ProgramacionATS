/*
Pedir 5 calificaciones de alumbos y decir al final si hay algún suspenso.
 */
import javax.swing.JOptionPane; // Librería JOptionePane.
public class Main {
    public static void main(String[] args) {
        float calificacion; //La calificación del respectivo alumno.
        boolean haysuspensos = false; //Bandera para saber si hay algún suspendido.
        for(int i = 0; i < 5; i++){
            do {//Petición de datos y verificación de los mismos.
                calificacion = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificiación numero " + (i + 1) + ":"));
                if(calificacion < 0 || calificacion > 5) JOptionPane.showMessageDialog(null,"Nota fuera de rango.");
            }while (calificacion < 0 || calificacion > 5);
            if (calificacion < 3){//Bandera de verficación de aprovados.
                haysuspensos = true;
            }
        }
        if(haysuspensos) {//Respuesta al proceso.
            JOptionPane.showMessageDialog(null, "Hay almenos una persona que suspendió la materia.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Ninguna persona suspendió la materia.");
        }
    }
}