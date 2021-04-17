package dominio.estado;

import java.math.BigDecimal;

public class Liquidacion implements EstadoPrenda {


    public Double precioFinal(Double precioOriginal) {
        return precioOriginal * 0.5;
    }
}