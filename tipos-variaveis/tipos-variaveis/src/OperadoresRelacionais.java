

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

   

        String nomeUm = "Adriano";
        String nomeDois = "Adriano";

        System.out.println(nomeUm.equals(nomeDois));
        
        boolean simNao = numero1 == numero2;
        
        
        if (numero1 == numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

    
        simNao = numero1 > numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);
        
        simNao = numero1 < numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);
    }
    
}
