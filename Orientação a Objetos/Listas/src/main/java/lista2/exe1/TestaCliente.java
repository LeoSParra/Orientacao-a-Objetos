
package lista2.exe1;

public class TestaCliente {
    
    public static void main(String[] args) {
        Cliente fulano = new Cliente("439185-7", "3321-1", "Leo", 192f);
        
        System.out.println(fulano.toString());
        
        Cliente cicrano = new Cliente();
        
        cicrano.setNumeroAgencia("1234-6");
        cicrano.setNumeroConta("123456-8");
        cicrano.setNome("eqwheiquwheuwqheiqwehuqiwehqieqweqwewqeqewqeqwewq");
        cicrano.setSaldo(-20f);
        
        System.out.println(cicrano.toString());
        
        cicrano.deposito(1);
        cicrano.saque(1);
        cicrano.setNome("Cicrano");
        cicrano.deposito(1);
        
        System.out.println(cicrano.toString());
    }
    
    
}
