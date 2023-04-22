/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_cuenta;

/**
 *
 * @author DAW
 */
public class Cuenta {

    private double saldo;
    private Persona titular;
    private String[] ultimosMov;
    private final static int NUM_OP=10;
    private int operacion=0;

    public Cuenta(double saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;
        this.ultimosMov = new String[NUM_OP];
    }

    public double getsaldo() {
        return saldo;
    }

    public void setsaldo(float Saldo) {
        this.saldo = Saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    
    /**
     * Realiza un reintegro en la cuenta.
     * @param c cantidad a reintegrar
     * @return devuelve true o false segun si se efectuo la operacion.
     * @throws SaldoNegativo 
     */
    public boolean reintegro(double c) throws SaldoNegativo{
        boolean hecho = false;
        if(c > this.saldo){
            throw new SaldoNegativo("Error: No se puede realizar la operacion.");
        }
        if((this.saldo-c)<0){
            if(operacion>9){
                operacion=0;
                this.ultimosMov[operacion]="Reintegro de "+this.saldo*(-1)+"€";
                    operacion++;
            }else{
                this.ultimosMov[operacion]="Reintegro de "+this.saldo*(-1)+"€";
                    operacion++;
            }
            this.saldo=0;
        }else{
            this.saldo-=c;
            if(operacion>ultimosMov.length){
                operacion=0;
                this.ultimosMov[operacion]="Reintegro de "+Double.toString(c)+"€";
                    operacion++;
            }else{
                this.ultimosMov[operacion]="Reintegro de "+Double.toString(c)+"€";
                    operacion++;
            }
            
        }
        return hecho;
    }

    public void ingreso(double c) {
        this.saldo+=c;
        if(operacion>ultimosMov.length){
                operacion=0;
                this.ultimosMov[operacion]="Ingreso de "+Double.toString(c)+"€";
                    operacion++;
            }else{
                this.ultimosMov[operacion]="Ingreso de "+Double.toString(c)+"€";
                    operacion++;
            }
    }
//    
//    public void reintegro2(double c){
//        if (this.operacion < NUM_OP){
//            this.ultimosMov[operacion]="Reintegro de " + Double.toString(c) + "€";
//            this.operacion++;
//        }else {
//            this.operacion=0;
//            this.ultimosMov[operacion]="Reintegro de " + this.saldo + "€";
//        }
//    }
public void reintegro(double...c) {
    for (int i = 0; i < c.length; i++) {
        if((this.saldo-c[i])<0){
            if(operacion>9){
                operacion=0;
                this.ultimosMov[operacion]="Reintegro de "+this.saldo*(-1)+"€";
                    operacion++;
            }else{
                this.ultimosMov[operacion]="Reintegro de "+this.saldo*(-1)+"€";
                    operacion++;
            }
            this.saldo=0;
        }else{
            this.saldo-=c[i];
            if(operacion>9){
                operacion=0;
                this.ultimosMov[operacion]="Reintegro de "+Double.toString(c[i])+"€";
                    operacion++;
            }else{
                this.ultimosMov[operacion]="Reintegro de "+Double.toString(c[i])+"€";
                    operacion++;
            }
            
        }
    }
    }

    public void ingreso(double...c) {
        for (int i = 0; i < c.length; i++) {
        this.saldo+=c[i];
        if(operacion>9){
                operacion=0;
                this.ultimosMov[operacion]="Ingreso de "+Double.toString(c[i])+"€";
                    operacion++;
            }else{
                this.ultimosMov[operacion]="Ingreso de "+Double.toString(c[i])+"€";
                    operacion++;
            }
        }
    }
    public String verUltimos(){
        String info="\u0000";
        for (int i = 0; i < ultimosMov.length; i++) {
           info+="\n\t\t- "+this.ultimosMov[i];
        }
        return info;
    }

    @Override
    public String toString() {
        return "Cuenta:" + "\n\tSaldo=" + saldo + "\n\tTitular:"  + titular.toString() + "\n\tUltimos 10 Movimientos:" +verUltimos();
    }
    
     
}
