
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
    
    public void mostrarAtributos () {
        System.out.println("código: " + this.codigo);
        System.out.println("descrição: " + this.descricao);
        System.out.println("nome: " + this.nome);
        System.out.println("quantidade: " + this.quantidade);
        System.out.println("preco: " + this.preco);
    }
}
