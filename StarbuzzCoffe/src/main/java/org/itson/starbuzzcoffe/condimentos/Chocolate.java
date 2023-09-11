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
public class Chocolate extends Condimento {

    public Chocolate(Bebida bebida, String descripcion, double costo) {
        super(bebida, descripcion, costo);
    }
    
    @Override
    public double getCosto(){
        return this.getBebida().getCosto()+super.getCosto();
    }

}
