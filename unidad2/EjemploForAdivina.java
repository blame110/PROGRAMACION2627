package unidad2;

import java.util.Scanner;

public class EjemploForAdivina {

    private static final int NUM_INTENTOS = 4;
    private static final int DISTANCIA = 8;

    /**
     * Programa que genera un número aleatorio entre 1 y 100
     * y el usuario tiene que adivinarlo
     * tiene 4 intentos.
     * Si acierta le da las felicidades si falla
     * le dice si el numero buscado es mayor o menor y si esta cerca
     * le dira que esta cerca si esta a menos de 8
     * 
     * @param args
     */
    public static void main(String[] args) {

        int numIntroducido = 0;
        int numIntentos = NUM_INTENTOS;
        int numBuscar = 0;
        int distancia = 0;

        Scanner teclado = new Scanner(System.in);

        // Generamos un numero entre 1 y 100
        numBuscar = (int) (Math.random() * 100);

        do {

            System.out.print("Escribe un numero del 1 al 100, te quedan  " + numIntentos + " intentos: ");
            numIntroducido = teclado.nextInt();

            // Si se ha encontrado el número directamente salimos despues de felicitar
            if (numIntroducido == numBuscar) {
                System.out.println("Has acertado!!");
                break;
            }

            if (Math.abs(numIntroducido - numBuscar) <= DISTANCIA)
                System.out.println("Caliente, caliente");

            System.out.println("Te quedan " + --numIntentos + " intentos");

        }
        // Seguimos intentando encontrar el número a buscar
        // Mientras no se haya acertado y no se hayan agotado los intentos
        while (numIntroducido != numBuscar && numIntentos > 0);

        // Si no lo encontro
        if (numIntroducido != numBuscar)
            System.out.println("El numero era " + numBuscar);

        teclado.close();
    }
}
