package academy.atl.refactorizacion;

import java.util.Random;
import java.util.Scanner;
public class JuegoAhorcado {

    private int intentos;
    private String[] palabras;

    public JuegoAhorcado(int intentos, String[] palabras) {
        this.intentos = intentos;
        this.palabras = palabras;
    }

    public void jugar() {
        String palabraSecreta = obtenerPalabraAlAzar(palabras);
        char[] palabraAdivinada = ocultarPalabra(palabraSecreta);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al juego del ahorcado!");

        adivinarLaPalabra(intentos, palabraSecreta, palabraAdivinada, teclado);

        if (intentos == 0) {
            System.out.println("Oh no! Te quedaste sin intentos. La palabra era: " + palabraSecreta);
        }

        teclado.close();
    }

    private void adivinarLaPalabra(int intentos, String palabraSecreta, char[] palabraAdivinada, Scanner teclado) {
        while (intentos > 0) {
            mostrarLetrasAdivinadas(intentos, palabraAdivinada);
            char letra = teclado.next().charAt(0);

            boolean acierto = esUnAciertoYMostrarLetra(palabraSecreta, palabraAdivinada, letra);

            if (!acierto) {
                intentos--;
                System.out.println("Letra incorrecta. Cuidado!");
            }

            if (adivinoTodasLasLetras(palabraAdivinada)) {
                System.out.println("Felicidades! Adivinaste la palabra: " + palabraSecreta);
                break;
            }
        }
    }

    private boolean adivinoTodasLasLetras(char[] palabraAdivinada) {
        boolean palabraAdivinadaCompletamente = true;
        for (char c : palabraAdivinada) {
            if (c == '_') {
                palabraAdivinadaCompletamente = false;
                break;
            }
        }
        return palabraAdivinadaCompletamente;
    }

    private boolean esUnAciertoYMostrarLetra(String palabraSecreta, char[] palabraAdivinada, char letra) {
        boolean acierto = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                palabraAdivinada[i] = letra;
                acierto = true;
            }
        }
        return acierto;
    }

    private void mostrarLetrasAdivinadas(int intentos, char[] palabraAdivinada) {
        System.out.println("\nPalabra adivinada: " + new String(palabraAdivinada));
        System.out.println("Intentos restantes: " + intentos);
        System.out.print("Ingresa una letra: ");
    }

    protected char[] ocultarPalabra(String palabraSecreta) {
        char[] palabraAdivinada = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }
        return palabraAdivinada;
    }

    private String obtenerPalabraAlAzar(String[] palabras) {
        int indiceAleatorio = (int) (Math.random() * palabras.length);
        String palabraSecreta = palabras[indiceAleatorio];
        return palabraSecreta;
    }
}