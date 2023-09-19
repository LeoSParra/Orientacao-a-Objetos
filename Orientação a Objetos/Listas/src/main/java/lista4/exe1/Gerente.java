
package lista4.exe1;

public class Gerente extends Funcionario{
    private float bonus;

    public Gerente() {
        super();
    }

    public Gerente(float bonus, String nome, String endereco, String cpf, float salario) {
        super(nome, endereco, cpf, salario);
        this.setBonus(bonus);
    }

    public float getBonus() {
        return bonus;
    }

    public final void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" + "bonus=" + bonus +
                super.toString() +'}';
    }
    @Override
    public float calculaSalario(){
        return this.salario + this.bonus;
    }
}