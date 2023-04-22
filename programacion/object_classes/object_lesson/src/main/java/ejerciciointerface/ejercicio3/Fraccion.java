/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointerface.ejercicio3;

/**
 * Clase que establece la cantidad en proporciones de un todo, y las relaciones entre estas.
 * @version 1.0
 * @author Sixtus32 <https://github.com/Sixtus32>
 * @see Relaciones
 */
public class Fraccion implements Relaciones, Comparable<Fraccion>{
    /**
     * numerador de la fracción.
     */
    private int numerador;
    /**
     * denominador de la fracción.
     */
    private int denominador;
    
    /**
     * Constructor. Crea una fracción con el numerador y denominador que se introduzca.
     * @param numberador Recibe el valor del numerador de la fracción.
     * @param denominador Recibe el valor del denominador de la fracción.
     */
    public Fraccion(int numberador, int denominador) {
        this.numerador = numberador;
        this.denominador = denominador;
    }
    /**
     * Devuelve la suma de dos fracciones.
     * @param f Fracción que recibe para la suma.
     * @return  Retorna la suma de esta fracccion con f.
     */
    public Fraccion sumaDeFracciones(Fraccion f){
        if (this.denominador == f.getDenominador()) {
            return new Fraccion(this.numerador >= f.getNumberador() ? this.numerador + f.getNumberador() : f.getNumberador() + this.numerador, this.denominador);
        }
        int nuevoDenominador=this.denominador * f.getDenominador();
        return new Fraccion(((nuevoDenominador / this.denominador) * this.numerador) + ((nuevoDenominador / f.getDenominador()) * f.getNumberador()), nuevoDenominador);
    }
    
    /**
     * Devuelve la resta de dos fracciones.
     * @param f Fracción que recibe para la resta.
     * @return  Retorna la resta de esta fracción con f.
     */
    public Fraccion restaDeFracciones(Fraccion f){
        if (this.denominador == f.getDenominador()) {
            return new Fraccion(this.numerador >= f.getNumberador() ? this.numerador - f.getNumberador() : f.getNumberador() - this.numerador, this.denominador);
        }
        int nuevoDenominador=this.denominador * f.getDenominador();
        return new Fraccion(((nuevoDenominador / this.denominador) * this.numerador) - ((nuevoDenominador / f.getDenominador()) * f.getNumberador()), nuevoDenominador);
    }
    
    /**
     * Devuelve el valor del denominador de la fracción.
     * @return Retorna el valor del atributo numerador.
     */
    public int getNumberador() {
        return numerador;
    }
    
    /**
     * Modifica el numerador de la fracción.
     * @param numberador Recibe un numerador para la fracción actual.
     */
    public void setNumberador(int numberador) {
        this.numerador = numberador;
    }

    /**
     * Devuelve el valor del denominar de la fracción.
     * @return Retorna el valor del atributo denominador.
     */
    public int getDenominador() {
        return denominador;
    }
    
    /**
     * Modifica el denominador de la fracción.
     * @param denominador Recibe un denominador para la fracción actual.
     */
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }   
     
    /**
     * Simplifica la fracción
     * @return Retorna la fracción simplificada.
     */
    public Fraccion simplificar(){
        int mcd=encontrarMCD(this.numerador, denominador);
        this.setNumberador(this.numerador / mcd);
        this.setDenominador(this.denominador / mcd);  
        return this;
    }
    /**
     * Halla el m.c.d
     * @param numerador Recibe el denominador de la fracción.
     * @param denominador Recibe el numerador de la fracción.
     * @return Retorna el valor del mínimo común divisor.
     */
    private int encontrarMCD(int numerador, int denominador){
        return (denominador == 0) ? numerador : encontrarMCD(denominador, numerador % denominador);
    }
    
    /**
     * Método sobre-escrito - que indica si la fracción actual es mayor que b.
     * @param b Recibe un objeto que castea a fracción.
     * @return Retorna true o false según sea el this mayor o no del b.
     */
    @Override
    public boolean esMayor(Object b) {
        Fraccion f= this.getClass().cast(b);
        if (this.denominador == f.getDenominador()) {
            return (this.numerador > f.getNumberador());
        }
        int nuevoDenominador=this.denominador * f.getDenominador();
        return (((nuevoDenominador / this.denominador) * this.numerador) > ((nuevoDenominador / f.getDenominador()) * f.getNumberador()));
    }
    
    /**
     * Método sobre-escrito - que indica si la fracción actual es menor que b.
     * @param b Recibe un objeto que castea a fracción.
     * @return Retorna true o false según sea el this menor o no del b.
     */
    @Override
    public boolean esMenor(Object b) {
        Fraccion f= this.getClass().cast(b);
        if (this.denominador == f.getDenominador()) {
            return (this.numerador < f.getNumberador());
        }
        int nuevoDenominador=this.denominador * f.getDenominador();
        return (((nuevoDenominador / this.denominador) * this.numerador) < ((nuevoDenominador / f.getDenominador()) * f.getNumberador()));
    }
    
    /**
     * Método sobre-escrito - que indica si la fracción actual es igual que b.
     * @param b Recibe un objeto que castea a fracción.
     * @return Retorna true o false según sean iguales o no.
     */
    @Override
    public boolean esIgual(Object b) {
        Fraccion f= this.getClass().cast(b);
        return this.numerador == f.getNumberador() && this.denominador == f.getDenominador();
    }
    
    /**
     * Devuelve una representación en cadena de texto acerca del objeto.
     * @return Retorna la fracción con su numerador y denominador correspondiente.
     */
    @Override
    public String toString() {
        return "\n\nFraccion : " + numerador + " / " + denominador;
    }
    
    /**
     * Compara dos fracciones.
     * @param otraFraccion Recibe una fracción distinta
     * @return Retorna un -1, 1 o 0 según sea menor, mayor o igual
     */
    @Override
    public int compareTo(Fraccion otraFraccion) {
        if (this.esMenor(otraFraccion)) {
            return -1;
        }else if(this.esMayor(otraFraccion)){
            return 1;
        }else {
            return 0;
        }
    }
    
    
}
