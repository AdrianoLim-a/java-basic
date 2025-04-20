public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

    //exemplo de for em array 1
	for (int x=0; x<alunos.length; x++) {
		System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	}

    //exemplo de for em array 2
    for(String aluno : alunos) {
        System.out.println("Nome do aluno " + aluno);
    }
    }
}
