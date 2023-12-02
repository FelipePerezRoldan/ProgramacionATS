/*
Pedir una nota de cero a diez y mostrarla de la forma: Insuficiente, suficiente, bien, notable y sobresaliente.
 */
//Importar librería JOptionPane.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //Propiedades.
        double evaluacion;
        //Pedir datos.
        evaluacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su nota: "));
        //Evaluar la nota.
        if (evaluacion < 6 ){
            JOptionPane.showMessageDialog(null,"Nota insuficiente.");
        }
        if (evaluacion == 6 ){
            JOptionPane.showMessageDialog(null,"Nota suficiente.");
        }
        if (evaluacion >= 7 && evaluacion < 8 ){
            JOptionPane.showMessageDialog(null,"Nota Notable.");
        }
        if (evaluacion >= 8 && evaluacion <= 10 ){
            JOptionPane.showMessageDialog(null,"Nota sobresaliente.");
        }
    }
}