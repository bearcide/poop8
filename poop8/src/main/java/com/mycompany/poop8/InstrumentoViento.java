/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop8;

/**
 *
 * @author emilio
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {
    
    

    @Override
    public void tocar() {
        System.out.println("Tocar instrumento de viento");
    }

    @Override
    public void afinar() {
        System.out.println("Afinar un instrumento de viento");
    }

    @Override
    public String tipoInstrument() {
        return "Instrumento de viento";
    }
    
}
