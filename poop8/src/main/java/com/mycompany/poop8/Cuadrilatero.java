/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop8;

/**
 *
 * @author Equipo2
 */
public class Cuadrilatero extends Poligono{
    private int alfa, gama, beta;
    private float a, b;
    private float base, alt;

    public Cuadrilatero() {
    }

    /**
     * 
     * @param alfa Es el angulo alfa
     * @param gama Es el angulo gama
     * @param beta Es el angulo beta
     * @param a Es la medida de un lado
     * @param b Es la medida de longitud del otro lado
     * @param base Valor de la base
     * @param alt Altura
     */
    public Cuadrilatero(int alfa, int gama, int beta, float a, float b, float base, float alt) {
        this.alfa = alfa;
        this.gama = gama;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.alt = alt;
    }

    public int getAlfa() {
        return alfa;
    }

    public int getGama() {
        return gama;
    }

    public int getBeta() {
        return beta;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getBase() {
        return base;
    }

    public float getAlt() {
        return alt;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public void setGama(int gama) {
        this.gama = gama;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAlt(float alt) {
        this.alt = alt;
    }
    /**
     * Calcula el perimetro de un cuadrilatero
     * @return 
     */
    @Override
    public int perimetro() {
        return (int)(2*a+2*b); 
    }
    /**
     * Convierte a cadena mis elementos
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + "Cuadrilatero{" + "alfa=" + alfa + ", gama=" + gama + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", alt=" + alt + '}';
    }
    /**
     * Obtiene el valor de la area
     * @return 
     */
    @Override
    public int area() {
        return (int)(alt*base); 
    }
    
}
