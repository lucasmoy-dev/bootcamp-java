package clase_5;

import javax.swing.*;
public class Calculos  {
    public static void añosPerrunos(JRadioButton rb) {

        if (rb.isSelected()) {

            String datos = JOptionPane.showInputDialog("Ingresa la edad de tu perro");

            int edadCanina = Integer.parseInt(datos);

            int resultado = edadCanina * 7;

            JOptionPane.showMessageDialog(null, "La edad de tu perro es: " + resultado);
        }
    }
    public static void calculoKms(JRadioButton rb) {

        if (rb.isSelected()) {

            String datos2 = JOptionPane.showInputDialog("Ingresa el numero de millas a convertir");

            double milla = Double.parseDouble(datos2);

            double resultado = milla * 1.60934;

            JOptionPane.showMessageDialog(null, "La conversion de millas a kilometros es: " + resultado);
        }
    }
    public static void calculoDescuento(JRadioButton rb) {

        if (rb.isSelected()) {

            String datos = JOptionPane.showInputDialog("Ingresa el precio original");

            double precioOriginal = Double.parseDouble(datos);

            String datos2 = JOptionPane.showInputDialog("Ingresa el porcentaje de descuento");

            double porcentajeDescuento = Double.parseDouble(datos2);

            double precioFinal = precioOriginal - (precioOriginal * porcentajeDescuento / 100);

            JOptionPane.showMessageDialog(null, "Precio a pagar despues del descuento: " + "$ " + precioFinal);
        }
    }
    public static void calculoPropina(JRadioButton rb) {

        if (rb.isSelected()) {

            String datos = JOptionPane.showInputDialog("Ingresa Ingrese el monto total a pagar");

            double totalCuenta = Double.parseDouble(datos);

            String datos2 = JOptionPane.showInputDialog("Ingresa el porcentaje de descuento");

            double porcentajePropina = Double.parseDouble(datos2);

            double propina = totalCuenta * (porcentajePropina / 100);

            JOptionPane.showMessageDialog(null, "Propina a dar: " + "$ " + propina);
        }
    }
    public static void adivinaNumero(JRadioButton rb) throws NumberFormatException{

        if (rb.isSelected()) {

            int num = (int) Math.floor(Math.random() * 100);

            int dato2;

            do {
                String dato = JOptionPane.showInputDialog("Ingresa un numero");

                dato2 = Integer.parseInt(dato);

            } while (dato2 != num);

                JOptionPane.showMessageDialog(null, "Has adivinado");
        }
    }
}