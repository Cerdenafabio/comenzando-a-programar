import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
       double a,b,c,raiz1,raiz2;
       System.out.println("Digite el valor de a: ");
       a= entrada.nextDouble();
       System.out.println("Digite el valor de b: ");
       b= entrada.nextDouble();
       System.out.println("Digite el valor de c: ");
       c= entrada.nextDouble();
       raiz1 = (-b+Math.sqrt(Math.pow(b, 2)-(4*a*c))/(2*a));
       raiz2 = (-b-Math.sqrt(Math.pow(b, 2)-(4*a*c))/(2*a));
       System.out.println("Raiz 1: " +raiz1);
       System.out.println("Raiz 2: " +raiz2);
    }
}