
public class ImpostoRenda {

	public static void main(String[] args) {
		double salario = 3900.0;
		if (salario < 2500.0) {
			System.out.println("Seu sal�rio � R$ " + salario);
			System.out.println("A sua al�quota � de 15%.");
			System.out.println("Voc� pode deduzir at� R$ 350,00.");
		} else if (salario >= 2500.0 && salario <= 3800.0) {
			System.out.println("Seu sal�rio � R$ " + salario);
			System.out.println("Sua al�quota � de 18%.");
			System.out.println("Voc� pode deduzir at� R$ 500,00.");
		} else {
			System.out.println("Seu sal�rio � R$ " + salario);
			System.out.println("Sua al�quota � de 23%.");
			System.out.println("Voc� pode deduzir at� R$ 630,00.");
		}

	}

}
