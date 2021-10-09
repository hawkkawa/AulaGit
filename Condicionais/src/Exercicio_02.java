import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ano;

		System.out.println("Escreva seu ano de nascimento: ");
		ano = sc.nextInt();

		
			if (2021 - ano >= 16) {
				System.out.println("Pode votar");
			} else {
				System.out.println("Não pode votar");
			}

			sc.close();
		}
	}


