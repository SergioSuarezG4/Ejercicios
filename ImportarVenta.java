import javax.swing.JOptionPane;

import venta.Venta;
public class ImportarVenta {

    public static void main( String [] args ){
        
        Venta venta = new  Venta();

        int cantidadProductos;
        cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Productos"));
       
        double valorUnitario;
        valorUnitario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor Unitario"));

        int tipoCliente;
        tipoCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de Cliente"));



        double valorVenta = venta.CalcularValorVenta(valorUnitario, cantidadProductos, tipoCliente);
        JOptionPane.showMessageDialog(null, "El valor de la venta es: "  + valorVenta);

        String mensaje = String.format( "Para el cliente de tipo %d %n, Cantidad de productos: %d %n, Valor unitario  %2f %n, El valor de la venta es: %.2f %n, " + tipoCliente );
        JOptionPane.showMessageDialog(null, mensaje);
        }

    }
   
