package unidad2;

import java.util.Scanner;

/**
 * EjemploIfPortero
 */
public class EjemploIfPortero {

    /**
     * Pide la edad, si la persona tiene invitación (s/n) y si es VIP (s/n).
     * Reglas:
     * los menores de 18 no entran nunca; de 18 a 20 años solo entran con
     * invitación; con 21 o más entran siempre; los VIP mayores de edad entran
     * siempre. Muestra "Pase, buenas noches" o "Hoy no toca".
     * 
     * @param args
     */
    public static void main(String[] args) {

        int edad = 0;
        boolean tieneInvitacion = false, esVip = false;
        String tieneInvitacionStr = "", esVipStr = "";
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Que edad tienes?");
        edad = teclado.nextInt();
        System.out.print("Tiene usted invitacion(s/n)?");
        tieneInvitacionStr = teclado.next();
        System.out.print("Es usted VIP(s/n)?");
        esVipStr = teclado.next();

        // Convertimos los datos de String a Boleean
        if (esVipStr.toLowerCase().charAt(0) == 's')
            esVip = true;

        if (tieneInvitacionStr.toLowerCase().charAt(0) == 's')
            tieneInvitacion = true;

        // Si la edad es menor de 18 no entra
        if (edad < 18)
            System.out.println("Hoy no toca");
        else {

            // Seguimos el resto dentro del else ya que el resto de condiciones se
            // comprueban
            // Si tiene mas de 18 años que seria dentro de este else

            // Tanto si cumple que es vip como si es mayor de 20 años entra
            // es un o || porque con que cumpla una condicion ya entra
            if (esVip || edad >= 21) {
                System.out.println("Pase, buenas noches");
            } else {
                if (edad <= 20 && tieneInvitacion) {
                    System.out.println("Pase, buenas noches");
                } else
                    // En caso de que no cumpla ninguna de las condiciones para entrar
                    // Mostramos el mensaje de que no puede entrar
                    System.out.println("Hoy no toca");

            }
        }

        teclado.close();

    }
}