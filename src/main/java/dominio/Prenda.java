package dominio;

import dominio.estado.EstadoPrenda;

public class Prenda {
    Double precioBase;
    TipoPrenda tipoPrenda;
    EstadoPrenda estado;

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
