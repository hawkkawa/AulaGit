package exercicio05;

import java.util.Scanner;

/*2)	Faça um  algoritmo que escreva as seguintes mensagens :
− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO
*/

public class PoligonoCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva o número de lados do polígono: ");
		int n_lados = sc.nextInt();

		if (n_lados < 3) {
			System.out.println("Não é um polígono.");
		} else {
			System.out.println("Polígono não identificado.");
		}

		sc.close();
	}

}
