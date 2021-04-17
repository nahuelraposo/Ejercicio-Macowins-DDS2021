package dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public abstract class Venta {
    List<Prenda> prendasVendidas;
    LocalDate fechaDeVenta;

    public Double precioVenta(){
        return prendasVendidas.stream().
                mapToDouble(prenda -> prenda.precio()).
                sum();
    }

    public LocalDate getFechaDeVenta(){
        return fechaDeVenta;
    }

    public int cantidadPrendasVendidas(){
        return prendasVendidas.size();
    }

}
