package poo;

public class Carro implements Controlador {

	private int ano;
	private String cor;
	private String marca;
	private String placa;
	private boolean ligado;
	private int velocidade;
	//----------------------------------------//
	public Carro(int ano, String cor, String marca, 

				String placa, boolean ligado, int velocidade) {
		this.ano = ano;
		this.cor = cor;
		this.marca = marca;
		this.placa = placa;
		this.ligado = ligado;
		this.velocidade = velocidade;
	}
	public Carro() {
	}
	//----------------------------------------//	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	@Override
	public void acelerar() {
		System.out.println("Aumentando a velocidade em 5 Km/h.");
		this.velocidade = getVelocidade() + 5;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
