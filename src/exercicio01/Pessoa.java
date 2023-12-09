package exercicio01;

 class Pessoa {
    private String nome;
    private int idade;
     public Pessoa(String nome, int idade) {
         this.nome = nome;
         this.idade = idade;
     }



     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }
 }

class Estudante extends Pessoa{
     private int nota;
     public Estudante(String nome, int idade, int nota){
         super(nome, idade);
         this.nota = nota;
     }

    public int getNota() {
        return nota;
    }
}

class Professor extends Pessoa {
     private String disciplina;

     public Professor(String disciplina,String nome, int idade){
         super(nome, idade);
         this.disciplina = disciplina;
     }

     public String getDisciplina(){
         return disciplina;
     }


}
