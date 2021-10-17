import java.util.Scanner;

public class Exerc_1510 {

	/*
	 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
	 * coletando dados sobre o salário e número de filhos. A prefeitura deseja
	 * saber: a) média do salário da população; b) média do número de filhos; c)
	 * maior salário; d) percentual de pessoas com salário até R$100,00.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double totalSalario = 0.0;
		double maiorSalario = 0.0;
		double salario = 0.0;
		double filhos = 0;
		double menorSalario = 0;

		System.out.println("Digite a quantidade de pessoas pesquisadas: ");
		int pessoas = sc.nextInt();

		for (int i = 1; i <= pessoas; i++) {

			System.out.printf("Informe o salario da pessoa %d : ", i);
			salario = sc.nextDouble();
			System.out.printf("Informe o numero de filho da pessoa %d : ", i);
			filhos += sc.nextDouble();

			totalSalario += salario;

			if (salario <= 100)
				menorSalario++;

			if (salario > maiorSalario || i == 1)
				maiorSalario = salario;
		}

		System.out.printf("Media do salario da populacao: %.2f \n", (totalSalario / pessoas));
		System.out.printf("Maior salario: %.2f \n", maiorSalario);
		System.out.printf("Media de filhos: %.2f \n", (filhos / pessoas));
		System.out.printf("porcentagem de pessoas com salario menor que 100,00: %.2f %% \n",
				menorSalario * 100 / pessoas);

		sc.close();
	}

}
