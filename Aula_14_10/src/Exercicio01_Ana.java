import java.util.Random;
import java.util.Scanner;

public class Exercicio01_Ana {

	/*
	 * 1. Jogo da adivinha��o: Tentar adivinhar um n�mero entre 0 - 100. Armazene um
	 * n�mero aleat�rio em uma vari�vel. O jogador tem 10 tentativas para adivinhar
	 * o n�mero gerado. Ao final de cada tentativa, imprima a quantidade de
	 * tentativas restantes, e imprima se o n�mero inserido � maior ou menor do que
	 * o n�mero armazenado. 
	 * 
	 * - Caso deseje, utilize o m�todo Random() da cole��o java
	 * util para sortear o n�mero:
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random random = new Random();
		int numero = random.nextInt(100);
		int numeroAdivinhado = 0;
		System.out.println("A fim de teste, o n�mero sorteado �: " + numero);
		
		for(int i=0; i < 10; i++) {
			System.out.printf(" Digite a %d� tentativa: ", i+1);
			numeroAdivinhado = sc.nextInt();
			if(numeroAdivinhado > numero) {
				System.out.printf("Errou, o n�mero digitado � maior. Restam %d tentativas.", 9-i);
			}else if(numeroAdivinhado < numero) {
				System.out.printf("Errou, o n�mero digitado � menor. Restam %d tentativas.", 9-i);
			}else {
				System.out.printf("Voc� acertou o n�mero com %d tentativa(s). Parab�ns!", i+1);
				break;
			}
		}		
		sc.close();
	}

}
