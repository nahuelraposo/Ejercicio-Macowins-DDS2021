package dominio.estado;

import java.math.BigDecimal;

public class Promocion implements EstadoPrenda{
    int descuento;

    public Double precioFinal(Double precioOriginal){

        return precioOriginal * (descuento/100);
    }
}
