
package lista1;

public class Lista1 {

    public static void main(String[] args) {
        
        Produto obj1 = new Produto(1, "sabão", "neutro", 20, 1.5f);
        
        Produto obj2 = new Produto(2, "Sabonete", "dove creme", 10, 1.4f);
        
        obj1.compra(10);
        obj2.compra(20);
        
        obj1.vende(20);
        obj1.compra(1000);
        obj1.vende(1000);
        
        obj1.diminuiPreco(1.0f);       
    }
}
