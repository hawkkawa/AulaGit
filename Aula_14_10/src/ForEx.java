
public class ForEx {

	public static void main(String[] args) {

		for(int i=0; i<=10; i++) {        //For
			System.out.print(i + ", ");
		}
		
		System.out.println();
		System.out.println("---------------------------------");
		
		String[] cidades = {"Diadema", "SBC", "SCS", "SA", "Osasco", "Recife"};
		for (String i : cidades) {        //ForEach
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println("---------------------------------");
		
		/*int x = 1;
		for(;true;) {
			System.out.println("Sim");
			x++;
		}*/
		
		

	}

}
