import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			try {
				System.out.println("Qual o número que deseja imprimir a tabuada?");
				int numTab = sc.nextInt();

				System.out.println("A tabuada do " + numTab + " é: ");
				for (int i = 0; i < 10; i++) {
					System.out.println(numTab + " x " + i + " = " + numTab * i);
				}

			} catch (InputMismatchException e) {
				System.err.println("Precisa ser número, tente novamente.");
				e.printStackTrace();
				break;
			}
		}

//		System.out.println("Digite um número: ");        // Utilizado para testar o tipo de Exception
//		int teste = sc.nextInt();
//		System.out.println(teste);

		sc.close();
	}

}
