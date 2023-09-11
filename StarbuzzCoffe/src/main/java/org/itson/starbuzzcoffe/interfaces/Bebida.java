package org.itson.starbuzzcoffe.interfaces;

/**
 * Esta clase es la que se emplea como padre para las clases, ademas de
 * especificar los atributos basicos
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

    public String getDescripcion() {
        return descripcion;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Cafe";
    }

}
