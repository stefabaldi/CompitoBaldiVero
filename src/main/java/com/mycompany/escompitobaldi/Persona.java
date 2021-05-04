/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.escompitobaldi;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class Persona extends Thread 
{
    Semaforo pieno;
    Semaforo vuoto;
    
    
    BagnoDonne D;
    BagnoUomini U;

    public Persona(Semaforo pieno, Semaforo vuoto, BagnoDonne D, BagnoUomini U) {
        this.pieno = pieno;
        this.vuoto = vuoto;
        this.D = D;
        this.U = U;
    }
    
    
    
    
    public void run()
    {
        try {
            D.EntraBagno();
        } catch (InterruptedException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            U.EntraBagno();
        } catch (InterruptedException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        D.EsciBagno();
        U.EsciBagno();
        
        
    
    }
    
    
    
    
}
