
package Prova.exe3;

public abstract class Titulo {
    
    protected String nome;
    protected int duracao;
    protected String anoDeLancamento;
    
    public Titulo() {
    }

    public Titulo(String titulo, int duracaoMinutos, String anoDeLancamento) {
        this.setTitulo(titulo);
        this.setDuracao(duracaoMinutos);
        this.setAnoDeLancamento(anoDeLancamento);
    }

    public String getTitulo() {
        return nome;
    }

    public final void setTitulo(String titulo) {
        this.nome = titulo;
    }

    public abstract int getDuracao();

    public final void setDuracao(int duracaoMinutos) {
        this.duracao = duracaoMinutos;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public final void setAnoDeLancamento(String anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    } 

    @Override
    public String toString() {
        return "Titulo{" + "nome=" + nome + ", duracaoMinutos=" + duracao + ", anoDeLancamento=" + anoDeLancamento + '}';
    }
}
