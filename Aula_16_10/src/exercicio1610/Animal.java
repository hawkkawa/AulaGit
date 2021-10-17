package exercicio1610;

public class Animal {
	
	private String tipoAnimal;
	private int qntPatas;
	private String sexo;
	private boolean vertebrado;
//---------------------------------------------------------//
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	public int getQntPatas() {
		return qntPatas;
	}
	public void setQntPatas(int qntPatas) {
		this.qntPatas = qntPatas;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public boolean isVertebrado() {
		return vertebrado;
	}
	public void setVertebrado(boolean vertebrado) {
		this.vertebrado = vertebrado;
	}
	//-----------------------------------------------------//
	public void comunicar() {
		System.out.println("Comunicou de forma genêrica.");
	}
	public void movimentar() {
		System.out.println("Movimentou de forma genêrica.");
	}
		
}