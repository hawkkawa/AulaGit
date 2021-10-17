import java.util.Scanner;

public class Exercicio02_Ana {

	/*
	 * 2. Criar um programa que, enquanto estiver recebendo números positivos,
	 * imprime no console a soma dos números inseridos, caso receba um número
	 * negativo, encerre o programa. Tente utilizar a estrutura do while.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		int numero = 0;

		do {
			System.out.println("Digite um número inteiro: ");
			numero = sc.nextInt();
			if(numero > 0) soma = soma + numero;
			System.out.println("A soma dos números inseridos é: " + soma);
		}while (numero >= 0);

		

		sc.close();
	}

}