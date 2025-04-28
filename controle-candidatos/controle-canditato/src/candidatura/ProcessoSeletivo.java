package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        //selecaoCandidatos();
        String [] candidatos  ={"FELIPE","MARCIA","JULIA", "PAULO", "AUGUSTO"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato( String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu=false;

        do {
            atendeu =  atender();
            continuaTentando = !atendeu;
            if (continuaTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        } while (continuaTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + " NO NÚMERO MAXIMO DE 3 TENTATIVAS");
    }
    static boolean  atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos  ={"FELIPE","MARCIA","JULIA", "PAULO", "AUGUSTO"};
        
        System.out.println("\nImprimindo a lista de candidatos informando o indice do elemento\n");
        
        for (int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + (indice+1) + " é " +candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){

        String [] candidatos  ={"FELIPE","MARCIA","JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase=2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length ){
            String candidato = candidatos[candidatosAtual];
            double salarioPrentendido = valorPrentendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de R$ " + salarioPrentendido);
            if(salarioBase>= salarioPrentendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
            
        }
        imprimirSelecionados();
    }

    static  double valorPrentendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPrentendido ){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPrentendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPrentendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUADANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
