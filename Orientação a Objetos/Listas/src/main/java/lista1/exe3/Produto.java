
package lista1.exe3;

public class Produto {
    // tipos de dados primitivos (int, float, double, boolean)
    // tipos de dados de classe (String, Float, Integer, Double)
    
    public int codigo;
    public String nome;
    public String descricao;
    public int quantidade;
    public float preco;
    
    public Produto (int codigo, String nome, String descricao, int quantidade, float preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public Produto() {
    }
    
    public void compra(int quantidade) {
        this.quantidade = this.quantidade + quantidade;
    }
    
    public void vende(int quantidade) {
        if (quantidade > this.quantidade){
            System.out.println("Não há estoque");
        } else {
            this.quantidade = this.quantidade - quantidade;
            System.out.println("Produto comprado com sucesso");
        } 
    }
    
    public void aumentaPreco(float preco) {
        this.preco = this.preco + preco;
    }
    
    public void diminuiPreco(float preco) {
        if (preco > this.preco) {
            System.out.println("O preço irá ficar negativo!");
        } else {
            this.preco = this.preco - preco;
            System.out.println("O novo valor do produto é: " + this.preco);
        }
    }
    
    public void exibeDados () {
        System.out.println("código: " + this.codigo 
        +"\ndescrição: " + this.descricao
        +"\nnome: " + this.nome
        +"\nquantidade: " + this.quantidade
        +"\npreco: " + this.preco);
    }    
}
