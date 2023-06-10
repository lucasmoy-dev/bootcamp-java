package Clase_6;

import java.util.Scanner;

public class API_Whatsapp {

    static Scanner datoCel = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingresa tu número de celular: ");
        String numCelular = datoCel.nextLine();

        System.out.println("Tu enlace a Whatsapp es: " + "https://api.whatsapp.com/send?phone="+ numCelular);
    }
}
