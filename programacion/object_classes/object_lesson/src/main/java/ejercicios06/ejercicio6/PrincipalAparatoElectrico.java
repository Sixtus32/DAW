/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios06.ejercicio6;

/**
 *
 * @author sixtu
 */
public class PrincipalAparatoElectrico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        AparatoElectronico[] ae = new AparatoElectronico[10];

        ae[0] = new AparatoElectronico(20f, "azul", 'A', (byte) 12);
        ae[1] = new Secadora();
        ae[2] = new Vitroceramica();
        ae[3] = new Secadora((byte)45);
        ae[4] = new Vitroceramica(true);
        ae[5] = new Vitroceramica(false);
        ae[6] = new Secadora(120f, (byte)60);
        ae[7] = new AparatoElectronico(120, "negro", 'A', (byte) 89);
        ae[8] = new AparatoElectronico(60f, (byte)92);
        ae[9] = new Secadora((byte)65);
        
        float sumAE = 0f, sumS = 0f, sumV = 0f;
        
        for (AparatoElectronico ae1 : ae) {
            System.out.println("\nPrecio Final : " + ae1.precioFinal());
            if (ae1 instanceof Vitroceramica) {
                sumV += ae1.precioFinal();
            } else if (ae1 instanceof Secadora) {
                sumS += ae1.precioFinal();
            } else if (ae1 instanceof AparatoElectronico){
                sumAE += ae1.precioFinal();
            }
        }
        
        System.out.println("Aparatos Eléctricos.\n\tPrecio total : " + sumAE);
        System.out.println("Secadora.\n\tPrecio total : " + sumS);
        System.out.println("Vitroceramica.\n\tPrecio total : " + sumV);

    }

}
