/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_cuenta;

/**
 *
 * @author s6x
 */
public class Alumnos implements Comparable<Alumnos>{
    private int numExp;
    private double calExp;

    public Alumnos(int numExp, double calExp) {
        this.numExp = numExp;
        this.calExp = calExp;
    }

    public double getCalExp() {
        return calExp;
    }

    public int getNumExp() {
        return numExp;
    }
    
    

    @Override
    public String toString() {
        return "Alumno ."; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Alumnos o) {
        if(this.numExp < o.numExp) return -1;
        else if(this.numExp > o.numExp) return 1;
        else return 0;
    }
    
    
}
