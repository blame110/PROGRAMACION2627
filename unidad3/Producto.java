package unidad3;

public class Producto {
    
    String nombre;
    String categoria;
    double precio;
    int stock;

    /**
     * Una funcion tiene cuatro partes
     * modificadores tipo_devuelto nombre_funcion(parametros)
     * modificadores: Indica propiedades de la funcion, como quien puede ejecutarla
     * tipo_devuelte: una vez acaba de ejecutarse siempre devuelve algo,
     *  el tipo devuelto indica el tipo de lo que se devuelve
     * nombre_funcion: el nombre de la funcion, debe de dejar claro que hace
     * parametros: las variables que recibe
     * @param descuento
     */
    public void aplicarDescuento(int porcentaje)
    {
        this.precio = this.precio - this.precio*porcentaje/100;
        return;
    }

    /**
     * Incrementa el stock del producto actual y lo devuelve actualizado
     * @param incremento cantidad de unidades nuevas para el stock
     * @return El stock actualizado
     */
    public int recibirStock(int incremento)
    {
        this.stock += incremento;
        return this.stock;
    }


}
