import javax.swing.*;
import java.text.MessageFormat;
import java.util.Arrays;

/*
Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
Cada grupo está commpuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de un grupo.
Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno que se encuntra en
la posición N.
 */
public class Main {
    public static void main(String[] args) {
        int n; //Posición del alumno buscado.
        double acum = 0; //Acumulardor.
        double media;
        String[][] alumnos = new String[5][4]; //Arreglo tipo tabla para alumnos y sus notas.
        String[] ordinal = {"primer","segundo","tercer","cuarto","quinto"};//Numeros ordinales de utilidad.
        for(int i = 0; i < 5; i++){//Llenado de la tabla/arreglo2d
            alumnos[i][0] = JOptionPane.showInputDialog(MessageFormat.format("Ingrese el nombre del {0} alumno", ordinal[i]));
            for (int j = 1; j < 4; j++){
                alumnos[i][j] = JOptionPane.showInputDialog(MessageFormat.format("Ingrese la nota del {0} semestre de {1}", ordinal[j-1],alumnos[i][0]));
            }
        }
        n = Integer.parseInt(JOptionPane.showInputDialog(MessageFormat.format(
                "Ingrese el indice del estudinte al cual le desea conocer la media en sus notas.\n" +
                "Sabiendo que:\n" +
                "1.{0}.\n" +
                "2.{1}.\n" +
                "3.{2}.\n" +
                "4.{3}.\n" +
                "5.{4}.",
                alumnos[0][0],
                alumnos[1][0],
                alumnos[2][0],
                alumnos[3][0],
                alumnos[4][0])))-1;
        for(int i = 1; i < 4;i++){
            acum += Double.parseDouble(alumnos[n][i]);
        }
        media = acum/3;
        JOptionPane.showMessageDialog(null,MessageFormat.format(
        "Las notas del estudiante {0} por trimestre son:\n" +
                "1->{0}.\n" +
                "2->{1}.\n" +
                "3->{2}.\n" +
                "Además, su promedio total es de:\n" +
                "{3}",
                alumnos[n][1],
                alumnos[n][2],
                alumnos[n][3],
                "" + media
        ));
    }
}