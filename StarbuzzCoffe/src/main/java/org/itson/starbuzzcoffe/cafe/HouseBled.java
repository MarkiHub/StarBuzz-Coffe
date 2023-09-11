/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.starbuzzcoffe.cafe;

import org.itson.starbuzzcoffe.interfaces.Bebida;

/**
 *
 * @author Elkur
 */
public class HouseBled extends Bebida {

    public HouseBled(String descripcion, double costo) {
        super(descripcion, costo);
    }

    @Override
    public String toString() {
        return super.toString() + " House bled";
    }
}
