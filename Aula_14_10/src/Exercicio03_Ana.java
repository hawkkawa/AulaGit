import java.util.Scanner;

public class Exercicio03_Ana {

	/*3. Criar um programa que receba uma palavra e em seguida imprime no
	console letra por letra.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0;
		System.out.println("Escreva uma palavra: ");
		String palavra = sc.nextLine();
		int qtd = palavra.length();
		
		for(i=0;i<qtd;i++) {
			System.out.print(palavra.charAt(i) + " ");
		}
		System.out.println();
		System.out.println("A palavra possue "+qtd+" letras.");
		
		sc.close();
	}

}