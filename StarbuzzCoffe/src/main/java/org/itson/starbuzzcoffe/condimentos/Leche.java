/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.starbuzzcoffe.condimentos;

import org.itson.starbuzzcoffe.interfaces.Bebida;
import org.itson.starbuzzcoffe.interfaces.Condimento;

/**
 *
 * @author Elkur
 */
public class Leche extends Condimento {

    public Leche(Bebida bebida, String descripcion, double costo) {
        super(bebida, descripcion, costo);
    }

    @Override
    public double getCosto() {
        return this.getBebida().getCosto() + super.getCosto();
    }

    @Override
    public String toString() {
        return this.getBebida().toString() + " con leche";
    }
}
