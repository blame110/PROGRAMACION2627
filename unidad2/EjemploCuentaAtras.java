package unidad2;

import java.util.Scanner;

public class EjemploCuentaAtras {

    public static void main(String[] args) {

        /**
         * Cuenta atras desde 10 hasta 0 cuando sea 0 pondrá despegue
         * y desde el tres pondra preparense para el despegue
         */
        int i = 10, limite=0;
        Scanner teclado = new Scanner(System.in);
        String texto = "";
        // Hacemos un bucle que saque el numero i que empieza en 10 y va a bajar hasta 0
        while (i >= 0) {

            // Pasamos a String el numero
            texto = Integer.toString(i);

            // Si esta entre 3 y 1 mostramos el mensaje
            if (i <= 3 && i >= 1)
                texto = texto + " Preparese para el despegue";
            else if (i == 0)
                texto = "CEROOOO Despegamos, apretense el cinturón";

            //Mostramos por pantalla el texto final a mostar
            System.out.println(texto);

            //Pasamos al siguiente numero 
            i--;

        }

        /**
         * Mostrar los numeros pares desde 0 hasta un numero introducido por teclado
         * excepto el 8 cómo mucho hasta el número 100
         */
        System.out.print("Hasta donde quieres que saque numeros: ");
        limite = Integer.parseInt(teclado.next());
        for (int j=0;j<=limite;j=j+2)
        {
            //Para saltar el 8 usamos continue
            //cuando el valor sea 8 saltamos a la siguiente repeticion
            //continue dentro de un bucle se salta las instrucciones posteriores
            //de esta repeticion
            if (j==8) continue;

            //Con break se acaba el bucle en el que estamos
            //No se recomienda usar jamas
            if (j==100) break;

            System.out.println(j);
        }


        teclado.close();

    }
}
