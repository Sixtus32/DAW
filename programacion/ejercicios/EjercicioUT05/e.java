
public class e{
  public static void main(String [] args){
    StringTokenzer t = new StringTokenzer("Hola que tal estas");
    StringBuffer [] bu = new StringBuffer[t.toString().length]
      int i = 0;

    while(t.hasMor...){
      bu[i] = new StringBuffer(t.nextToken());
      System.out.println(bu[i].reverse());
      i++;
    }

  }
}

