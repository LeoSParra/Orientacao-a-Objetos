
package lista4.exe1;

public class Assistente extends Funcionario {
    private float horaExtra;

    public Assistente() {
        super(); //chama construtor da superclasse sem parametros
    }

    public Assistente(float horaExtra, String nome, String endereco, String cpf, float salario) {
        super(nome, endereco, cpf, salario); //chama o construtor da super classe com 4 parametros
        this.setHoraExtra(horaExtra);
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public final void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override //indica anulação
    public String toString() {
        return "Assistente{" + "horaExtra=" + horaExtra + 
                super.toString() + '}';
    }
    
    //precisamos anular o metodo herdado calculaSalario()
    @Override
    public float calculaSalario(){
        return this.salario + (this.horaExtra*30);
    }
}    
    