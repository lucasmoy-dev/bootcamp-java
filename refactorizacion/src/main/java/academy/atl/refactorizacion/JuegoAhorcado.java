package academy.atl.refactorizacion;

import java.util.Scanner;
public class JuegoAhorcado {
    public static void main(String[] args) {
        String[] palabras = {"programacion", "computadora", "java", "desarrollo", "tecnologia"};
        int indiceAleatorio = (int) (Math.random() * palabras.length);
        String palabraSecreta = palabras[indiceAleatorio];
        char[] palabraAdivinada = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }
        int intentos = 6; // Número de intentos permitidos
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego del ahorcado!");

        while (intentos > 0) {
            System.out.println("\nPalabra adivinada: " + new String(palabraAdivinada));
            System.out.println("Intentos restantes: " + intentos);
            System.out.print("Ingresa una letra: ");
            char letra = scanner.next().charAt(0);

            boolean acierto = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    palabraAdivinada[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                intentos--;
                System.out.println("Letra incorrecta. Cuidado!");
            }

            boolean palabraAdivinadaCompletamente = true;
            for (char c : palabraAdivinada) {
                if (c == '_') {
                    palabraAdivinadaCompletamente = false;
                    break;
                }
            }

            if (palabraAdivinadaCompletamente) {
                System.out.println("Felicidades! Adivinaste la palabra: " + palabraSecreta);
                break;
            }
        }

        if (intentos == 0) {
            System.out.println("Oh no! Te quedaste sin intentos. La palabra era: " + palabraSecreta);
        }

        scanner.close();
    }
}