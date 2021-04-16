package dominio;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Macowins {
    List<Venta> ventas;

    public Double gananciasDeXDia(Date fecha){
        return filtrarVentasDeUnDia(fecha).stream().
                mapToDouble(venta -> venta.precioVenta()).
                sum();
    }

    public List <Venta> filtrarVentasDeUnDia(Date fecha){
        return getVentas().stream().filter(venta -> venta.getFechaDeVenta() == fecha).collect(Collectors.toList());
    }

    public List<Venta> getVentas(){
        return ventas;
    }
}
