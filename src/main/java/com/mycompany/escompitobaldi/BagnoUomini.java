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
public class BagnoUomini 
{
    
    Semaforo pieno;

    public BagnoUomini(Semaforo pieno) {
        this.pieno = pieno;
    }
    
    
    
    
    public void EntraBagno() throws InterruptedException //metodo che permette al thread attraverso il semaforo di entrare nel bagno
    {
        
        pieno.P();
        System.out.println("Una donna è entrata nel bagno");
    
        
    
    }
    
    public void EsciBagno() //metodo che permette di uscire dal bagno al thread che è rappresentato dalla persona
    {
        pieno.V();
        System.out.println("Una donna è uscita dal bagno");
    
    
    }
    
    
    
}
