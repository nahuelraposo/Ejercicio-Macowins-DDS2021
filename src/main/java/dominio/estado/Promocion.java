package dominio.estado;

public class Promocion implements EstadoPrenda{
    int descuento;

    public Double precioFinal(Double precioOriginal){
        return precioOriginal * (descuento/100);
    }
}
