
package lista2.exe1;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;
    
    public Cliente (String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNome(nome);
        this.setNumeroAgencia(numeroAgencia);
        this.setSaldo(saldo);
    }
    
    public Cliente() {
    }

    public final void setNumeroConta(String numeroConta) {
        
        if (numeroConta.length() == 8 && numeroConta.charAt(6) == '-') {
            this.numeroConta = numeroConta;
        } else {
            System.out.println("Numero inválido");
            this.numeroConta = "xxx";
        }
    }

    public final void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length() == 6 && numeroAgencia.charAt(4) == '-'
                ){
            this.numeroAgencia = numeroAgencia;
        } else {
            System.out.println("Numero inválido");
            this.numeroAgencia = "xxx";
        }
    }

    public final void setNome(String nome) {
        if (nome.length() <= 30 && nome.length() > 0) {
            this.nome = nome;
        } else {
            this.nome = "";
            System.out.println("Nome inválido");
        }        
    }

    public final void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Numero negativo/inválido");
        }  
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }  
    
    public void deposito(float saldo) {
        this.setSaldo(this.saldo + saldo);
    }
    
    public void saque(float saldo) {
        this.setSaldo(this.saldo - saldo);
    }

    @Override
    public String toString() {
        return "Cliente{" + "numeroConta=" + this.numeroConta + 
                ", numeroAgencia=" + this.numeroAgencia + 
                ", nome=" + this.nome +
                ", saldo=" + this.saldo + '}';
    }  
}
