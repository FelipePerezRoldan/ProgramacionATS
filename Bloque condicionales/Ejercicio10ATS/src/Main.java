/*
Hacer un programa que pase de Kg a otra unidad de masa y mostrar en pantalla un menú con las opciones posibles.
 */
//Importar la librería JOptionPane.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //Propiedades.
        double kg;
        double slug;
        double g;
        double ton;
        int opcion;
        //Toma de datos y menú.
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al conversor de masa \n\n" +
                "Seleccione la opción de conversión que desee: \n" +
                "1. De Kg a slug.\n" +
                "2. De Kg a g.\n" +
                "3. De Kg a tonelada.\n" +
                "4. Salir.\n"));
        switch (opcion) {
            case 1:
                kg = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de kilogramos: "));
                JOptionPane.showMessageDialog(null, String.format("%.2f",kg) + "Kg son: " + String.format("%.2f",(kg * 0.68)) + "Slug.");
                break;
            case 2:
                kg = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de kilogramos: "));
                JOptionPane.showMessageDialog(null, String.format("%.2f",kg) + "Kg son: " + String.format("%.2f",(kg * 1000)) + "gramos.");
                break;
            case 3:
                kg = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de kilogramos: "));
                JOptionPane.showMessageDialog(null, String.format("%.2f",kg) + "Kg son: " + String.format("%.2f",(kg / 1000)) + "toneladas.");
                break;
            case 4:
                break;
            default:
                JOptionPane.showMessageDialog(null,"Has ingresado una opción incorrecta.");
        }
    }
}