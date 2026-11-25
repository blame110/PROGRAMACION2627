package unidad2;

/**
 * EjemploArrays
 */
public class EjemploArrays {

    
    public static void main(String[] args) {
        
        int edad = 34,minEdad=Integer.MAX_VALUE;
        int posMinimo=-1;
        //Un array es simplemente una variable igual que cualquier otra
        //Pero en lugar de guardar un solo dato guardamos muchos

        //Podemos inicializarlo con valores directamente
        int edadesAlumnos[] = {18,23,11,34,34,23,45};

        System.out.println("La edad es " + edad);
        
        System.out.println("La edad de la tercera posición del array es " + edadesAlumnos[2]);

        //Para poder usar un array hay que crearlo y darle espacio con new y la cantidad
        //de elementos que queramos guardar como máximo
        //El tamaño es fijo (estatico)
        String nombresAlumnos[] = new String[30];

        //Podemos asignar valores a un array por la posicion
        nombresAlumnos[0] = "Juan";
        
        //Rellenamos el array con numeros
        for (int i=0;i<30;i++)
        {
            nombresAlumnos[i] = "nombre" + (i+1);
        }

        //Con un for recorremos el array y lo sacamos por pantalla
        //Este for especial en otros lenguajes se denomina foreach
        for (String nombre : nombresAlumnos)
        {
            System.out.println(nombre);
        }

        //Ejemplo sacar el nombre correspondiente a la edad mínima

        for (int i=0;i<edadesAlumnos.length;i++)
        {
            //Para calcular el mínimo miramos si el minimo actual es menor
            //Que el valor de la posicion i
            if (edadesAlumnos[i]<minEdad) 
                {
                    minEdad=edadesAlumnos[i];
                    posMinimo=i;
                }
        }

        System.out.println("El nombre del alumno mas joven es " + nombresAlumnos[posMinimo] + " y su edad es " + edadesAlumnos[posMinimo]); 

    }
}