
public class Exerc2_1510 {

	/*2- Fa�a um programa que mostre uma contagem na tela 
	 * de 233 a 456, s� que contando de 3 em 3 quando estiver 
	 * entre 300 e 400 e de 5 em 5 quando n�o estiver.*/
	
	public static void main(String[] args) {
		
		for(int i = 233; i>=233 && i<=456; i+=5) {
			System.out.println(i);
			if(i>=300 && i<=400) i -= 2;
		}
		
		
		
		
		
		
		/*for (int i=233; i<=456 ; i +=(i>=300 && i<=400) ? 3 : 5) {
			System.out.print(i + ",");
		}*/
	
	}

}
