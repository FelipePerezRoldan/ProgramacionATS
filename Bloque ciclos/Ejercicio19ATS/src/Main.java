/*
Una empresa se dedica a la venta de desinfectantes, necesita un programa para gestionar las facturas.
En cada factura figura: el código del artículo, la cantidad vendida en litro y uno de los siguientes precios
por litro:

0,6 $/l
3 $/l
1,25 euros/l

De 5 facturas que serán introducidas se piden: facturación total, cantidad de litros vendidos del artículo 1,
y la cantidad de facturas mayores a $600.
 */
import javax.swing.JOptionPane; //importar libreria JOptinePane.
public class Main {
    public static void main(String[] args) {
        int codigo;
        float litros;
        float facturaTotal = 0;
        int cantidadDelUno = 0;
        int mayoresA600 = 0;

        for (int i = 0; i < 5; i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del producto:\n" +
                    "los posibles codigos son:\n" +
                    "1. 0,6 dolares/litro.\n" +
                    "2. 3 dolares/litro.\n" +
                    "3. 1,25 dolares/litro.\n"));
            litros = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de litros que desea comprar:"));
            switch (codigo){
                case 1:
                    facturaTotal += 0.6 * litros;
                    cantidadDelUno ++;
                    if (facturaTotal > 600 ){
                        mayoresA600 ++;
                    }
                    break;
                case 2 :
                    facturaTotal += 3 * litros;
                    if (facturaTotal > 600 ){
                        mayoresA600 ++;
                    }
                    break;
                case 3 :
                    facturaTotal += 1.25 * litros;
                    if (facturaTotal > 600 ){
                        mayoresA600 ++;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción equivocada.");
                    break;
            }
        }
        JOptionPane.showMessageDialog(null,"Factura.\n" +
                "Costo total: " + facturaTotal + "\n" +
                "Cantidad de productos tipo 1: " + cantidadDelUno + "\n" +
                "Productos con valor superior a 600: " + mayoresA600 + "\n");
    }
}