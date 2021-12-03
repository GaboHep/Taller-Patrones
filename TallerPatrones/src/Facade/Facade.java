/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Gabriel Herrera
 */
public class Facade {
     public void transaccionSubsistema(){
         //Implementa las operaciones que hace uso de las subclases
     }
    
}

class SistemaWeb{
    //clase de sistema web
    public void transaccion(){
        //...
    }
}

class SistemaMovil{
    //clase de sistema movil
    public void transaccion(){
        //...
    }
}

class SistemaTelefonico{
    //clase de sistema telefonico
    public void transaccion(){
        //...
    }
}