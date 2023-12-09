package exercicio01;

public class Main {
    public static void main(String[] args) {
        Professor joa = new Professor("portugues", "fagner", 34);

        System.out.println("minha materia é : " + joa.getDisciplina());

        Pessoa beu = new Pessoa("felipe", 34);

         beu.setNome("luis claudio");

        System.out.println(beu.getNome());

    }
}