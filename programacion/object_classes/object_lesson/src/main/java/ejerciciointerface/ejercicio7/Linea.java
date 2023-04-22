/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface.ejercicio7;

import ejerciciointerface.ejercicio10.Modificable;
import ejerciciointerface.ejercicio3.Relaciones;

/**
 *
 * @author Sixtus32 <https://github.com/Sixtus32>
 */
public class Linea implements Relaciones, Comparable<Linea>, Modificable{
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Linea(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    
    
    public double longitud(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    
    public double longitud(Linea linea){
        return Math.sqrt(Math.pow((linea.getX2() - linea.getX1()), 2) + Math.pow((linea.getY2() - linea.getY1()), 2));
    }
    
    public double longitud(){
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    

    @Override
    public boolean esMayor(Object b) {
        if(!(b instanceof Linea)){
            return false;
        }
        Linea otraLinea=(Linea) b;
        return (this.longitud() > otraLinea.longitud());
    }

    @Override
    public boolean esMenor(Object b) {
        if(!(b instanceof Linea)){
            return false;
        }
        Linea otraLinea=(Linea) b;
        return (this.longitud() < otraLinea.longitud());
    }

    @Override
    public boolean esIgual(Object b) {
        if(!(b instanceof Linea)){
            return false;
        }
        Linea otraLinea=(Linea) b;
        return (this.x1 == otraLinea.getX1() && this.y1 == otraLinea.getY1() && this.x2 == otraLinea.getX2() && this.y2 == otraLinea.getY2());
    }

    @Override
    public String toString() {
        return "\n\nLinea : " + "\n\tx1 = " + this.x1 + "\n\ty1 = " + this.y1+ "\n\tx2 = " + this.x2 + "\n\ty2 = " + this.y2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Linea o) {
        if(this.longitud() > o.longitud()){
            return 1;
        }else if(this.longitud() < o.longitud()){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public String nombreClase() {
        return Relaciones.super.nombreClase(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aumentar(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void disminuir(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
