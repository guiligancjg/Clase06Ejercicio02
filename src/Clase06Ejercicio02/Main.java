package Clase06Ejercicio02;

public class Main {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Obleas Rellenas",100,1,"De Naranja");
        Producto producto2 = new Producto("Galletitas Dulces",350,1,"Maná Vainilla");
        Producto producto3 = new Producto("Bebida de Avena",422,1,"Fortificada con Vitaminas");

        Carrito carrito = new Carrito("Llevate 3 productos con un descuento del %10",3,10,20);


        System.out.println("---El descuento fijo se limito a un máximo de $30 con un porcentaje del 20%---");
        System.out.println("cant\tPrecio\tProducto\t\t\t\t\tPrecioFinal DescuentoFijo");
        System.out.println(producto1.getCantidad()+"\t\t"+ producto1.getPrecio() + "\t" + producto1.getNombre() + "\t\t\t\t" + carrito.descuentoTopeFijo(producto1));
        System.out.println(producto2.getCantidad()+"\t\t"+ producto2.getPrecio() + "\t" + producto2.getNombre() + "\t\t\t" + carrito.descuentoTopeFijo(producto2));
        System.out.println(producto3.getCantidad()+"\t\t"+ producto3.getPrecio() + "\t" + producto3.getNombre() + "\t\t\t\t" + carrito.descuentoTopeFijo(producto3));

        System.out.println("Costo Final a pagar: $" + carrito.costoFinal());
    }
}
