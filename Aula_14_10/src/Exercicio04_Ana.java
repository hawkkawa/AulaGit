import java.util.Scanner;

public class Exercicio04_Ana {

	/*4. Crie um programa que recebe 10 valores e ao final imprima o maior
	n�mero.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0, maiorNumero = 0;
		
		for(int i=0; i<10; i++) {
		System.out.printf("Digite o %d� valor: ", i+1);
		numero = sc.nextInt();
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
		System.out.println("O maior n�mero �: " + maiorNumero);
		
		sc.close();
	}

}
