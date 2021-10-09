import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);


		
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media < 7.0) {
			System.out.printf("Sua média foi: %.2f%n ", media);
			System.out.println("Reprovado!");
		} 
		if (media >= 7.0 && media < 10.0) {
			System.out.printf("Sua média foi: %.2f%n ", media);
			System.out.println("Aprovado!");
		} 
		if (media == 10.0) {
			System.out.printf("Sua média foi: %.2f%n ", media);
			System.out.println("Aprovado com distinção!");
		}
		
		
		sc.close();
	}
}
