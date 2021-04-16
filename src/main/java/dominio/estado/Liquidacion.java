package dominio.estado;

public class Liquidacion implements EstadoPrenda{


    public Double precioFinal(Double precioOriginal){
        return precioOriginal/2;
    }
}
