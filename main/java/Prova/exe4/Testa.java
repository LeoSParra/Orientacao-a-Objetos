
package Prova.exe4;

public class Testa {
    
    public static void main(String[] args) {
        
        Pecas motor = new Pecas("Motor", 1500f);
        Pecas freio = new Pecas("Freio", 1200f);
        Pecas volante = new Pecas("Volante", 3000f);
        
        Veiculo carro = new Veiculo();
        carro.setAno("1500");
        carro.setMarca("Dodge");
        carro.setModelo("Journey");
        
        carro.addPecas(motor);
        carro.addPecas(freio);
        carro.addPecas(volante);
        
        System.out.println(carro);
    }
}
