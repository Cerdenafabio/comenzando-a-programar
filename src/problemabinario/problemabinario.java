package problemabinario;

public class problemabinario {
    public static void main(String[] args) throws Exception {
        int numero = (int)(Math.random()*99+1);
        int cantidadCeros = 0;
        int cantidadUnos = 0;
        int cuenta = 0;
        System.out.println(numero);
        String numerobinario = Integer.toBinaryString(numero);
        System.out.println(numerobinario);
        int caracteres [] = new int[numerobinario.length()]; 
        
        for(int i = 0;i < numerobinario.length();i++){
            System.out.println(numerobinario.length());
            System.out.println(caracteres);
            if(caracteres[i]==0){
                cuenta +=1;
            }
            else{
                if(cuenta > cantidadCeros){
                    cantidadCeros = cuenta;
                }
            }
        }
        System.out.println(cantidadCeros);
    }
}
