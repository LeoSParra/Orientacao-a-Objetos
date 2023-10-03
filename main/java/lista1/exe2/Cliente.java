
package lista1.exe2;

public class Cliente {
     public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;
    
    public Cliente (int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public Cliente() {     
    }
    
    public void realizaDeposito (float deposito) {
        this.saldo += saldo;
    }
    
    public void realizaSaque (float saque) {
        if (saque > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
        this.saldo -= saque;
        }
    }
    
    public String mostraDados (){
        return "Numero da conta: " + this.numeroConta +
               ", numero da agencia: " + this.numeroAgencia +
               ", nome: " + this.nome + 
               " e o saldo: " +  this.saldo;
    }
}
