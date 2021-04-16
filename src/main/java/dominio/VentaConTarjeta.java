package dominio;

public class VentaConTarjeta extends Venta{
    int cantidadCuotas;
    int coef;

    @Override
    public Double precioVenta() {
        return super.precioVenta()*0.01 + cantidadCuotas*coef + super.precioVenta();
    }
}
