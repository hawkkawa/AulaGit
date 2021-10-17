import java.util.Scanner;

public class Exercicio02_Ana {

	/*
	 * 2. Criar um programa que, enquanto estiver recebendo n�meros positivos,
	 * imprime no console a soma dos n�meros inseridos, caso receba um n�mero
	 * negativo, encerre o programa. Tente utilizar a estrutura do while.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		int numero = 0;

		do {
			System.out.println("Digite um n�mero inteiro: ");
			numero = sc.nextInt();
			if(numero > 0) soma = soma + numero;
			System.out.println("A soma dos n�meros inseridos �: " + soma);
		}while (numero >= 0);

		

		sc.close();
	}

}