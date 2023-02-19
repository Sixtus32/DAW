/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_clientela;

/**
 *
 * @author DAW
 */
public class Coche {
    private Motor motor;
    private Rueda [] ruedas;
    private Puerta [] puertas;
    private static final int NUM_RUEDAS=4;
    private static final int NUM_PUERTAS=2;
    private float capacidadGasolina;

    public Coche() {
        this.motor=new Motor();
        this.ruedas=new Rueda[NUM_RUEDAS];
        this.puertas=new Puerta[NUM_PUERTAS];
        this.capacidadGasolina=100F;
    }
    
    //opcional
    public Coche(Motor motor, 
                            Rueda rdd, 
                            Rueda rdi, 
                            Rueda rtd, 
                            Rueda rti, 
                                Puerta pd, 
                                Puerta pi){
        this();
        this.motor=motor;
        this.ruedas[0]=rdd;
        this.ruedas[1]=rdi;
        this.ruedas[2]=rtd;
        this.ruedas[3]=rti;
        this.puertas[0]=pd;
        this.puertas[1]=pi;
    }

    public static int getNUM_RUEDAS() {
        return NUM_RUEDAS;
    }

    public static int getNUM_PUERTAS() {
        return NUM_PUERTAS;
    }
    
    

    public float getCapacidadGasolina() {
        return capacidadGasolina;
    }

    public void setCapacidadGasolina(float capacidadGasolina) {
        this.capacidadGasolina = capacidadGasolina;
    }

    
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Puerta[] getPuertas() {
        return puertas;
    }

    public void setPuertas(Puerta[] puertas) {
        this.puertas = puertas;
    }
    
    public void setRuedas(Rueda r, int pos){
        if (pos >= 0 && pos < this.ruedas.length){
            this.ruedas[pos]=r;
        }
    }
    
    public Rueda getRueda(int position){
        if (position >= 0 && position < this.ruedas.length){
            return this.ruedas[position];
        }else {
            return null;
        }    
    }
    
    public void setPuerta(Puerta p, int pos){
        if (pos >= 0 && pos < this.puertas.length){
            this.puertas[pos]=p;
        }
    }
    
    public Puerta getPuerta(int position){
        if (position >= 0 && position < this.puertas.length){
            return this.puertas[position];
        }else {
            return null;
        }    
    }

    public float getGasolina() {
        return capacidadGasolina;
    }

    public void setGasolina(float gasolina) {
        this.capacidadGasolina = gasolina;
    }

    @Override
    public String toString() {
        String info="*******************\nCoche: \n";
        info+="\tMotor :  " + this.motor;
        int i=1;
        for (Rueda rueda : this.ruedas) {
            info += "\n\tRueda "+ i + rueda;
            i++;
        }
        int j=1;
        for (Puerta puerta : this.puertas) {
            info += "\n\tPuerta "+ j + puerta;
            j++;
        }
        info+="\n\tGasolina : " + this.capacidadGasolina;
        return info;
    }
    
    
    
    
}
