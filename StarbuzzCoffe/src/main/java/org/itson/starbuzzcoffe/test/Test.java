/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.starbuzzcoffe.test;

import org.itson.starbuzzcoffe.cafe.DarkRoast;
import org.itson.starbuzzcoffe.cafe.HouseBled;
import org.itson.starbuzzcoffe.condimentos.Chocolate;
import org.itson.starbuzzcoffe.condimentos.CremaBatida;
import org.itson.starbuzzcoffe.condimentos.Soya;
import org.itson.starbuzzcoffe.interfaces.Bebida;
import org.itson.starbuzzcoffe.interfaces.Condimento;

/**
 *
 * @author Elkur
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Dark roast");
        Bebida cafe = new DarkRoast("cafe", 50);
        System.out.println(cafe);
    }

}
