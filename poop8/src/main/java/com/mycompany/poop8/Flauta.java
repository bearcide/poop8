/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop8;

/**
 *
 * @author Equipo2
 */
public class Flauta extends InstrumentoViento {
/**
 * Reescribe el atributo tipo de Instrumento y lo cambia a "Flauta"
 * @return 
 */
    @Override
    public String tipoInstrument() {
        return super.tipoInstrument() + ", Flauta";
    }
/**
 * Llama al metodo de la funcion madre, llamado afinar
 */
    @Override
    public void afinar() {
        super.afinar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
/**
 * Lllama al metodo tocar de la funcion madre
 */
    @Override
    public void tocar() {
        super.tocar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
