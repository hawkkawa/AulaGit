import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Escreva o primeiro inteiro: ");
		a = sc.nextInt();
		System.out.println("Escreva o segundo inteiro: ");
		b = sc.nextInt();
		System.out.println("Escreva o terceiro inteiro: ");
		c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("O maior n�mero �: " + a);
			if (b >= c) {
				System.out.println("O menor n�mero �: " + c);
			} else {
				System.out.println("O menor n�mero �: " + b);
			}
		}
		if (b > a && b > c) {
			System.out.println("O maior n�mero �: " + b);
			if (a >= c) {
				System.out.println("O menor n�mero �: " + c);
			} else {
				System.out.println("O menor n�mero �: " + a);
			}
		}
		if (c > a && c > b) {
			System.out.println("O maior n�mero �: " + c);
			if (a >= b) {
				System.out.println("O menor n�mero �: " + b);
			} else {
				System.out.println("O menor n�mero �: " + a);
			}
		}
		if(a == b && a == c) {
			System.out.println("Os tr�s n�meros s�o iguais.");
		}

		sc.close();

	}

}
