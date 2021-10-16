package exercicio1610;

public class Main {

    public static void main(String[] args) {

        Aves bemTeVi = new Aves();
        Mamiferos doberman = new Mamiferos();

        System.out.println("Acoes e dados do animal 1");
        System.out.println(bemTeVi.getTipoAnimal());
        bemTeVi.setCor("amarelo e verde");
        bemTeVi.setQntPatas(2);
        bemTeVi.comunicar();
        bemTeVi.movimentar();
        System.out.println(bemTeVi.getCor());

        System.out.println("Acoes e dados do animal 2");
        System.out.println(doberman.getTipoAnimal());
        doberman.setPorte("grande");
        doberman.comunicar();
        doberman.movimentar();
        System.out.println(doberman.getPorte());

    }

}
