package exercicio1610;

public class Mamiferos extends Animal {

    private String porte;

    public Mamiferos(){
        this.setTipoAnimal("Cachorro");
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    @Override
    public void comunicar() {

        System.out.println("au au au");
    }

    @Override
    public void movimentar() {
        super.movimentar();

        System.out.println("mas ele anda e corre");
    }

}
