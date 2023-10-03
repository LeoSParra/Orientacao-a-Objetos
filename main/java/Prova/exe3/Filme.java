
package Prova.exe3;

public class Filme extends Titulo {
    private String diretor;
    
    public Filme() {
        super();
    }

    public Filme(String nome, int duracaoMinutos, String anoDeLancamento, String diretor) {
        super(nome, duracaoMinutos, anoDeLancamento);
        this.setDiretor(diretor);
    }
    
    public int getDuracao() {
        return this.duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public final void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme{" + "diretor=" + diretor + super.toString() + '}';
    }
}
