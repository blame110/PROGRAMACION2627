package unidad3;

public class EjemploUsoBasico {
    
    public static void main(String[] args) {
        System.out.println("Hola estoy en el main");

        //Ejemplo de recorrer los parametros que recibe el comando al ejecutarse
        for(String parametro: args){
            System.out.println("Parametro  " + parametro );
        }   

        int edad =9;
        String nombre;
        //Un objeto es la instancia de una clase, es decir la clase define el funcionamiento
        //o plantilla de datos y el objeto es una variable funcional que guarda los datos
        Producto gta6 = new Producto();
        Producto gta3 = new Producto();
 
        gta6.nombre = "Gran Theft Auto";
        gta6.precio = 89.99;
        gta6.categoria = "freeroam";

        //Las variables primitivas son copias independientes con datos
        //guardados en zonas distintas, no se pisan
        int edad2= edad;
        edad2 = 12;

        gta3.nombre = "jjjj";
        //Los objetos si se asignan, son el mismo, se copia la referencia al dato
        //Si se modifica cualquiera de los dos el otro tambíen será modificado
        Producto gta5 = gta6;
        gta5.nombre = "Gta 5 es mas chuli";

        System.out.println("El precio es " + gta6.precio);
        System.out.println("El nombre es " + gta6.nombre);

        //llamamos a la funcion con 10 de argumento que se mapea en la variable porcentaje
        gta6.aplicarDescuento(10);

        System.out.println("El precio es " + gta6.precio);

        int nuevoStock = gta6.recibirStock(100);
        System.out.println("El stock actualizado es " + nuevoStock);
 
    }


}
