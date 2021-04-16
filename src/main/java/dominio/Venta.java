package dominio;

import java.util.Date;
import java.util.List;

public abstract class Venta {
    List<Prenda> prendasVendidas;
    Date fechaDeVenta;

    public Double precioVenta(){
        return prendasVendidas.stream().
                mapToDouble(prenda -> prenda.precio()).
                sum();
    }

    public Date getFechaDeVenta(){
        return fechaDeVenta;
    }
    public int cantidadPrendasVendidas(){
        return prendasVendidas.size();
    }

    public void comprarPrenda(Prenda prenda){
        prendasVendidas.add(prenda);
    }


}
