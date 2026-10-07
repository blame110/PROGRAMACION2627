package unidad2;

public class EjemploConversiones {
    public static void main(String[] args) {

        /*
         * Para convertir un número que viene como cadena de texto (String) a tipo
         * numerico
         * usamos las funciones parse que tienen las clases de cada tipo de dato
         */
        String numeroTxt = "34.23";
        double numero = Double.parseDouble("2.22");
        float peso = Float.parseFloat("60.8");
        String nombre = "Jose";

        /**
         * Para convertir un número a texto para insertarlo en cadenas o buscar
         * usamos
         */
        String potenciaStr = Integer.toString(234); // String.valueOf(234)

        // Para comparar Strings siempre se utiliza .equals
        // Con .equalsIgnoreCase da igual mayusculas y minusculas
        if (nombre.equalsIgnoreCase("jose")) {
            System.out.println("el nombre es igual a jose");

        }

    }
}
