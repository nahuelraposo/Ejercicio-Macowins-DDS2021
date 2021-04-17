package dominio;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Negocio {
    List<Venta> ventas;

    public Double gananciasDeXDia(LocalDate fecha){
        return filtrarVentasDeUnDia(fecha).stream().
                mapToDouble(venta -> venta.precioVenta()).
                sum();
    }

    public List <Venta> filtrarVentasDeUnDia(LocalDate fecha){
        return getVentas().stream().filter(venta -> venta.getFechaDeVenta() == fecha).collect(Collectors.toList());
    }

    public List<Venta> getVentas(){
        return ventas;
    }
}
