package exercicio04;

import java.util.Scanner;

/*1)	Escreva um programa que leia o valor de 3 ângulos de um triângulo e 
 * escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo que:
− Triângulo Retângulo: possui um ângulo reto. (igual a 90o)
− Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90o)
− Triângulo Acutângulo: possui três ângulos agudos. (menor que 90o)*/


public class Triangulo_tipo_byangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma;
		
		System.out.println("Escreva o primeiro ângulo: ");
		int ang1 = sc.nextInt();
		System.out.println("Escreva o segundo ângulo: ");
		int ang2 = sc.nextInt();
		System.out.println("Escreva o terceiro ângulo: ");
		int ang3 = sc.nextInt();
		
		soma = ang1 + ang2 + ang3;
		
		if(soma != 180) {
			System.out.println("Não é um triângulo.");
		}else if(ang1 == 90 || ang2 == 90 || ang3 == 90) {
			System.out.println("O triangulo é retangulo.");
		}else if(ang1>90 || ang2>90 || ang3>90) {
			System.out.println("O triângulo é obtusângulo.");
		}else {
			System.out.println("O triângulo é acutângulo.");
		}
			
		
		
		
		
		
		
		
		sc.close();

	}

}
