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
			System.out.println("O maior número é: " + a);
			if (b >= c) {
				System.out.println("O menor número é: " + c);
			} else {
				System.out.println("O menor número é: " + b);
			}
		}
		if (b > a && b > c) {
			System.out.println("O maior número é: " + b);
			if (a >= c) {
				System.out.println("O menor número é: " + c);
			} else {
				System.out.println("O menor número é: " + a);
			}
		}
		if (c > a && c > b) {
			System.out.println("O maior número é: " + c);
			if (a >= b) {
				System.out.println("O menor número é: " + b);
			} else {
				System.out.println("O menor número é: " + a);
			}
		}
		if(a == b && a == c) {
			System.out.println("Os três números são iguais.");
		}

		sc.close();

	}

}
