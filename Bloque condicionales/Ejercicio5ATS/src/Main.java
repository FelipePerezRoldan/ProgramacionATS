/*
En Mega Plaza se hace un 20% de descuento a los clientes cuya compra supere los $300.
¿Cuál será la cantidad que pagará una persona por su compra?
 */
//Importamos el JOptionPane.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //Propiedades.
        final double DESCUENTOAPLICADO = 0.8;
        double costoCompra;
        double valorAPagar;
        //Toma de datos.
        costoCompra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese costo de la compra: "));
        //Deducción de valor a pagar;
        if (costoCompra >= 300){
            valorAPagar = costoCompra * DESCUENTOAPLICADO;
        }
        else {
            valorAPagar = costoCompra;
        }
        //Mostrar valores.
        JOptionPane.showMessageDialog(null,"Su descuneto es de: " + (costoCompra-valorAPagar) + "\n" +
                "Total a pagar: " + valorAPagar);
    }
}