package exercicio1610;

public class Aves extends Animal {

	private String cor;
	
	public Aves() {
		this.setTipoAnimal("Aves");
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return this.cor;
	}
	
	public void comunicar() {
		System.out.println("piu-piu");
	}
	public void movimentar() {
		System.out.println("voar");
	}
	
}
