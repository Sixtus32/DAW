public class Array_3{
  public static void main(String [] args){
  int [] arr = new int [100];
  int sumaTotal = 0;
  int num = 0;
  int media;
  for (int i = 0; i < arr.length; i++){
    arr[i] = num++;
    sumaTotal += arr[i];
  }
  System.out.println(sumaTotal);
  media = sumaTotal / num;
  System.out.println(arr[1]);
  System.out.println(media);
  System.out.println(num);
  }
}
