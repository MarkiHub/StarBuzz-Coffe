package org.itson.starbuzzcoffe.interfaces;

/**
 *
 * @author Elkur
 */
public abstract class Bebida {

    private String descripcion;
    private double costo;

    public Bebida(String descripcion, double costo) {
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return this.getClass()+"";
    }
    
}
