package unidad1;

public class Mentiroso {
    /**
     * El programa hace una ronda del juego del mentiroso
     * El
     * 
     * @param args
     */
    public static void main(String[] args) {
        int dado1 = 0, dado2 = 0, tirada1 = 0, tirada2 = 0;
        int sumaAnt = 0, sumaPos = 0;
        boolean hayParejaAnt = false, hayParejaPos = false, miento = false;

        // Tiramos los dados aleatoriamente y sumamos
        dado1 = (int) (Math.random() * 6) + 1;
        dado2 = (int) (Math.random() * 6) + 1;
        sumaAnt = dado1 + dado2;
        if (dado1 == dado2)
            hayParejaAnt = true;
        // hayParejaAnt = dado1 == dado2;

        tirada1 = (int) (Math.random() * 6) + 1;
        tirada2 = (int) (Math.random() * 6) + 1;
        sumaPos = tirada1 + tirada2;
        if (tirada1 == tirada2)
            hayParejaPos = true;

        /*
         * Comprobamos si la jugada anterior es superior a la mia
         * Pasa en caso de que sea pareja y la mia no o que su suma
         * de dados sea superior a la mia
         */

        // Si hay pareja antes y no depues miento
        if (hayParejaAnt && !hayParejaPos) {

        }

    }
}
