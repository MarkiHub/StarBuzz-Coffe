/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.starbuzzcoffe.cafe;

import org.itson.starbuzzcoffe.interfaces.Bebida;

/**
 * Un objeto en concreto
 *
 * @author Elkur
 */
public class Expresso extends Bebida {

    public Expresso(String descripcion, double costo) {
        super(descripcion, costo);
    }

    @Override
    public String toString() {
        return super.toString() + " Expresso";
    }
}
