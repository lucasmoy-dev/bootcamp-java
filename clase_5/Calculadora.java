package clase_5;

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

        add(miLamina);
    }
  }
    class Lamina extends JPanel{
      public static JRadioButton perro,kilometros,descuento,propina,adivina;
      private JButton aceptar;
      private JPanel lamina2,lamina3;
      public Lamina (){

        setLayout(new BorderLayout());

        perro=new JRadioButton("Edad Canina");

        kilometros=new JRadioButton("Millas a Kms");

        descuento=new JRadioButton("Descuento");

        propina= new JRadioButton("Propina");

        adivina=new JRadioButton("Adivina el Numero");

        ButtonGroup grupo=new ButtonGroup();

        lamina3=new JPanel();

        JRadioButton[]  lista= new JRadioButton[]{perro,kilometros,descuento,propina,adivina};

        agregarBotones(lista,grupo,lamina3);

        add(lamina3,BorderLayout.CENTER);

        lamina2=new JPanel();

        lamina2.setBackground(Color.CYAN);

        aceptar=new JButton("Aceptar");

        aceptar.addActionListener(new Oyente());

        lamina2.add(aceptar);

        add(lamina2,BorderLayout.SOUTH);
    }
       public void agregarBotones(JRadioButton[] c,ButtonGroup br,JPanel p) {

           for (int i = 0; i < c.length; i++) {

               br.add(c[i]);
               p.add(c[i]);
           }
       }
       private class Oyente implements ActionListener {
         @Override
         public void actionPerformed(ActionEvent e) {

         try {
           Calculos.añosPerrunos(perro);

           Calculos.calculoKms(kilometros);

           Calculos.calculoDescuento(descuento);

           Calculos.calculoPropina(propina);

           Calculos.adivinaNumero(adivina);

          }catch(NumberFormatException n){

             JOptionPane.showMessageDialog(null,"No has ingresado un numero");
       }
    }
  }
}