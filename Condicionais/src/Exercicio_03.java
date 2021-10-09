import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int senha_confere = 1234;
		int senha;
		
		System.out.println("Digite a sua senha: ");
		senha = sc.nextInt();
		
		if (senha == senha_confere) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("ACESSO NEGADO");
		}
		

		
		sc.close();
	}

}
