/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia.Persona;

//enum Sexo {
//    H,
//    M
//    
//}
/**
 *
 * @author DAW
 */
public class Persona {
    private String nombre;
    private byte edad;
    private String dni;
    private char sex;
    private float peso;
    private float altura;
    
    //CONSTANTES DE CLASE
    private static final int BAJO_PESO=-1;
    private static final int PESO_IDEAL=0;
    private static final int SOBREPESO=1;
    
    private final static char SEXO_DEFAULT='H';

    public Persona() {
        this(null,(byte)0,SEXO_DEFAULT,0f,0f);
    }
    
    public Persona(String nom, byte edad, char sex){
        this(nom,edad,sex,0,0);
    }

    public Persona(String nombre, byte edad, char sex, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        generarDni();
        comprobarSexo(sex);
        this.peso = peso;
        this.altura = altura;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }
//
//    public void setDni(String dni) {
//        this.dni = dni;
//    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        comprobarSexo(sex);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    // Métodos públicos -> interfaz
    public int calculaIMC (){
        int valor=0;
        int imc=(int) (this.peso / Math.pow(this.altura, 2));
        if( imc < 20){
            valor = BAJO_PESO;
        }else if (imc >= 20 && imc <= 25){
            valor = PESO_IDEAL;
        }else if(25 < imc){
            valor = SOBREPESO;
        }
        return valor;
    }
    
    public boolean esMayorEdad(){
        return (this.edad >= 18);
    }
    
    @Override
    public String toString() {
        String info = "\nPersona.\n*********************";
        info += "\n\tNombre : " + getNombre();
        info += "\n\tEdad : " + this.edad;
        info += "\n\tDNI : " + this.dni;
        info += "\n\tSexo : " + this.sex;
        info += "\n\tPeso : " + this.peso;
        info += "\n\tAltura : " + this.altura;
        info += "\n*********************";
        return info; 
    }
    
    //Métodos Auxliares.
    private void generarDni(){
        String str="";
        for (int i = 0; i < 8; i++) {
            str += (char)(Math.random() * (57 - 48 + 1) + 48);
        }
        int val = Integer.parseInt(str);
        char dni1 = "TRWAGMYFPDXBNJZSQVHLCKE".charAt( (int)(val % 23) );
        this.dni = val + "-" + dni1;
    }
    
    //faltando por definir
    private void comprobarSexo(char c){
        if(Character.toUpperCase(c) == 'H' || Character.toUpperCase(c) == 'M'){
            this.sex=c;
        }else{
            this.sex=SEXO_DEFAULT;
        }
    }



    
    
    
    

    
}
