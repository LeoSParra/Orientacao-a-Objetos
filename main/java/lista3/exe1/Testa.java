
package lista3.exe1;

public class Testa {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Product objProd = new Product("Bola de basquete", 400);
        
        CarItem objCI1 = new CarItem(10, objProd);
        
        CarItem objCI2 = new CarItem(20, objProd);
        
        ShoppingCart objSC = new ShoppingCart();
        objSC.addCarItem(objCI1);
        objSC.addCarItem(objCI2);
        
        System.out.println(objSC.toString());
    }
    
}