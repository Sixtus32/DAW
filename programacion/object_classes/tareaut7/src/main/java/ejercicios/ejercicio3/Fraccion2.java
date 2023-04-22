/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio3;

/**
 * Clase se sobre Fracciones.
 * @author Sixtus32
 */
public class Fraccion2 implements Comparable<Fraccion2>, Relaciones2{
     /**
     * numerador de la fraccion.
     */
    private int numerador;
    /**
     * denominador de la fraccion.
     */
    private int denominador;
    
    
    /**
     * Constructor. Crea una fraccion con el numerador y denominador que se introduzca.
     * @param numberador Recibe el valor del numerador de la fraccion.
     * @param denominador Recibe el valor del denominador de la fraccion.
     */
    public Fraccion2(int numberador, int denominador) {
        this.numerador = numberador;
        this.denominador = denominador;
    }
    /**
     * Devuelve la suma de dos fracciones.
     * @param f Fraccion que recibe para la suma.
     * @return  Retorna la suma de esta fracccion con f.
     */
    public Fraccion2 sumaDeFracciones(Fraccion2 f){
        if (this.denominador == f.getDenominador()) {
            return new Fraccion2(this.numerador >= f.getNumberador() ? this.numerador + f.getNumberador() : f.getNumberador() + this.numerador, this.denominador);
        }
        int nuevoDenominador=this.denominador * f.getDenominador();
        return new Fraccion2(((nuevoDenominador / this.denominador) * this.numerador) + ((nuevoDenominador / f.getDenominador()) * f.getNumberador()), nuevoDenominador);
    }
    
    /**
     * Devuelve la resta de dos fracciones.
     * @param f Fraccion que recibe para la resta.
     * @return  Retorna la resta de esta fraccion con f.
     */
    public Fraccion2 restaDeFracciones(Fraccion2 f){
        if (this.denominador == f.getDenominador()) {
            return new Fraccion2(this.numerador >= f.getNumberador() ? this.numerador - f.getNumberador() : f.getNumberador() - this.numerador, this.denominador);
        }
        int nuevoDenominador=this.denominador * f.getDenominador();
        return new Fraccion2(((nuevoDenominador / this.denominador) * this.numerador) - ((nuevoDenominador / f.getDenominador()) * f.getNumberador()), nuevoDenominador);
    }
    
    /**
     * Devuelve el valor del denominador de la fraccion.
     * @return Retorna el valor del atributo numerador.
     */
    public int getNumberador() {
        return numerador;
    }
    
    /**
     * Modifica el numerador de la fraccion.
     * @param numberador Recibe un numerador para la fracción actual.
     */
    public void setNumberador(int numberador) {
        this.numerador = numberador;
    }

    /**
     * Devuelve el valor del denominar de la fraccion.
     * @return Retorna el valor del atributo denominador.
     */
    public int getDenominador() {
        return denominador;
    }
    
    /**
     * Modifica el denominador de la fraccion.
     * @param denominador Recibe un denominador para la fraccion actual.
     */
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }   
     
    /**
     * Simplifica la fraccion
     * @return Retorna la fraccion simplificada.
     */
    public Fraccion2 simplificar(){
        int mcd=encontrarMCD(this.numerador, denominador);
        this.setNumberador(this.numerador / mcd);
        this.setDenominador(this.denominador / mcd);  
        return this;
    }
    /**
     * Halla el m.c.d
     * @param numerador Recibe el denominador de la fraccion.
     * @param denominador Recibe el numerador de la fraccion.
     * @return Retorna el valor del minimo común divisor.
     */
    private int encontrarMCD(int numerador, int denominador){
        return (denominador == 0) ? numerador : encontrarMCD(denominador, numerador % denominador);
    }
    
    /**
     * Método sobre-escrito - que indica si la fraccion actual es mayor que b.
     * @param b Recibe un objeto que castea a fraccion.
     * @return Retorna true o false según sea el this mayor o no del b.
     */
    @Override
    public boolean esMayor(Object b) {
        Fraccion2 f= this.getClass().cast(b);
        if (this.denominador == f.getDenominador()) {
            return (this.numerador > f.getNumberador());
        }
        int nuevoDenominador=this.denominador * f.getDenominador();
        return (((nuevoDenominador / this.denominador) * this.numerador) > ((nuevoDenominador / f.getDenominador()) * f.getNumberador()));
    }
    
    /**
     * Método sobre-escrito - que indica si la fraccion actual es menor que b.
     * @param b Recibe un objeto que castea a fraccion.
     * @return Retorna true o false según sea el this menor o no del b.
     */
    @Override
    public boolean esMenor(Object b) {
        Fraccion2 f= this.getClass().cast(b);
        if (this.denominador == f.getDenominador()) {
            return (this.numerador < f.getNumberador());
        }
        int nuevoDenominador=this.denominador * f.getDenominador();
        return (((nuevoDenominador / this.denominador) * this.numerador) < ((nuevoDenominador / f.getDenominador()) * f.getNumberador()));
    }
    
    /**
     * Método sobre-escrito - que indica si la fraccion actual es igual que b.
     * @param b Recibe un objeto que castea a fraccion.
     * @return Retorna true o false según sean iguales o no.
     */
    @Override
    public boolean esIgual(Object b) {
        Fraccion2 f= this.getClass().cast(b);
        return this.numerador == f.getNumberador() && this.denominador == f.getDenominador();
    }
    
    /**
     * Devuelve una representacion en cadena de texto acerca del objeto.
     * @return Retorna la fraccion con su numerador y denominador correspondiente.
     */
    @Override
    public String toString() {
        return "\n\nFraccion : " + numerador + " / " + denominador;
    }
    
    /**
     * Compara dos fracciones.
     * @param otraFraccion Recibe una fraccion distinta
     * @return Retorna un -1, 1 o 0 según sea menor, mayor o igual
     */
    @Override
    public int compareTo(Fraccion2 otraFraccion) {
        if (this.esMenor(otraFraccion)) {
            return -1;
        }else if(this.esMayor(otraFraccion)){
            return 1;
        }else {
            return 0;
        }
    }
}
