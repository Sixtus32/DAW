
public class ArrayObject{
  public static void main(String [] args){
    Empleados [] emp = new Empleados[5];
    emp[0] = new Empleados("Daniel",8);
    emp[1] = new Empleados("Diego",23);
    emp[2] = new Empleados("Pablo",14);
    emp[3] = new Empleados("Ana",17);
    emp[4] = new Empleados("Nadia",9);

    for (Empleados em : emp){
      System.out.println(em.getNombre());
      System.out.println(em.getEdad());
    }

  }
}

public class Empleados {

  private String nombre;
  private int edad;

  public Empleados (String nom,int ed){
    this.nombre = nom;
    this.edad = ed;
  }

  public void setNombre(String n){
    this.nombre = n;
  }
  public String getNombre(){
    return this.nombre;
  }
  
  public void setEdad(int n){
    this.edad = n;
  }

  public int getEdad(){
    return this.edad;
  }

}

