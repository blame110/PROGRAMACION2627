package unidad2;

import java.util.Scanner;

public class EjemploOperacionesJuegos {

    /**
     * El programa leera n videojuegos, el nombre, la puntuacion con decimales, el
     * precio y la categoria
     * contara la cantidad de videojuegos con una puntuacion superior a 9, contar
     * tambien los de categoria aventura
     * y su nombre contenga la palabra zelda
     * y la suma de los precios de todos los videojuegos
     * la puntuacion mayor y menor y el nombre de los juegos con dicha puntuacion
     * la media de la puntuacion de los juegos de cada categoria,
     * hay dos categorias aventura y plataformas
     * el porcentaje de juegos que cuestan menos de 15 euros
     * 
     * Mostrar el nombre de los juegos que sean de categoría
     * Plataformas cuya puntuación sea superior a 9 o cuesten menos de 19 euros
     * 
     * @param args
     */
    public static void main(String[] args) {

        String nombreVideoJuego = "", nombreMaxPunt = "", nombreMinPunt = "";
        // Importante inicializar el mayor a un valor negativo grande y el minimo
        // A un valor positivo Grande
        double puntuacion = 0, mayorPuntuacion = -Double.MAX_VALUE, menorPuntuacion = Double.MAX_VALUE;
        double precio = 0, precioTotal = 0;
        double sumaPuntuacionPlataforma = 0;
        double sumaPuntuacionAventura = 0;
        String categoria = "";
        String nombresCondicionCompleja="";
        int cantPuntuacionAlta = 0, cantZeldaAventura = 0;
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        int cantidadMenos15 = 0;

        // Leemos la cantidad de videojuegos a tratar
        System.out.println("Cuantos videojuegos hay?");
        n = Integer.parseInt(teclado.nextLine());

        // Repetimos 10 veces para leer los datos
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce el nombre del videojuego numero " + i + ":");
            nombreVideoJuego = teclado.nextLine();
            System.out.println("Introduce el puntuación del videojuego numero " + i + ":");
            puntuacion = Double.parseDouble(teclado.nextLine());
            System.out.println("Introduce el precio del videojuego numero " + i + ":");
            precio = Double.parseDouble(teclado.nextLine());
            System.out.println("Introduce el categoría del videojuego numero " + i + ":");
            categoria = teclado.nextLine();

            // Contamos los juegos con puntuacion superior a 9
            if (puntuacion > 9)
                cantPuntuacionAlta++;

            if (categoria.equalsIgnoreCase("aventura") && nombreVideoJuego.contains("zelda"))
                cantZeldaAventura++;

            // Cada juego que cueste menos de 15 euros lo contamos
            // incrementamos el contador en 1 con ++
            if (precio < 15)
                cantidadMenos15++;

            /*
             * Mostrar el nombre de los juegos que cumplan que sean  de categoría
             * Plataformas siempre y ademas una de las siguentes condiciones 
             * puntuación sea superior a 9 o cuesten menos de 19 euros
             */
            if (categoria.equalsIgnoreCase("plataforma") && (puntuacion>9 || precio <19))
            {
                nombresCondicionCompleja += " " + nombreVideoJuego;
            }

            // Sumamos el precio de los videojuegos
            precioTotal = precioTotal + precio;

            // Suma de la puntuacion
            switch (categoria.toLowerCase()) {
                case "aventura":
                    sumaPuntuacionAventura = sumaPuntuacionAventura + puntuacion;
                    break;
                case "plataforma":
                    sumaPuntuacionPlataforma += puntuacion;
                    break;
            }

            // Calculo de la mayor puntuacion
            // si la puntuacion que leo del videojuego actual
            // es mayor que el valor máximo que tengo guardado hasta este momento
            // Asigno la puntuacion del actual cómo nuevo máximo
            if (puntuacion > mayorPuntuacion) {
                mayorPuntuacion = puntuacion;
                nombreMaxPunt = nombreVideoJuego;
            }
            if (puntuacion < menorPuntuacion) {
                menorPuntuacion = puntuacion;
                nombreMinPunt = nombreVideoJuego;
            }

        }

        // Una vez acabamos mostramos la cantidad de juegos mayor de 9
        System.out.println("La cantidad de juegos con puntuacion mayor de 9 es " + cantPuntuacionAlta);
        System.out.println("La cantidad de videojuegos de aventura de zelda son " + cantZeldaAventura);
        System.out.println("Todos los juegos juntos cuestan " + precioTotal);
        System.out.println("La mayor puntuación es " + mayorPuntuacion);
        System.out.println("La menor puntuación es " + menorPuntuacion);
        System.out.println("La media de puntuacion de todos los juegos de aventuras es: " + sumaPuntuacionAventura / n);
        System.out.println(
                "La media de puntuacion de todos los juegos de plataforma es: " + sumaPuntuacionPlataforma / n);
        System.out.println(
                "El porcentaje de juegos de menos de 15 euros es " + ((double) cantidadMenos15 / n) * 100 + "%");
System.out.println("Los nombres de los videojuegos de la condicion " + nombresCondicionCompleja);
        teclado.close();
    }
}
