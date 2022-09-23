package numeromenor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Listas.lista;

public class numeromenor {
    public static void main(String[] args)throws Exception{
        List<Integer> listaNumerica = new ArrayList<Integer>();
        int minimo= -10, maximo = 10;
        generadorlistas(minimo, maximo, listaNumerica);
        for(int i:listaNumerica){
            System.out.println(i);
        }
        buscandoelmenor(listaNumerica);
    }

    public static void generadorlistas(int desde,int hasta,List<Integer>lista){
        desde = (int)Math.ceil(desde);
        hasta = (int)Math.floor(hasta);
        for(int i = 0; i < 10;i++){
            lista.add(i, (int)Math.floor(Math.random()*(hasta - desde)+desde));
        }
    }

    public static void buscandoelmenor(List<Integer>listaM){
        int menor = 0;
            for(int i = 0; i < listaM.size();i++){
                if(listaM.get(i) > 0 ){
                    if(listaM.get(i)< menor || menor == 0)
                    menor = listaM.get(i);
                }
        }
        System.out.println("El menor es:"+menor);
    }
}
