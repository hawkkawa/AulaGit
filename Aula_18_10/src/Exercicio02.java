
public class Exercicio02 {

	public static void main(String[] args) {
		int[] array2 = { 13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125 };

		System.out.printf("Os números pares são: ");
		for (int i : array2) {
			if (i % 2 == 0) {
				System.out.print(i + " ,");
			}
		}

		System.out.printf("%nOs números ímpares são: ");
		for (int j : array2) {
			if (j % 2 == 1) {
				System.out.print(j*2 + " ,");
			}
		}

	}
}