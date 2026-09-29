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
        // tipo_dato nombre = valor_inicial;
        int edad = 0;
        String nombre = "";// Los String van entre " "
        long kmCarrera = 1231231222222222222L;
        float pesoAnimal = 3450.34f;
        double pi = 3.14159;
        char letra = 'b';
        boolean estaCasado;
        String bienVest = "si";

        // Operador de asignacion
        edad = 132;

        // Definimos un objeto de tipo scanner para poder leer
        Scanner teclado = new Scanner(System.in);
        // Leemos de teclado en la misma linea sin 'ln'
        System.out.print("Escribe tu edad: ");
        edad = teclado.nextInt();

        System.out.print("Vienes presentable?(si/no): ");
        bienVest = teclado.next();
        // Ponemos un next adicional para evitar el error de salto
        teclado.nextLine();

        System.out.print("Cuál es tu nombre?:");
        // nextline lee la linea completa y la guarda en el String
        nombre = teclado.nextLine();

        System.out.println("Tu nombre es " + nombre + " tu edad es " + edad + " y " + bienVest + " vienes presentable");

        // para saber si un numero es par lo dividimos entre 2 y sacamos el resto de la
        // division
        // Si sobra 0 entonces sabemos que es par sino es impar
        // El operador % devuelve el resto de la division entera
        if (edad % 2 == 0)
            System.out.println("Tu edad es par");

        // Para saber si algo es distinto a otro elemento usamos !=
        if (edad != 0)
            System.out.println("No eres un recién nacido");
        // En java tenemos los operadores > < >= y <=
        if (edad <= 0)
            System.out.println("La edad tiene que ser positiva");

        /*
         * Solo entran en la discoteca si son
         * mayores de 18 años y van bien vestidos
         */

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

        // Para comparar String usamos .equals, si usamos .equalIgnoreCase seran iguales
        // Tanto si coinciden en minusculas o mayúsculas
        if (nombre.equalsIgnoreCase("Jose"))
            System.out.println("Tu nombre es jose");

        // El segurata nos va a dejar pasar
        // si vamos bien vestidos, tenemos más de 17 años o si nos llamamos Jose
        if ((bienVest.equals("si") && edad >= 18 || nombre.equalsIgnoreCase("Jose")))
            System.out.println("Puedes Pasar");

        // Cerramos el scanner
        teclado.close();

    }
}