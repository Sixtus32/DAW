/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface.ejercicio5;

/**
 * Clase Punto que representa los puntos de coordenada cartesiana.
 * @author Sixtus32 <https://github.com/Sixtus32>
 */
public class Punto implements Comparable<Punto>{
    
    private double coordX;
    private double coordY;
    
    private final int MAYOR_QUE=1;
    private final int IGUAL_QUE=0;
    private final int MENOR_QUE=-1;

    public Punto(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() == obj.getClass()){
            Punto p=(Punto) obj;
            if(this.coordX == p.getCoordX() && this.coordY == p.getCoordY()){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.coordX) ^ (Double.doubleToLongBits(this.coordX) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.coordY) ^ (Double.doubleToLongBits(this.coordY) >>> 32));
        return hash;
    }
    
    @Override
    public String toString() {
        return "Coordenadas : "  + "( " + this.coordX + ", "+ this.coordY+")";
    }

    @Override
    public int compareTo(Punto o) {
        int compareValue=0;
        
        try {
            if (this.coordX >= o.getCoordX() && this.coordY >= o.getCoordY()){
                compareValue=MAYOR_QUE;
            }else if(this.coordX <= o.getCoordX() && this.coordY <= o.getCoordY()){
                compareValue=MENOR_QUE;
            }else {
                compareValue=IGUAL_QUE;
            }
        }catch(Exception e){
            System.out.println("Se produjo un error.");
        }
        
        return compareValue;
    }
    
    
    
}
