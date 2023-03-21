package Clase06Ejercicio02;

import Descuentos.Descuento;

public class Carrito extends Descuento {
    private double costoFinal;

    public Carrito(String descripcion, int unidades, int descuento, double descuentoTope) {
        super(descripcion, unidades, descuento, descuentoTope);
    }

    public double calcularTotal(Producto productos){
        double total = 0;
            if(productos.getCantidad() >= this.getUnidades()){
                total = productos.getCantidad() * (productos.getPrecio() - ((productos.getPrecio() * this.getDescuento()) / 100));
                costoFinal += total;
                return total;
            } else {
                total = productos.getPrecio() * productos.getCantidad();
                costoFinal += total;
                return total;
            }
    }

    public String tieneDescuento(Producto productos){
        if(productos.getCantidad() >= this.getUnidades())
            return Integer.toString(this.getDescuento());
        else
            return "0";
    }

    public double costoFinal(){
        return costoFinal;
    }


    //Agregue un nuevo descuento %, pero que tenga un tope Fijo
    public double descuentoTopeFijo(Producto productos){
        double precioMaximo = 30;
        double descuentoMaximo = precioMaximo * (this.descuentoConTope / 100);
        costoFinal += productos.getPrecio() - descuentoMaximo;
        return productos.getPrecio() - descuentoMaximo;
    }
}
