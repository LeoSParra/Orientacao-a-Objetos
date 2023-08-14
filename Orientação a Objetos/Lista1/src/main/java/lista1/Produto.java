
package lista1;

public class Produto {
    // tipos de dados primitivos (int, float, double, boolean)
    // tipos de dados de classe (String, Float, Integer, Double)
    
    public int codigo;
    public String nome;
    public String descricao;
    public int quantidade;
    public float preco;
    
    public Produto (int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public void comprar(int quantidade) {
        this.quantidade = this.quantidade + quantidade;
    }
    
    public void vender(int quantidade) {
        if (quantidade > this.quantidade){
            System.out.println("Não há estoque");
        } else {
            this.quantidade = this.quantidade - quantidade;
            System.out.println("Produto comprado com sucesso");
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
