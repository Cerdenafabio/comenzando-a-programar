package minimodecambios;

import java.util.ArrayList;

public class minimodecambios {
    public static void main(String[] args) throws Exception {
        //randomizando las tiradas
        int tirada1 = (int)(Math.random()*25+1);
        int tirada2 = (int)(Math.random()*25+1);
        int lista_de_tiradas1[] = new int[tirada1];
        int lista_de_tiradas2[] = new int[tirada2];
        int cantNum1 [] = {0,0,0,0,0,0};
        int cantNum2 [] = {0,0,0,0,0,0};
        int cambios, mayor, menor,sumal1 = 0,sumal2 = 0;


        //Llenando las listas de tiradas
        for(int i = 0;i < lista_de_tiradas1.length;i++){
            lista_de_tiradas1[i] = (int)(Math.random()*6+1);
        }
        for(int i = 0;i < lista_de_tiradas2.length;i++){
            lista_de_tiradas2[i] = (int)(Math.random()*6+1);
        }

        for(int i = 0;i < lista_de_tiradas1.length;i++){
            int a = lista_de_tiradas1[i];
            if(a==0){
                cantNum1[0] += 1;
            }
            if(a==1){
                cantNum1[1] += 1;
            }
            if(a==2){
                cantNum1[2] += 1;
            }
            if(a==3){
                cantNum1[3] += 1;
            }
            if(a==4){
                cantNum1[4] += 1;
            }
            if(a==5){
                cantNum1[5] += 1;
            }
        }
           for(int i = 0;i < lista_de_tiradas2.length;i++){
            int a = lista_de_tiradas2[i];
            if(a==0){
                cantNum2[0] += 1;
            }
            if(a==1){
                cantNum2[1] += 1;
            }
            if(a==2){
                cantNum2[2] += 1;
            }
            if(a==3){
                cantNum2[3] += 1;
            }
            if(a==4){
                cantNum2[4] += 1;
            }
            if(a==5){
                cantNum2[5] += 1;
            }
            }


                //Muestro listas con sus respectiva cantidad de numeros iguales.

            System.out.println("Lista nro1:");
            for(int i:lista_de_tiradas1){
            System.out.println(i);
            }

            System.out.println("Lista nro2:");
            for(int i:lista_de_tiradas2){
            System.out.println(i);
            }
            System.out.println("Cantidad de cada numero lista 1");
            System.out.println(cantNum1[0]);
            System.out.println(cantNum1[1]);
            System.out.println(cantNum1[2]);
            System.out.println(cantNum1[3]);
            System.out.println(cantNum1[4]);
            System.out.println(cantNum1[5]);

            System.out.println("Cantidad de cada numero lista 2");
            System.out.println(cantNum2[0]);
            System.out.println(cantNum2[1]);
            System.out.println(cantNum2[2]);
            System.out.println(cantNum2[3]);
            System.out.println(cantNum2[4]);
            System.out.println(cantNum2[5]);
        

        for(int i = 0; i < lista_de_tiradas1.length;i++){
            int a = lista_de_tiradas1[i];
            sumal1 += a;
        }
        for(int i = 0; i < lista_de_tiradas2.length;i++){
            int a = lista_de_tiradas2[i];
            sumal2 += a;
        }
        System.out.println("Suma Lista 1: "+sumal1);
        System.out.println("Suma Lista 2: "+sumal2);
    }
 }
