import javax.swing.*;
import java.text.MessageFormat;

/*
Construir un programa que dirija el movimiento de un objeto en un tablero y actualice su posición. Los movimientos
posibles son Arriba, Abajo, Izquierda y Derecha. Tras cada movimiento, mostrará la nueva dirección y las coordenadas del
objeto en el tablero.
 */
public class Main {
    public static void main(String[] args) {
        Objeto juego = new Objeto();
        int seleccion = 0;

        do {
            seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione hacia que lado desea moverse:",
                    "Mueve el objeto", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Arriba", "Abajo", "Derecha", "Izquierda", "Salir"},
                    "Salir");
            if (seleccion == 0) {
                juego.Arriba();
            }
            if (seleccion == 1) {
                juego.Abajo();
            }
            if (seleccion == 2) {
                juego.Derecha();
            }
            if (seleccion == 3) {
                juego.Izquierda();
            }
            if (seleccion != 4) {
                JOptionPane.showMessageDialog(
                        null,
                        "El objeto se encuentra en las cordenadas:\n" +
                                "[" + juego.getPosX() + "," + juego.getPosY() + "]\n" +
                                "La ultima dirección seleccionada es:\n" +
                                juego.getDireccion());
            }
        } while (seleccion != 4);
    }
}