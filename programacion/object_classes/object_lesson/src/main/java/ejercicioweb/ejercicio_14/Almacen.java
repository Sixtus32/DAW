/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioweb.ejercicio_14;

/**
 *
 * @author sixtu
 */
public class Almacen {
    private Bebida [] [] bebidas;
    private final int numFilas;
    private final int numColumnas;

    public Almacen(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.bebidas=new Bebida[numColumnas][numColumnas];
    }
    
    // método para calcualar el precio de total
    public double calcularPrecioTotal(){
        double precioTotal=0;
        for (Bebida[] bebida : bebidas) {
            for (Bebida bebida1 : bebida) {
                if (bebida1 != null) {
                    precioTotal+=bebida1.getPrecio();
                }
            }
        }
        
        return precioTotal;      
    }
    
    // método para calcular el precio total por marca
    public double calcularPrecioTotalMarca(String marca){
        double precioTotal=0;
        for (Bebida[] bebida : bebidas) {
            for (Bebida bebida1 : bebida) {
                if (bebida1 != null && bebida1.getMarca().equalsIgnoreCase(marca)) {
                    precioTotal+=bebida1.getPrecio();
                }
            }
        }
        
        return precioTotal;
    }
    
    // metodo para calcular precio total por estanteria.
    public double calcularPrecioTotalEstanteria(int columna){
        double precioTotal=0;
        for (int i=0; i < bebidas.length; i++) {
            Bebida bebida=bebidas[i][columna];
            if (bebida != null) {
                precioTotal+=bebida.getPrecio();
            }
        }
        return precioTotal;
    }
    
    /*Agregar producto: agrega un producto en la primera posición libre,
    si el identificador esta repetido en alguno de las bebidas, 
    no se agregará esa bebida.*/
    public void agregarBebida(Bebida bebida){
        for (int i = 0; i < bebidas.length; i++) {
            for (int j = 0; j < bebidas[0].length; j++) {
                // Observamos si esta vacía.
                if (bebidas[i][j] == null && !repedidoID(bebida)) {
                    bebidas[i][j] = bebida;
                    break;               
            }
        }
    }
    }
    
    private boolean repedidoID(Bebida bebida){
        for (int i = 0; i < bebidas.length; i++) {
            for (int j = 0; j < bebidas[i].length; j++) {
                if (bebidas[i][j] != null && bebidas[i][j].getIdentificador() == bebida.getIdentificador()){
                    return true;
                }
            }
        }
        return false;
    }
    
    // Eliminar un producto: dado un ID, eliminar el producto del almacén.
    public void eliminarBebida(int idBebida){
        for (int i = 0; i < bebidas.length; i++) {
            for (int j = 0; j < bebidas[i].length; j++) {
                if (bebidas[i][j] != null && bebidas[i][j].getIdentificador() == idBebida){
                    bebidas[i][j]=null;
                    break;
                }
            }
        }
    }
    
    //Mostrar información: mostramos para cada bebida toda su información.
    public void mostrarInformacion(){
        System.out.println("\n\tInformación acerca de las bebidas : ");
        for (int i = 0; i < bebidas.length; i++) {
            for (int j = 0; j < bebidas[i].length; j++) {
                if (bebidas[i][j] != null) {
                    System.out.println("\n\t\t"+bebidas[i][j]);
                }
                
            }
            
        }
    }
    
}
