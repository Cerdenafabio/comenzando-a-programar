package arrays;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Arrays {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int nElementos;
        System.out.println("Largo lista 1: ");
        nElementos = entrada.nextInt();
        int [] lista1 = new int[nElementos];
        System.out.println("Largo lista 2: ");
        nElementos = entrada.nextInt();
        int [] lista2 = new int[nElementos];
        int [] numeroL1 = {0,0,0,0,0,0};
        int [] numeroL2 = {0,0,0,0,0,0};
        int [] cantidadPares ={0,0,0,0,0,0};

        //Llenado de los Arrays
        for(int i=0;i<lista1.length;i++){

            lista1[i] = (int)(Math.random()*6+1);
        }
        for(int i=0;i<lista2.length;i++){

            lista2[i] = (int)(Math.random()*6+1);
        }
        System.out.println("Lista 1: ");
        for(int i:lista1){
            System.out.println(i);
        }
        System.out.println("Lista 2: ");
        for(int i:lista2){
            System.out.println(i);
        }
        //Cantidad de cada numero lista 1
        for(int i=0;i<lista1.length;i++){
            if(lista1[i]== 1){
                numeroL1[0] += 1;
            }
            if(lista1[i]== 2){
                numeroL1[1] += 1;
            }
            if(lista1[i]== 3){
                numeroL1[2] += 1;
            }
            if(lista1[i]== 4){
                numeroL1[3] += 1;
            }
            if(lista1[i]== 5){
                numeroL1[4] += 1;
            }
            if(lista1[i]== 6){
                numeroL1[5] += 1;
            }
        }
        System.out.println("Cantidad de cada Numero lista 1");
        System.out.println(numeroL1[0]);
        System.out.println(numeroL1[1]);
        System.out.println(numeroL1[2]);
        System.out.println(numeroL1[3]);
        System.out.println(numeroL1[4]);
        System.out.println(numeroL1[5]);
        
        //Cantidad de cada numero lista 2
        for(int i=0;i<lista2.length;i++){
            if(lista2[i]== 1){
                numeroL2[0] += 1;
            }
            if(lista2[i]== 2){
                numeroL2[1] += 1;
            }
            if(lista2[i]== 3){
                numeroL2[2] += 1;
            }
            if(lista2[i]== 4){
                numeroL2[3] += 1;
            }
            if(lista2[i]== 5){
                numeroL2[4] += 1;
            }
            if(lista2[i]== 6){
                numeroL2[5] += 1;
            }
        }
        System.out.println("Cantidad de cada numero lista 2");
        System.out.println(numeroL2[0]);
        System.out.println(numeroL2[1]);
        System.out.println(numeroL2[2]);
        System.out.println(numeroL2[3]);
        System.out.println(numeroL2[4]);
        System.out.println(numeroL2[5]);
        System.out.println("----------------------------------------");
        System.out.println("Cantidad de pares:  ");



        //Buscando pares

        for(int i = 0;i<6;i++){
            int a,b;
            a = numeroL1[i];
            b = numeroL2[i];
            if(a != 0 && b != 0){
                if(a <= b){
                    cantidadPares[i] = a;
                }
                else{
                    cantidadPares[i] = b;
                }
            }
        }
        for(int i = 0; i<cantidadPares.length;i++){
            System.out.println(cantidadPares[i]);
        }
    }
}
