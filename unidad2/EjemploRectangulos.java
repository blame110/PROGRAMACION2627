package unidad2;

import java.util.Scanner;

public class EjemploRectangulos {
    /**
     * El programa recibe la base y la altura de un rectangulo y si lo quiere hueco
     * o no
     * y dibuja el rectangulo. Por ejemplo un rectangulo 4x3 hueco sería
     * ****
     * ****
     * ****
     * 
     * ****
     * * *
     * ****
     * 
     * @param args
     */
    public static void main(String[] args) {

        int base = 0;
        int altura = 0;
        boolean esHueco = false;
        String esHuecoStr = "";
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la base:");
        base = Integer.parseInt(teclado.nextLine());
        System.out.print("Introduce la altura:");
        altura = Integer.parseInt(teclado.nextLine());
        // Leemos si lo quiere hueco hasta que ponga una S o una N
        do {
            System.out.print("Lo quieres hueco (S/N):");
            esHuecoStr = teclado.nextLine();
        } while (!esHuecoStr.equalsIgnoreCase("S") && !esHuecoStr.equalsIgnoreCase("N"));
        // Por defecto era false si ha introducido una S lo ponemos a true
        // Que es lo que devuelve el equalsignorecase
        esHueco = esHuecoStr.equalsIgnoreCase("S");

        System.out.println("****************************************");
        System.out.println("*    RECTANGULO                 *");
        System.out.println("****************************************\n\n\n\n");

        // Primera linea
        for (int j = 0; j < base; j++) {
            System.out.print("*");
        }
        System.out.println();

        //Bucle para las lineas intermedias
        for (int i = 0; i < altura-2; i++) {
            
            //Primera columna 
            System.out.print("*");

            // Repetimos base veces para dibujar un nivel o linea horizontal del cuadrado
            for (int j = 0; j < base-2; j++) {
                //Si no es hueco lo rellenamos sino solo espacios
                if (esHueco)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }

            //Ultimaa columna 
            System.out.println("*");
            
        }

            // ultima linea
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }


        teclado.close();

    }
}
