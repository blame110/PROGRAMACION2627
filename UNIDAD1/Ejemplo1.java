package unidad1;

import java.util.Scanner;

public class Ejemplo1 {
    /**
     * Función principal del programa
     * 
     * @param args recibe de linea de comandos argumentos
     * @return nada
     */
    public static void main(String args[]) {

        // Definimos una variable para la edad
        int edad = 0;
        String bienVest = "si";
        // Definimos un objeto de tipo scanner para poder leer
        Scanner teclado = new Scanner(System.in);
        // Leemos de teclado en la misma linea sin 'ln'
        System.out.print("Escribe tu edad: ");
        edad = teclado.nextInt();

        System.out.print("Vienes presentable?(si/no): ");
        bienVest = teclado.next();
        /*
         * Solo entran en la discoteca si son
         * mayores de 18 años y van bien vestidos
         */
        System.out.print("ok, tienes " + edad + " años y ");

        /*
         * Con la estructura if comprobamos si una condicion es cierta
         * en caso de ser cierta ejecuta el codigo a continuacion
         * si es falsa ejecuta el código del else (si existe)
         */
        if (bienVest.equals("si")) {
            System.out.println("vas bien vestido");
        } else {
            System.out.println(" no vas bien vestido");
        }

        // Cerramos el scanner
        teclado.close();

    }
}