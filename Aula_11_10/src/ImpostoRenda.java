
public class ImpostoRenda {

	public static void main(String[] args) {
		double salario = 3900.0;
		if (salario < 2500.0) {
			System.out.println("Seu salário é R$ " + salario);
			System.out.println("A sua alíquota é de 15%.");
			System.out.println("Você pode deduzir até R$ 350,00.");
		} else if (salario >= 2500.0 && salario <= 3800.0) {
			System.out.println("Seu salário é R$ " + salario);
			System.out.println("Sua alíquota é de 18%.");
			System.out.println("Você pode deduzir até R$ 500,00.");
		} else {
			System.out.println("Seu salário é R$ " + salario);
			System.out.println("Sua alíquota é de 23%.");
			System.out.println("Você pode deduzir até R$ 630,00.");
		}

	}

}
