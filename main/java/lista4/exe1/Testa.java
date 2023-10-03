
package lista4.exe1;

public class Testa {
    
    public static void exibeResultado(Funcionario func) {
        // func é um objeto da superclasse que tem comportamento polimófico
        // func pode executar os métodos toString() e calculaSalario() das classes
        System.out.println(func.toString());
        System.out.println(func.calculaSalario());
    }
    
    public static void main(String[] args) {
        
        Assistente objAssistente = new Assistente(2, "Toucinho Grelha", "Vila do porco", "123", 3000);
        exibeResultado(objAssistente);
        
        Gerente objGerente = new Gerente(1000, "Toução das Maravia", "Vila do porco", "456", 4000);
        exibeResultado(objGerente);
        
        Diretor objDiretor = new Diretor(20000, "O dente serrilhado", "Vila dos javali", "789", 5000);
        exibeResultado(objDiretor);
    }
}
