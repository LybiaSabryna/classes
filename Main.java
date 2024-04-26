class Professor {
    public String nome;
    public int idade;
    public String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        this.nome = nome;
        this.idade = idade;
        this.disciplina = disciplina;
    }

    public String obterNome() {
        return nome;
    }
    public void definirNome(String nome) {
        this.nome = nome;
    }
    public int obterIdade() {
        return idade;
    }
    public void definirIdade(int idade) {
        this.idade = idade;
    }
    public String obterDisciplina() {
        return disciplina;
    }
    public void definirDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void imprimirInformacoes() {
        System.out.println("Seu nome: " + nome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Qual a disciplina que você atua? " + disciplina);
    }
}

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Sabryna", 20, "Programação ");

        professor1.imprimirInformacoes();
      
          }
      }
