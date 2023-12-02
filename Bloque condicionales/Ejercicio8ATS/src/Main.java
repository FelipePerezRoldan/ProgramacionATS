/*
Pedir el día, mes y año de una fecha y verificar si la fecha es correcta.
Con meses de 28, 30 y 31 días. Sin años bisiestos.
 */
//Importamos la librería JOptionPane.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //Propiedades.
        int dia;
        int mes;
        int year;
        boolean fechaCorrecta = true;
        //ingresar datos.
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));
        //Deducción.
        if(mes == 2) {
            if (dia < 0 || dia > 28) {
                JOptionPane.showMessageDialog(null, "El día está mal.");
                fechaCorrecta = false;
            }
            if (year == 0) {
                JOptionPane.showMessageDialog(null, "El año está mal.");
                fechaCorrecta = false;
            }
        }
        if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia < 0 || dia > 30) {
                JOptionPane.showMessageDialog(null, "El día está mal.");
                fechaCorrecta = false;
            }
            if (year == 0) {
                JOptionPane.showMessageDialog(null, "El año está mal.");
                fechaCorrecta = false;
            }
        }
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia < 0 || dia > 31) {
                JOptionPane.showMessageDialog(null, "El día está mal.");
                fechaCorrecta = false;
            }
            if (year == 0) {
                JOptionPane.showMessageDialog(null, "El año está mal.");
                fechaCorrecta = false;
            }
        }
        if(mes < 0 || mes > 12){
            if (fechaCorrecta == true){
                JOptionPane.showMessageDialog(null, "La fecha es correcta.");
            }else{
                JOptionPane.showMessageDialog(null, "El mes está mal.");
            }
        }
    }
}