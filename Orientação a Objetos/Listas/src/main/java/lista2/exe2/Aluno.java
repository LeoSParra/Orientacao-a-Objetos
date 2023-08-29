
package lista2.exe2;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;
    
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    
    public Aluno(){
    }

    public final void setNumeroAluno(int numeroAluno) {
        String numeroAlunoString = String.valueOf(numeroAluno);       
        if(numeroAlunoString.length() == 6) {
            this.numeroAluno = numeroAluno;
        } else {
            System.out.println("Numero inválido");
            this.numeroAluno = -1;
        }
    }

    public final void setNome(String nome) {
        if(nome.length() <= 30 && nome.length() > 0){
            this.nome = nome;
        } else {
            this.nome = "";
            System.out.println("Nome inválido");
        }
    }

    public final void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
            this.idade = -1;
        }
    }

    public final void setP1(float p1) {
        if (p1 >= 0 && p1 <= 10){
            this.p1 = p1;
        } else {
            System.out.println("Nota inválida");
            this.p1 = 0;
        }
    }

    public final void setP2(float p2) {
        if (p2 >= 0 && p2 <= 10){
            this.p2 = p2;
        } else {
            System.out.println("Nota inválida");
            this.p2 = 0;
        }
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }
    
    public void notaFinal() {
    }
    

 }
