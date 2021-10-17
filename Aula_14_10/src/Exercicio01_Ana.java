import java.util.Random;
import java.util.Scanner;

public class Exercicio01_Ana {

	/*
	 * 1. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
	 * número aleatório em uma variável. O jogador tem 10 tentativas para adivinhar
	 * o número gerado. Ao final de cada tentativa, imprima a quantidade de
	 * tentativas restantes, e imprima se o número inserido é maior ou menor do que
	 * o número armazenado. 
	 * 
	 * - Caso deseje, utilize o método Random() da coleção java
	 * util para sortear o número:
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random random = new Random();
		int numero = random.nextInt(100);
		int numeroAdivinhado = 0;
		System.out.println("A fim de teste, o número sorteado é: " + numero);
		
		for(int i=0; i < 10; i++) {
			System.out.printf(" Digite a %dª tentativa: ", i+1);
			numeroAdivinhado = sc.nextInt();
			if(numeroAdivinhado > numero) {
				System.out.printf("Errou, o número digitado é maior. Restam %d tentativas.", 9-i);
			}else if(numeroAdivinhado < numero) {
				System.out.printf("Errou, o número digitado é menor. Restam %d tentativas.", 9-i);
			}else {
				System.out.printf("Você acertou o número com %d tentativa(s). Parabéns!", i+1);
				break;
			}
		}		
		sc.close();
	}

}
