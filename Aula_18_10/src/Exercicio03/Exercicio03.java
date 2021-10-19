package Exercicio03;

public class Exercicio03 {
	public static void main(String[] args) {
		
	double[] notas1 = {10, 5.0, 7.0, 9.0, 10.0};
	double[] notas2 = {5.0, 5.0, 7.0, 6.5, 7.5};
	Aluno aluno1 = new Aluno("João", notas1);
	Aluno aluno2 = new Aluno("Ana", notas2);
	
	System.out.println(aluno1);
	aluno1.aprovado();
	System.out.println("MEDIA: " + aluno1.media());
	System.out.println("MAIOR NOTA: " + aluno1.maiorNota());
	System.out.println(aluno2);
	aluno2.aprovado();
	System.out.println("MEDIA: " + aluno2.media());
	System.out.println("MAIOR NOTA: " + aluno2.maiorNota());
}
}

