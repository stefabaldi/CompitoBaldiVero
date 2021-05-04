package com.mycompany.escompitobaldi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class BagnoDonne 
{
    Semaforo vuoto;

    public BagnoDonne(Semaforo vuoto) {
        this.vuoto = vuoto;
    }
    
    
    
    
    public void EntraBagno() throws InterruptedException //vedi commento del bagno uomini
    {
        
        vuoto.P();
        System.out.println("Un uomo e' entrato nel bagno");
        
    
    
    }
    
    public void EsciBagno()
    {
        vuoto.V();
        System.out.println("Un uomo è uscito dal bagno");
    
    
    }
}
