package Listas;

import java.util.ArrayList;
import java.util.List;

import minimodecambios.minimodecambios;

public class lista {
    public static void main(String[] args) throws Exception {
        int tirada1 = (int)(Math.random()*5+1);
        int tirada2 = (int)(Math.random()*5+1);
        List<Integer> listaN1 = new ArrayList<Integer>();
        List<Integer> listaN2 = new ArrayList<Integer>();
        int aTirada1[] = {0,0,0,0,0,0};
        int aTirada2[] = {0,0,0,0,0,0};
        int sumaTirada1 = 0;
        int sumaTirada2 = 0;


        //Llenando tiradas
        for(int i = 0; i < tirada1;i++){
            listaN1.add((int)(Math.random()*6+1));
        }
        for(int i = 0; i < tirada2;i++){
            listaN2.add((int)(Math.random()*6+1));
        }
        //muestra en consola las listas

        for(int i:listaN1){
            System.out.println(i);
        }
        System.out.println("-------------------------");
        for(int i:listaN2){
            System.out.println(i);
        }
        

        //cuenta cuantos numeros igaules tiene cada lista
        for(int i = 0; i < listaN1.size(); i++){
            switch(listaN1.get(i)){
                case 1:
                aTirada1[0] +=1;
                sumaTirada1 += 1;
                break;
                case 2:
                aTirada1[1] +=1;
                sumaTirada1 += 2;
                break;
                case 3:
                aTirada1[2] +=1;
                sumaTirada1 += 3;
                break;
                case 4:
                aTirada1[3] +=1;
                sumaTirada1 += 4;
                break;
                case 5:
                aTirada1[4] +=1;
                sumaTirada1 += 5;
                break;
                case 6:
                aTirada1[5] +=1;
                sumaTirada1 += 6;
                break;
            }
        }
        for(int i = 0; i < listaN2.size(); i++){
            switch(listaN2.get(i)){
                case 1:
                aTirada2[0] +=1;
                sumaTirada2 += 1;
                break;
                case 2:
                aTirada2[1] +=1;
                sumaTirada2 += 2;
                break;
                case 3:
                aTirada2[2] +=1;
                sumaTirada2 += 3;
                break;
                case 4:
                aTirada2[3] +=1;
                sumaTirada2 += 4;
                break;
                case 5:
                aTirada2[4] +=1;
                sumaTirada2 += 5;
                break;
                case 6:
                aTirada2[5] +=1;
                sumaTirada2 += 6;
                break;
            }
        }
        //muestra en consola la cantidad de cada numero de cada lista
        System.out.println("---------------Cantidad de numeros lista 1-------------------");
        for(int i:aTirada1){
            System.out.println(i);
        }
        System.out.println("Suma total de la tirada 1:"+sumaTirada1);
        System.out.println("---------------Cantidad de numeros lista 2-------------------");
        for(int i:aTirada2){
            System.out.println(i);
        }
        System.out.println("Suma total de la tirada 2:"+sumaTirada2);
        System.out.println("-----------------------------");
        minimodecambios(aTirada1,aTirada2,sumaTirada1,sumaTirada2);
    }
    public static void minimodecambios(int tir1[], int tir2[],int vTirada1,int vTirada2){
        int cambios = 0;
        int max = 6;
        int min = 1;
        int diferencia = 0;
        if(vTirada1 < vTirada2){
            for(int i = 0; i < tir1.length; i++){
                diferencia = vTirada2 - vTirada1;
                switch(tir1[i]){
                    case 0:
                    if(diferencia >= 5){
                        tir1[0] = tir1[0] -1;
                        diferencia = diferencia - 5;
                        cambios = cambios +1;
                        System.out.println("1");
                    }
                    break;
                    case 1:
                    if(diferencia >= 4){
                        tir1[1] = tir1[1] -1;
                        diferencia = diferencia - 4;
                        cambios = cambios +1;
                        System.out.println("2");
                    }
                    break;
                    case 2:
                    if(diferencia >= 3){
                        tir1[2] = tir1[2] -1;
                        diferencia = diferencia - 3;
                        cambios = cambios +1;
                        System.out.println("3");
                    }
                    break;
                    case 3:
                    if(diferencia >= 2){
                        tir1[3] = tir1[3] -1;
                        diferencia = diferencia - 2;
                        cambios = cambios +1;
                        System.out.println("4");
                    }
                    break;
                    case 4:
                    if(diferencia >= 1){
                        tir1[4] = tir1[4] -1;
                        diferencia = diferencia - 1;
                        cambios = cambios +1;
                        System.out.println("5");
                    }
                    break;
                }
            }
        }
        if(vTirada2 < vTirada1){
            diferencia = vTirada1 - vTirada2;
            for(int i = 0; i < tir2.length; i++){
                switch(tir2[i]){
                    case 5:
                    if(diferencia >= 5){
                        tir2[5] = tir2[5] -1;
                        diferencia = diferencia - 5;
                        cambios = cambios +1;
                    }
                    break;
                    case 4:
                    if(diferencia >= 4){
                        tir2[4] = tir2[4] -1;
                        diferencia = diferencia - 4;
                        cambios = cambios +1;
                    }
                    break;
                    case 3:
                    if(diferencia >= 3){
                        tir2[3] = tir2[3] -1;
                        diferencia = diferencia - 3;
                        cambios = cambios +1;
                    }
                    break;
                    case 2:
                    if(diferencia >= 2){
                        tir2[2] = tir2[2] -1;
                        diferencia = diferencia - 2;
                        cambios = cambios +1;
                    }
                    break;
                    case 1:
                    if(diferencia >= 1){
                        tir2[1] = tir2[1] -1;
                        diferencia = diferencia - 1;
                        cambios = cambios +1;
                    }
                    break;
                }
            }
        }
        System.out.println("cambios"+cambios);
        for(int i:tir1){
            System.out.println(i);
        }
        System.out.println("--------------------------");
        for(int i:tir1){
            System.out.println(i);
        }
    }
} 
