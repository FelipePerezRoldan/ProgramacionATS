import javax.swing.*;
import java.text.MessageFormat;

/*
Construir un programa para trabajar con dos números complejos e implementar el siguiente menú:

1. Sumar dos números complejos.
2. Multiplicar dos números complejos.
3. Comparar dos números complejos (iguales o no).
4. Multiplicar un número complejo por un entero.
 */
public class Main {
    public static void main(String[] args) {
        int eleccion;
        do {
            eleccion = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            "Seleccione el la opción del menú que desee utilizar:\n" +
                                    "1. Sumar dos números complejos.\n" +
                                    "2. Multiplicar dos números complejos.\n" +
                                    "3. Comparar dos números complejos (iguales o no).\n" +
                                    "4. Multiplicar un número complejo por un entero.\n" +
                                    "0. Para salir.\n",
                            "Ingrese su elección",
                            JOptionPane.QUESTION_MESSAGE
                    )
            );
            //Menú.
            if (eleccion > 4 || eleccion < 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "La opción seleccionada es incorrecta\n" +
                                "intente de nuevo.",
                        "¡Error!",
                        JOptionPane.ERROR_MESSAGE
                );
            } else {
                menu(eleccion);
            }
        } while (eleccion != 0);
        //Procesos según elección.
    }

    public static void menu(int eleccion) {
        OperacionCompleja oc = new OperacionCompleja();
        if (eleccion == 1) {//Suma de complejos.
            ingresarDatosUnoATres(oc);
            JOptionPane.showMessageDialog(
                    null,
                    MessageFormat.format(
                            "La suma de los números complejos:\n" +
                                    complejoString(oc.getParteComplejaA(), 0, 1) + " y " + complejoString(oc.getParteComplejaB(), 2, 3) +
                                    "\nes:\n" + complejoString(oc.suma()[1], 4, 5),
                            oc.getParteRealA(),
                            oc.getParteComplejaA(),
                            oc.getParteRealB(),
                            oc.getParteComplejaB(),
                            oc.suma()[0],
                            oc.suma()[1]
                    )
            );
        }
        if (eleccion == 2) {//Multimplicación de complejos.
            ingresarDatosUnoATres(oc);
            JOptionPane.showMessageDialog(
                    null,
                    MessageFormat.format(
                            "La multiplicación de los números complejos:\n" +
                                    complejoString(oc.getParteComplejaA(), 0, 1) + " y " + complejoString(oc.getParteComplejaB(), 2, 3) +
                                    "\nes:\n" + complejoString(oc.suma()[1], 4, 5),
                            oc.getParteRealA(),
                            oc.getParteComplejaA(),
                            oc.getParteRealB(),
                            oc.getParteComplejaB(),
                            oc.multiplicacion()[0],
                            oc.multiplicacion()[1]
                    )
            );
        }
        if (eleccion == 3) {//Comparación de complejos.
            ingresarDatosUnoATres(oc);
            if (oc.comparacion()) {
                JOptionPane.showMessageDialog(
                        null,
                        "Los números complejos ingresados son iguales."
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Los números complejos ingresados no son iguales."
                );
            }
        }
        if (eleccion == 4) {//Escalar por complejo.
            ingresarDatosCuatro(oc);
            JOptionPane.showMessageDialog(
                    null,
                    MessageFormat.format(
                            "La mulplicación del escalar {0} por " + complejoString(oc.getParteComplejaA(), 1, 2) + " es:\n" +
                                    complejoString(oc.enteroPorComplejo()[1], 3, 4),
                            oc.getEscalar(),
                            oc.getParteRealA(),
                            oc.getParteComplejaA(),
                            oc.enteroPorComplejo()[0],
                            oc.enteroPorComplejo()[1]
                    )
            );
        }
    }

    public static void ingresarDatosUnoATres(OperacionCompleja oc) {//Ingresamo datos de los puntos 1 a 3.
        oc.setParteRealA(Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la componente real del primero número:"
                )
        ));
        oc.setParteComplejaA(Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la componente compleja del primero número:"
                )
        ));
        oc.setParteRealB(Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la componente real del segundo número:"
                )
        ));
        oc.setParteComplejaB(Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la componente compleja del segundo número:"
                )
        ));
    }

    public static void ingresarDatosCuatro(OperacionCompleja oc) {//Ingresamo datos del punto 4.
        oc.setEscalar(Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese el escalar por el cual desea multiplicar el número complejo:"
                )
        ));
        oc.setParteRealA(Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la componente real del número:"
                )
        ));
        oc.setParteComplejaA(Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la componente compleja del número:"
                )
        ));
    }

    public static String complejoString(int signo, int indiceReal, int indiceComplejo) { //Tipo de impresión de complejo según signo.
        if (signo < 0) {
            return "[{" + indiceReal + "}{" + indiceComplejo + "}i]";
        } else {
            return "[{" + indiceReal + "}+{" + indiceComplejo + "}i]";
        }
    }
}