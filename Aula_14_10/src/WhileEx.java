import java.util.Scanner;

public class WhileEx {

	/*
	 * Calcular m�dia de X alunos. Notas v�lidas: entre 0 e 10 Contar quantas notas
	 * v�lidas foram digitadas Usu�rio deve digitar -1 para sair do programa e ser
	 * informado da sua m�dia e quantidade de notas
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quantidadeNotas = 0;
		double nota = 0.0;
		double total = 0.0;

		while (nota != -1) {
			System.out.println("Digite sua nota: (ou -1 para finalizar)");
			nota = sc.nextDouble();

			if (nota >= 0.0 && nota <= 10.0) {
				quantidadeNotas++;
				total += nota;
			} else if (nota == -1) {
				double media = total / quantidadeNotas;
				System.out.println("Quantidade de notas digitadas: " + quantidadeNotas);
				System.out.printf("M�dia: %.2f%n", media);
			} else {
				System.out.println("Nota inv�lida.");
			}
		}

		
		
		
		sc.close();

	}

}
