
package lista2.exe1;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    public void setNumeroConta(String numeroConta) {
        String numeroContaString = String.valueOf(numeroConta);
        
        if (numeroContaString.length() == 8) {
            this.numeroConta = numeroConta;
        } else {
            System.out.println("Numero inválido");
            this.numeroConta = "";
        }
    }

    public void setNumeroAgencia(String numeroAgencia) {
        String numeroAgenciaString = String.valueOf(numeroAgencia);
        
        if (numeroAgenciaString.length() == 6) {
            this.numeroAgencia = numeroAgencia;
        } else {
            System.out.println("Numero inválido");
            this.numeroAgencia = "";
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
    
}
