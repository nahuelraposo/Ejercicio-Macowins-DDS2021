package dominio;

import java.math.BigDecimal;

public class VentaConTarjeta extends Venta{
    int cantidadCuotas;
    int coeficienteTarjeta;

    @Override
    public Double precioVenta() {
        return  super.precioVenta()*0.01 +
                cantidadCuotas*coeficienteTarjeta + super.precioVenta();
    }
}
