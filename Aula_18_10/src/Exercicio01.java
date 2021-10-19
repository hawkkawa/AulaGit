
public class Exercicio01 {

	public static void main(String[] args) { 
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int soma = 0;
		int menor = array[0], maior = array[0];
		
		for(int i : array) {
			soma += i;
			if(i>maior) {
				maior = i;
			}
			if(i<menor) {
				menor = i;
			}
			System.out.print(i+",");
		}
		
		System.out.printf("%nA soma dos elementos vale: %d%n", soma);
		System.out.printf("A média dos elementos vale: %.2f%n", (double)soma/array.length);
		System.out.printf("O menor número vale: %d%n", menor);
		System.out.printf("O maior número vale: %d", maior);
	}

}
