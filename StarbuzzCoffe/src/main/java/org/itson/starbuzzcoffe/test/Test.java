/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.starbuzzcoffe.test;

import org.itson.starbuzzcoffe.cafe.DarkRoast;
import org.itson.starbuzzcoffe.condimentos.Chocolate;
import org.itson.starbuzzcoffe.condimentos.Leche;
import org.itson.starbuzzcoffe.interfaces.Bebida;

/**
 *
 * @author Elkur
 */
public class Test {

    public static void main(String[] args) {
        Bebida cafe = new DarkRoast("cafe", 45);
        System.out.println(cafe + " " + cafe.getCosto());

        Bebida cafeConLeche = new Leche(cafe, "cafe", 10);
        System.out.println(cafeConLeche + " " + cafeConLeche.getCosto());

        Bebida cafeConLecheYChocolate = new Chocolate(cafeConLeche, "cafe", 12);
        System.out.println(cafeConLecheYChocolate + " " + cafeConLecheYChocolate.getCosto());

        Bebida cafeConLecheChocolateYLeche = new Leche(cafeConLecheYChocolate, "cafe", 10);
        System.out.println(cafeConLecheChocolateYLeche + " " + cafeConLecheChocolateYLeche.getCosto());

    }

}
