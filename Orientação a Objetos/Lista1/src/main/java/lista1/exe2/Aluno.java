
package lista1.exe2;

public class Aluno {
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1, p2;
    
    public Aluno (int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public Aluno(){
    }
    
    public float notaFinal() {
        float media = (this.p1+this.p2) / 2;
        return media;
    }
    
    public String dadosAluno() {
        return "Nome: " + this.nome + 
                ", número: " + this.numeroAluno + 
                " e idade: " + this.idade;
    }    
    
    public void passou(){
        if (this.notaFinal() >= 6) {
            System.out.println("O alunofoi aprovado: ");
        } else {
            System.out.println("O aluno foi reprovado  ");
        }
    }
}
