
package ejercicios06.ejercicio7;


public class Socio {

  private String nombre;

  private String apellido;

  private String direccion;

  public Mediateca mediateca;

  private Multimedia [] soporte;
  private int numPrestamos=0;
  // agregados 
  private final int MAX_PRESTADO=3;
  
    public Socio() {
        soporte = new Multimedia[MAX_PRESTADO];
    }
  
   
    public Socio(String nombre, String apellido, String direccion) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }
 

  public void tomarPrestado(Multimedia s) {
      if (numPrestamos >= 3){
          System.out.println("Error. Ya tienes 3 objetos en préstamo ");
      }else {
          this.soporte[numPrestamos++]=s;
          s.prestadoA(this);
          s.getAlquila();
      }
  }

  public void devolver(Multimedia s) {
      for(int i = 0; i < numPrestamos; i++){
          if (this.soporte[i] == s){
              soporte[i] = soporte[--numPrestamos];
              soporte[numPrestamos]=null;
              s.cambiarDisponibilidad();
          }else{
              System.out.println("Error. Este objeto no fue prestado.");
          }
      }
  }

    @Override
    public String toString() {
        String info="Socio.";
        info += "\n********************************";
        info += "\n\tNombre : " + this.nombre;
        info += "\n\tApellido : " + this.apellido;
        info += "\n\tDirección : " + this.direccion;
        return info; //To change body of generated methods, choose Tools | Templates.
    }
  
  
  

}
