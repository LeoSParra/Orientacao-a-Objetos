
package lista1;

public class Lista1 {

    public static void main(String[] args) {
        
        Produto obj1 = new Produto(1, "sabão");
        obj1.descricao = "Neutro";
        obj1.preco = 1.2f;
        obj1.quantidade = 20;
        
        Produto obj2 = new Produto(2, "Sabonete");
        obj2.descricao = "Dove creme";
        obj2.quantidade = 10;
        obj2.preco = 1.8f;
        
        System.out.println(obj1);
        System.out.println(obj2);
        
        obj1.mostrarAtributos();
    }
}
