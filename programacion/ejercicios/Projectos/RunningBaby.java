
public class RunningBaby{
  public static void main(String [] args){
    try{
      Runtime r = Runtime.getRuntime();
      int valor = r.availableProcessors();
      Process proc = r.exec("clear");
      System.out.println(valor);
      System.out.println(r.freeMemory());
      r.exit(0);
    }catch(Exception e){
      System.out.println("Algo salió muy mal.");
    }
  }
}
