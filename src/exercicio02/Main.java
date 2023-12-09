package exercicio02;

public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("dogao", "pitbul");
        Gato cat = new Gato("dogao", "pitbul");
        Animal mau = new Animal("dogao", "pitbul");

        dog.emitirSom();
        cat.emitirSom();
        mau.emitirSom();
    }
}
