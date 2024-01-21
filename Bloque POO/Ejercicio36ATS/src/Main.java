import javax.swing.*;

/*
Crear un programa para simular un equipo de fútbol (futbolista, entrenador y doctor), para lo cual tendremos lo siguiente:

1. Una superclase Persona, que tendrá los siguientes datos: nombre, apellido, edad.
2. La subclase Futbolista tendrá los siguientes datos: dorsal y posición.
3. La subclase Entrenador tendrá como dato la estrategia que utiliza.
4. La subclase Doctor tendrá la titulación y los años de experiencia.

Hacer un menú donde se tengan las siguientes opciones: viaje de equipo, entrenamiento, partido de fútbol, planificar entrenamiento, curar lesión.
 */
public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        do {
            opcion = mostrarMenu();
            if (opcion < 1 || opcion > 6) {
                JOptionPane.showMessageDialog(null, "Error:\nLa opción ingresada no existe, intente de nuevo.");
            }
        } while (opcion != 6);
    }

    public static int mostrarMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("Inserte el número de la opción que desea realizar:\n");
        menu.append("1.Viaje de equipo.\n");
        menu.append("2.Entrenamiento.\n");
        menu.append("3.Partido de futbol.\n");
        menu.append("4.Planificar entrenamiento.\n");
        menu.append("5.Curar lesión.\n");
        menu.append("6.Salir.\n");
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
}