package tiradadoble;

public class tiradadoble {
     public static void main(String[] args) throws Exception {
        int tiradas = (int)(Math.random()*10+1);
        int listaT1 [] = new int[tiradas];
        int listaT2 [] = new int[tiradas]; 
        int tiradasiguales = 0;

            //Llenando tiradas

            for(int i = 0; i < listaT1.length;i++){
                listaT1[i] = (int)(Math.random()*6+1);
            }
            for(int i = 0; i <listaT2.length;i++){
                listaT2[i] = (int)(Math.random()*6+1);
            }
            for(int i = 0; i < tiradas;i++){
                int l1,l2;
                l1 = listaT1[i];
                l2 = listaT2[i];
                if(l1 == l2){
                    tiradasiguales +=1;
            }
        }
        System.out.println("Lista tirada 1:");
        for(int i:listaT1){
            System.out.println(i);
        }
        System.out.println("Lista tirada 2:");
        for(int i:listaT2){
            System.out.println(i);
        }
        System.out.println("Tiradas iguales: "+ tiradasiguales);
     }
}
