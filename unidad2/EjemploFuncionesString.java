package unidad2;

import java.util.Scanner;

public class EjemploFuncionesString {

    public static void main(String[] args) {

        int edad = 18;
        String modeloCoche = " Corsa ", frase = "", oracion = "";
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        frase = teclado.nextLine();

        // Para saber la cantidad de caracteres que tiene un String se usa la funcion
        // lenght()
        System.out.println("El modelo de coche tiene " + modeloCoche.length() + " caracteres");

        /**
         * con tolowercase se pasa a minusculas y con touppercase a mayusculas
         */
        System.out
                .println("En mayusculas " + modeloCoche.toUpperCase() + " en minusculas " + modeloCoche.toLowerCase());

        // Para sacar el caracter que esta en la posicion x se usa charAt
        char caracter = modeloCoche.charAt(1);
        System.out.println("El caracter en la posicion 1 es " + caracter + " ya que empieza por la posicion 0");

        // Trim elimina los espacios al principio y final de una cadena
        modeloCoche = modeloCoche.trim();
        System.out.println("El modelo de coche tiene " + modeloCoche.length() + " caracteres");

        // Contains devuelve true si la cadena contiene la palabra que le metemos
        boolean contieneMar = frase.toLowerCase().contains("mar");
        if (contieneMar == true)
            System.out.println("La frase tiene la palabra mar");
        else
            System.out.println("La frase no tiene la palabra mar");

        // indexof me dice la posicion donde se encuentra la primera vez la palabra
        // buscada Si despues de la palabra buscada ponemos un numero,
        // busca a partir de esa posicion
        int posicion = frase.indexOf("coche");
        if (posicion == -1)
            System.out.println("No se encontro la palabra");
        else
            System.out.println("La palabra coche esta en la posicion " + posicion);

        /**
         * con substring cortamos un String dando una posicion inicial y final
         * nos devuelve un nuevo string con ese corte
         */
        oracion = frase.substring(5, 10);
        System.out.println("el corte es: " + oracion);

        // Ejemplo para la primera frase finalizada con .
        // Comprobamos antes de nada que la frase tenga un .
        // Sino intentara cortar en la posicion -1 y dara outofbound
        if (frase.indexOf(".") != -1) {
            oracion = frase.substring(0, frase.indexOf("."));
            System.out.println("la frase es: " + oracion);
        }

        // Cambiamos una palabra por otra
        frase = frase.replace("oracion", "oración");
        System.out.println("la frase cambiada es: " + frase);

        teclado.close();
    }
}
