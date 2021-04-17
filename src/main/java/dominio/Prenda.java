package dominio;

import dominio.estado.EstadoPrenda;

import java.math.BigDecimal;

public class Prenda {
    Double precioBase;
    TipoPrenda tipoPrenda;
    EstadoPrenda estado;

    public Prenda(Double precio, TipoPrenda tipo, EstadoPrenda estadoPrenda){
        this.precioBase = precio;
        this.tipoPrenda = tipo;
        this.estado = estadoPrenda;
    }

    public Double precio(){
        return getEstado().precioFinal(getPrecioBase());
    }

    public TipoPrenda getTipoPrenda(){
        return this.tipoPrenda;
    }

    public Double getPrecioBase(){
        return this.precioBase;
    }

    public EstadoPrenda getEstado(){
        return this.estado;
    }
}
