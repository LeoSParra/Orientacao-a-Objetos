
package Prova.exe3;

public class Serie extends Titulo{
    private int quantidadeEpisodios;

    public Serie() {
        super();
    }
    
    public Serie(String nome, int duracaoMinutos, String anoDeLancamento, int quantidadeEpisodios) {
        super(nome, duracaoMinutos, anoDeLancamento);
        this.setQuantidadeEpisodios(quantidadeEpisodios);
    }
       
    public int getDuracao() {
        return this.quantidadeEpisodios * this.duracao;
    }

    public int getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    public final void setQuantidadeEpisodios(int quantidadeEpisodios) {
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    @Override
    public String toString() {
        return "Serie{" + "quantidadeEpisodios=" + quantidadeEpisodios + super.toString()+ '}';
    } 
} 
