package exercicio03;

public class Veiculo {
    private String modelo;
    private int ano;

    public Veiculo(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }
}

class Carro extends Veiculo{
    private int qtd_Rodas;

    public Carro(String modelo, int ano, int qtd_Rodas){
        super(modelo, ano);
        this.qtd_Rodas = qtd_Rodas;
    }

    public void rodasss(){
        System.out.println("testando o metodo");
    }
}

class Barco extends Veiculo{
    private String casco;

    public Barco(String modelo, int ano, String casco){
        super(modelo, ano);
        this.casco = casco;
    }
}
