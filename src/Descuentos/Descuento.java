package Descuentos;

public class Descuento extends DescuentoPorcentajeConTope {
    protected String descripcion;
    protected int unidades;
    protected int descuento;


    public Descuento(String descripcion, int unidades, int descuento, double descuentoTope) {
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.descuento = descuento;
        this.setDescuentoConTope(descuentoTope);
    }

    public int getDescuento() {
        return this.descuento;
    }

    public int getUnidades() {
        return this.unidades;
    }

}
