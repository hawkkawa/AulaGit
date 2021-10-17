package poo;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();	
	//	c1.setCor("Prata");
	//	System.out.println(c1.getCor());
	//	c1.setPlaca("ABC1500");
	//	System.out.println(c1.getPlaca());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.getVelocidade());
		
	//	Carro c2 = new Carro();
	//	c2.setPlaca("DEF2300");
	//	System.out.println(c2.getPlaca());
	}

}
