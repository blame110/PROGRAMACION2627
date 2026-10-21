package unidad2;

import java.util.Scanner;

public class EjemploIfAdivina {

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

        System.out.print("Escribe un numero del 1 al 100, te quedan  " + numIntentos + " intentos: ");
        numIntroducido = teclado.nextInt();

        // Comprobamos por ultimo la condicion menos probable
        if (numIntroducido < numBuscar)
            System.out.print("El numero que buscas es mayor");
        else if (numIntroducido > numBuscar)
            System.out.println("El numero que buscas es menor");
        else {
            // Si entra en este else no es mayor ni menor, ha acertao
            // Le damos una palmada en la espalda y salimos con return
            System.out.println("Felicidades cacho de potras");
            teclado.close();
            return;
        }

        // Primero calculamos da resta entre el numero buscado y en introducido
        distancia = numBuscar - numIntroducido;
        if (distancia < 0)
            distancia = -distancia;
        // Si esta a menos de 8 del numero buscado se lo decimos
        if (distancia < DISTANCIA)
            System.out.println("Caliente, caliente");

        // Otra forma de hacerlo mas rápida
        if (Math.abs(numBuscar - numIntroducido) < DISTANCIA)
            System.out.println("Caliente again");

        // Segundo intento

        numIntentos = numIntentos - 1; // Es igual que poner numIntentos--;
        System.out.print("Escribe un numero del 1 al 100, te quedan  " + numIntentos + " intentos: ");
        numIntroducido = teclado.nextInt();

        // Comprobamos por ultimo la condicion menos probable
        if (numIntroducido < numBuscar)
            System.out.print("El numero que buscas es mayor");
        else if (numIntroducido > numBuscar)
            System.out.println("El numero que buscas es menor");
        else {
            // Si entra en este else no es mayor ni menor, ha acertao
            // Le damos una palmada en la espalda y salimos con return
            System.out.println("Felicidades cacho de potras");
            teclado.close();
            return;
        }

        // Primero calculamos da resta entre el numero buscado y en introducido
        distancia = numBuscar - numIntroducido;
        if (distancia < 0)
            distancia = -distancia;
        // Si esta a menos de 8 del numero buscado se lo decimos
        if (distancia < DISTANCIA)
            System.out.println("Caliente, caliente");

        // Otra forma de hacerlo mas rápida
        if (Math.abs(numBuscar - numIntroducido) < DISTANCIA)
            System.out.println("Caliente again");

        // TERCER INTENTO
        numIntentos--;
        System.out.print("Escribe un numero del 1 al 100, te quedan  " + numIntentos + " intentos: ");
        numIntroducido = teclado.nextInt();

        // Comprobamos por ultimo la condicion menos probable
        if (numIntroducido < numBuscar)
            System.out.print("El numero que buscas es mayor");
        else if (numIntroducido > numBuscar)
            System.out.println("El numero que buscas es menor");
        else {
            // Si entra en este else no es mayor ni menor, ha acertao
            // Le damos una palmada en la espalda y salimos con return
            System.out.println("Felicidades cacho de potras");
            teclado.close();
            return;
        }

        // Primero calculamos da resta entre el numero buscado y en introducido
        distancia = numBuscar - numIntroducido;
        if (distancia < 0)
            distancia = -distancia;
        // Si esta a menos de 8 del numero buscado se lo decimos
        if (distancia < DISTANCIA)
            System.out.println("Caliente, caliente");

        // Otra forma de hacerlo mas rápida
        if (Math.abs(numBuscar - numIntroducido) < DISTANCIA)
            System.out.println("Caliente again");

        // CUARTO INTENTO
        numIntentos--;
        System.out.print("Escribe un numero del 1 al 100, ÚLTIMO INTENTO: ");
        numIntroducido = teclado.nextInt();

        // Comprobamos por ultimo la condicion menos probable
        if (numIntroducido < numBuscar)
            System.out.print("El numero que buscas es mayor");
        else if (numIntroducido > numBuscar)
            System.out.println("El numero que buscas es menor");
        else {
            // Si entra en este else no es mayor ni menor, ha acertao
            // Le damos una palmada en la espalda y salimos con return
            System.out.println("Felicidades cacho de potras");
            teclado.close();
            return;
        }

        // Primero calculamos da resta entre el numero buscado y en introducido
        distancia = numBuscar - numIntroducido;
        if (distancia < 0)
            distancia = -distancia;
        // Si esta a menos de 8 del numero buscado se lo decimos
        if (distancia < DISTANCIA)
            System.out.println("Caliente, caliente");

        // Otra forma de hacerlo mas rápida
        if (Math.abs(numBuscar - numIntroducido) < DISTANCIA)
            System.out.println("Caliente again");

        teclado.close();
    }
}
