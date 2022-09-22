import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);
      float numeros[] = new float[5];
      System.out.println("Guardando los datos en el arreglo");
      for(int i=0;i<5;i++){
          System.out.println((i+1)+". Digite un numero:");
          numeros[i] = entrada.nextFloat();
      }
      for(float i:numeros){
          System.out.println(i);
      }
      for(int i =4;i>=0;i--){
          System.out.println(numeros[i]);
      }
    }
}
