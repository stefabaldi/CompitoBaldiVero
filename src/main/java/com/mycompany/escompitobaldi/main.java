/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.escompitobaldi;

/**
 *
 * @author informatica
 */
public class main {
    
    public static void main(String []args){
    Semaforo pieno=new Semaforo(1);
    Semaforo vuoto=new Semaforo(1);
    
    BagnoUomini U=new BagnoUomini(pieno);
    BagnoDonne D=new BagnoDonne(vuoto);
    
    Persona P=new Persona(pieno,vuoto,D,U);
    Persona P1=new Persona(pieno,vuoto,D,U);
    
    
    P.setName("Tome");
    P1.setName("Fedora");
    
    P.start();
    P1.start();
    
    
    }
    
    
    
}
