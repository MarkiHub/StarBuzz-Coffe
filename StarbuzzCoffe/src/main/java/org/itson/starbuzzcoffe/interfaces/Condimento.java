/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.starbuzzcoffe.interfaces;

/**
 *
 * @author Elkur
 */
public abstract class Condimento extends Bebida {

    private Bebida bebida;

    public Condimento(Bebida bebida, String descripcion, double costo) {
        super(descripcion, costo);
        this.bebida = bebida;
    }

    public Bebida getBebida() {
        return bebida;
    }

    @Override
    public String getDescripcion() {
        return this.getDescripcion();
    }

}
