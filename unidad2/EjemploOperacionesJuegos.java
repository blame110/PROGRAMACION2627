package unidad2;

import java.util.Scanner;

public class EjemploOperacionesJuegos {

    /**
     * El programa leera 10 videojuegos, el nombre, la puntuacion con decimales, el
     * precio y la categoria
     * contara la cantidad de videojuegos con una puntuacion superior a 9, contar
     * tambien los de categoria aventura
     * y su nombre contenga la palabra zelda
     * y la suma de los precios de todos los videojuegos
     * 
     * @param args
     */
    public static void main(String[] args) {

        String nombre = "";
        double puntuacion = 0;
        double precio = 0, precioTotal = 0;
        String categoria = "";
        int cantPuntuacionAlta = 0, cantZeldaAventura = 0;
        Scanner teclado = new Scanner(System.in);

        // Repetimos 10 veces para leer los datos
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el nombre del videojuego numero " + i + ":");
            nombre = teclado.nextLine();
            System.out.println("Introduce el puntuación del videojuego numero " + i + ":");
            puntuacion = Double.parseDouble(teclado.nextLine());
            System.out.println("Introduce el precio del videojuego numero " + i + ":");
            precio = Double.parseDouble(teclado.nextLine());
            System.out.println("Introduce el categoría del videojuego numero " + i + ":");
            categoria = teclado.nextLine();

            // Contamos los juegos con puntuacion superior a 9
            if (puntuacion > 9)
                cantPuntuacionAlta++;

            if (categoria.equalsIgnoreCase("aventura") && nombre.contains("zelda"))
                cantZeldaAventura++;

            // Sumamos el precio de los videojuegos
            precioTotal = precioTotal + precio;

        }
        // Una vez acabamos mostramos la cantidad de juegos mayor de 9
        System.out.println("La cantidad de juegos con puntuacion mayor de 9 es " + cantPuntuacionAlta);
        System.out.println("La cantidad de videojuegos de aventura de zelda son " + cantZeldaAventura);
        System.out.println("Todos los juegos juntos cuestan " + precioTotal);

        teclado.close();
    }
}
