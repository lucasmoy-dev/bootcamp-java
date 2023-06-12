package clase_6;

import java.util.Scanner;

public class MenorMayor {

    public static void main(String[] args) {

        cargarDatos();

    }
    static int contador=1;
    static int datoA;
    static int datoB;
    static int datoC;

    public static void cargarDatos(){

        for(int i=0;i<=2;i++){

            System.out.println("Ingrese un numero " + contador);

            Scanner scanner=new Scanner(System.in);

            if(contador==1) datoA=scanner.nextInt();

            if(contador==2) datoB=scanner.nextInt();

            if(contador==3) datoC=scanner.nextInt();

            if(contador==3){

                getMenor(datoA,datoB,datoC);

                getMayor(datoA,datoB,datoC);
            }

            contador++;
        }
    }

    public static void  getMenor(int a,int b,int c) {

        int[] numeros = {a, b, c};

        int numMenor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            int numActual = numeros[i];

            if (numActual < numMenor) {

                numMenor = numActual;
            }
        }

        System.out.println("El numero menor es: " + numMenor);
    }

    public static void  getMayor (int a,int b,int c) {

        int[] numeros2 = {a, b, c};

        int numMayor = numeros2[0];

        for (int i = 0; i < numeros2.length; i++) {

            int numActual2 = numeros2[i];

            if (numActual2 > numMayor) {

                numMayor = numActual2;
            }
        }

        System.out.println("El numero mayor es: " + numMayor);
    }
}
