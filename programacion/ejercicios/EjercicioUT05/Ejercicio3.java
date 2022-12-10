/*
   Ejercicio 3.
 * */

public class Ejercicio3{
  public static void main(String [] args){

    //a. Crear un StringBuffer con la cadena "Hola Caracola" y muéstrala por consola.
    StringBuffer text = new StringBuffer("Hola Caracola");
    System.out.println(text);

    //b. Mostrar por consola su capacidad y longitud. Descubre cuál es la diferencia entre ambas propiedades y cuál es la capacidad por defecto.
    System.out.println("Capacidad : " + text.capacity() + "\nLongitud : "+ text.length());

    //c. Partiendo de la cadena anterior y usando los métodos de StringBuffer modifica la cadena para que pase a ser "Hay Caracolas" y muéstrala por consola.
    System.out.println("Cambio en el texto : " + text.append('s'));

    //d.Partiendo de la cadena anterior y usando los métodos de StringBuffer modifica la cadena para que pase a ser "Hay 5000 Caracolas" y muéstrala por consola. El número entero 5000 debe.estar almacenado en un int inicialmente.
    int num = 5000;
    System.out.println(text.replace(0,4,"Hay").insert(3,' ').insert(4,num));

    //e. Partiendo de la cadena anterior y usando los métodos de StringBuffer modificar la cadena para que pase a ser "Hay 5000 Caracolas en el mar" y muéstrala por consola.
    System.out.println(text.append(" en el mar"));
    
    //f. Almacenar en un String los últimos 4 caracteres del StringBuffer resultante y muestra ese String por consola.
    String str = text.substring(text.length() - 4, text.length());
    System.out.println(str);

    //g. Mostrar por consola la capacidad y longitud del StringBuffer final.
    System.out.println("Capacidad Final : " + text.capacity() + "\nLongitud Final : "+ text.length());

  }
}

