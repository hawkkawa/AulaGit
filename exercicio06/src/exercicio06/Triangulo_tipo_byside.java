package exercicio06;

import java.util.Scanner;

/*3)	Escreva um programa que leia as medidas dos lados de um triângulo e 
 * escreva se ele é Equilátero, Isósceles ou Escaleno. Sendo que:
− Triângulo Equilátero: possui os 3 lados iguais.
− Triângulo Isóscele: possui 2 lados iguais.
− Triângulo Escaleno: possui 3 lados diferentes.*/

public class Triangulo_tipo_byside {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado: ");
		double lado1 = sc.nextDouble();
		System.out.println("Digite o segundo lado: ");
		double lado2 = sc.nextDouble();
		System.out.println("Digite o terceiro lado: ");
		double lado3 = sc.nextDouble();
		
		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("O triângulo é equilátero.");
		}else if(lado1 == lado2 || lado2 == lado3 || lado2 == lado3) {
			System.out.println("O triângulo é isóceles.");
		}else {
			System.out.println("O triângulo é escaleno.");
		}
		
	
		
		sc.close();

	}

}
