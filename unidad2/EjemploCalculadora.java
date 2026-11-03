package unidad2;

import java.util.Scanner;

public class EjemploCalculadora {
    /**
     * El programa muestra un menu de operaciones de una calculadora tipo
     * 1- suma
     * 2- resta
     * 3- division
     * 4- multiplicacion
     * 5- salir
     * 
     * En cada opción leera los operadores y mostrara el resultado de la operación
     * y luego mostrara el menu
     * 
     * @param args
     */
    public static void main(String[] args) {

        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        do {

            // Mostramos el menu de opciones de la calculadora
            System.out.println("    1- suma\r\n" +
                    "     2- resta\r\n" +
                    "     3- division\r\n" +
                    "     4- multiplicacion\r\n" +
                    "     5- salir \r\n" +
                    " Elige una opcion(1-5): ");

            // Leemos por teclado la opcion elegida
            opcion = teclado.nextInt();

            //Leemos los numeros solo si la opcion selecionada es válida
            if (opcion<=1 && opcion<=4)
            {
            // Primero leo los dos numeros
            System.out.print("Introduce el primer número: ");
            numero1 = teclado.nextDouble();
            System.out.print("Introduce el segundo número: ");
            numero2 = teclado.nextDouble();
            }

            // Operaciones de la calculadora
            // Dependiendo de la opcion realizo la operacion
            switch (opcion) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 / numero2;
                    break;
                case 4:
                    resultado = numero1 * numero2;
                    break;
                case 5:
                    System.out.println("Hasta luego!!");;
                    break;
                default:
                    System.out.println("Opción no válida, introduce una opción entre 1 y 5, pretty please");
                    break;
            }

            System.out.println("El resultado de la operación es " + resultado);

            // Mientras no introduzca la opcion de salir seguimos sacando el menu
            // y haciendo operaciones
        } while (opcion != 5);

        teclado.close();
    }
}
