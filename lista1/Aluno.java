
package lista1;

public class Aluno {
    
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;
    
    public Aluno (int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public double notaFinal() {
        double media = (this.p1+this.p2) / 2;
        return media;
    }
    
    public void dadosAluno() {
        System.out.println("Dados dos alunos: " + this.nome + this.numeroAluno + this.idade);
    }    
    
    public void passou(Aluno aluno){
        if (aluno.notaFinal() >= 6) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
    
}
