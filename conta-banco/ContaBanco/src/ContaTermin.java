import java.util.Scanner;

public class ContaTermin {
    public static void main(String[] args) {
        
        int agencia = 1021;
        String conta ="067-8";
        String nomeCliente = "Adriano Lima";
        double saldo = 237.48;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Agência");
            int agenciaVerificador = scanner.nextInt();
            
            System.out.println("Digite o número da sua Conta");
            String contaVerificador = scanner.next();
            
            if(agenciaVerificador == agencia  && (contaVerificador.equals(conta))){
                System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco");
                System.out.println("A sua Agência e Conta são: " + agencia + " / " + conta);
                System.out.println("O saldo disponivel e atualizado é de R$ " + saldo);
            }else{
                System.out.println("Conta inexistente, tente novamente");
            }
        }
        
    }
}
