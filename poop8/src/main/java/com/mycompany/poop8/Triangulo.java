/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop8;

/**
 *
 */
public class Triangulo extends Poligono{
    private int alfa, beta, gama; //angulos
    private float a, b, c;
    private float base, alt;

    public Triangulo() {
    }
/**
 * 
 * @param alfa Angulo alfa
 * @param beta Angulo beta
 * @param gama Angulo gama
 * @param a Longitud 1
 * @param b Longitud 2
 * @param c Longitud 3
 * @param base Medida de la base
 * @param alt Altura
 */
    public Triangulo(int alfa, int beta, int gama, float a, float b, float c, float base, float alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.gama = gama;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.alt = alt;
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public int getGama() {
        return gama;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
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

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public void setGama(int gama) {
        this.gama = gama;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAlt(float alt) {
        this.alt = alt;
    }
    /**
     * Desarrolla el calculo de la area y del perimetro
     * @return 
     */
    @Override
    public int area(){
        return (int)(base*alt)/2;
    }
    
    public int perimetro(){
        return (int)(a+b+c);
    }
    /**
     * Lo pasa a una cadena
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", alt=" + alt + '}';
    }
 
}
