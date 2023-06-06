package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public static void main(String[] args) {
        Marco miMarco= new Marco();
        miMarco.setVisible(true);
    }

}
  class Marco extends JFrame {

    public Marco(){

        setTitle("Calculadora");

        setBounds(100,100,600,450);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Lamina miLamina=new Lamina();

        add(miLamina,BorderLayout.CENTER);

    }

  }class Lamina extends JPanel{

    private JRadioButton perro,kilometros,descuento,propina,adivina;

    private JButton aceptar;

    private JPanel lamina2,lamina3;

    public Lamina (){

        setLayout(new BorderLayout());

        perro=new JRadioButton("Edad Canina");

        kilometros=new JRadioButton("Millas a Kms");

        descuento=new JRadioButton("Descuento");

        propina= new JRadioButton("Propina");

        adivina=new JRadioButton("Adivina el Nª");

        ButtonGroup grupo=new ButtonGroup();

        grupo.add(perro);

        grupo.add(kilometros);

        grupo.add(descuento);

        grupo.add(propina);

        grupo.add(adivina);

        lamina3=new JPanel();

        lamina3.add(perro);

        lamina3.add(kilometros);

        lamina3.add(descuento);

        lamina3.add(propina);

        lamina3.add(adivina);

        add(lamina3,BorderLayout.NORTH);

        lamina2=new JPanel();

        lamina2.setBackground(Color.CYAN);

        aceptar=new JButton("Aceptar");

        aceptar.addActionListener(new Oyente());

        lamina2.add(aceptar);

        add(lamina2,BorderLayout.SOUTH);

    }

    private class Oyente implements ActionListener {

       int añoPerruno=7;

       @Override
        public void actionPerformed(ActionEvent e) {

            if(perro.isSelected()){

               String datos= JOptionPane.showInputDialog("Ingresa la edad de tu perro");

                int edadCanina=Integer.parseInt(datos);

                int  resultado=edadCanina*añoPerruno;

                JOptionPane.showMessageDialog(null,"La edad de tu perro es: " + resultado);

            }else if(kilometros.isSelected()){

                String datos2=JOptionPane.showInputDialog("Ingresa el numero de millas a convertir");

                double milla=Double.parseDouble(datos2);

                double resultado=milla*1.60934;

                JOptionPane.showMessageDialog(null,"La conversion de millas a kilometros es: "+resultado);

            }else if(descuento.isSelected()){

                String datos=JOptionPane.showInputDialog("Ingresa el precio original");

                double precioOriginal=Double.parseDouble(datos);

                String datos2=JOptionPane.showInputDialog("Ingresa el porcentaje de descuento");

                double porcentajeDescuento=Double.parseDouble(datos2);

                double precioFinal=precioOriginal-(precioOriginal*porcentajeDescuento/100);

                JOptionPane.showMessageDialog(null,"Precio a pagar despues del descuento: "+"$ "+precioFinal);

            } else if(propina.isSelected()){

                String datos=JOptionPane.showInputDialog("Ingresa Ingrese el monto total a pagar");

                double totalCuenta=Double.parseDouble(datos);

                String datos2=JOptionPane.showInputDialog("Ingresa el porcentaje de descuento");

                double porcentajePropina=Double.parseDouble(datos2);

                double propina=totalCuenta*(porcentajePropina/100);

                JOptionPane.showMessageDialog(null,"Propina a dar: "+ "$ "+propina);

            }else if(adivina.isSelected()){

                int num=(int)Math.floor(Math.random()*10);

                System.out.println(num);

                int dato2;

             try {
                 do {

                     String dato = JOptionPane.showInputDialog("Ingresa un numero");

                     dato2 = Integer.parseInt(dato);

                 } while (dato2 != num);

                 JOptionPane.showMessageDialog(null,"Has adivinado");

             }catch(NumberFormatException n){

                 JOptionPane.showMessageDialog(null,"No has ingresado un numero");
             }

            }

       }
    }

}