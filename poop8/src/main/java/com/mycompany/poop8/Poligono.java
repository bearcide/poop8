/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop8;

/**
 *
 * @author Equipo2
 * Es la clase abstracta poligono, que tiene dos metodos sin definir y otro que lo convierte a cadena
 */
public abstract class Poligono extends Object{
    
    public Poligono(){
    }
    
    public abstract int area();
    
    public abstract int perimetro();

    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
