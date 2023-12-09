package exercicio02;

public class Animal {
    private String nome;
    private String especie;

    public Animal(String nome, String especie){
        this.nome = nome;
        this.especie = especie;
    }
    public void emitirSom(){
        System.out.println("meu barulho original");
    }
}

class Gato extends Animal{

    public Gato(String nome, String especie){
        super(nome, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println("O som do gato");
    }
}
class Cachorro extends Animal{

    public Cachorro(String nome, String especie){
        super(nome, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println("O som do Cão");
    }
}