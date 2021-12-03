/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Gabriel Herrera
 */
public class BasicCardCreator extends CardCreator {

    @Override
    public Card createCard() {
        //Crea una tarjeta Basica con su limite y costo debido
        return new BasicCard();
    }
}
