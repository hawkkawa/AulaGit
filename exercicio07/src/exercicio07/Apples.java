package exercicio07;

import java.util.Scanner;

/*4)	As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.
Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra*/


public class Apples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double p1 = 0.30, p2 = 0.25;
		
		
		System.out.println("Quantas maçãs você vai comprar?");
		int compra = sc.nextInt();
		double preco1 = (compra * p1);
		double preco2 = (compra * p2);
		
		if(compra < 12) {
			System.out.printf("O preço das %d maçãs será: %.2f", compra, preco1);
		}else
			System.out.printf("O preço das %d maçãs será: %.2f", compra, preco2);
			
		
		
		
		sc.close();

	}

}
