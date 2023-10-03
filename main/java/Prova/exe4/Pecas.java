
package Prova.exe4;

public class Pecas {
    public String nomePeca;
    public float preco;

    public Pecas() {
    }

    public Pecas(String nomePeca, float preco) {
        this.setNomePeca(nomePeca);
        this.setPreco(preco);
    }

    public String getNomePeca() {
        return nomePeca;
    }

    public final void setNomePeca(String nome) {
        this.nomePeca = nome;
    }

    public float getPreco() {
        return preco;
    }

    public final void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Pecas{" + "nome=" + nomePeca + ", preco=" + preco + '}';
    }  
}
