package clase_6;

import java.util.Scanner;

public class BuscadorWeb {

    public static void main(String[] args) {

        getPais();

        getTweets();

        getWhatsapp();

    }

    public static void getPais(){

        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese un pais: ");

        String pais=sc.next();

        System.out.println("https://www.google.com/maps/search/" + pais);
    }

    public static void getTweets(){

        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese un Influencer de twitter: ");

        String celebridad=sc.next();

        System.out.println("https://twitter.com/search?q=" + celebridad);
    }

    public static void getWhatsapp(){

        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese un numero de telefono: ");

        String telefono=sc.next();

        System.out.println("https://api.whatsapp.com/send?phone=" + telefono);
    }

}
