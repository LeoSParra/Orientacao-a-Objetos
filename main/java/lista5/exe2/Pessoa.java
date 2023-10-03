
package lista5.exe2;

public class Pessoa extends Animal implements ICidadao, IContribuinte, IProfessor{
    private String rg;
    private String cpf;

    public Pessoa(String rg, String cpf) {
        this.setRg(rg);
        this.setCpf(cpf);
    }
    
    public final void setRg(String rg) {
        this.rg = rg;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void vota() {
        System.out.println("Votou ...");
    }

    @Override
    public void getRg() {
        System.out.println("O rg é: " + this.rg);
    }

    @Override
    public void pagaIR() {
        System.out.println("Pagou imposto ...");
    }

    @Override
    public void getCPF() {
        System.out.println("O cpf é: " + this.cpf);
    }

    @Override
    public void ensina() {
        System.out.println("Ensinou ...");
    }

    @Override
    public void trabalha() {
        System.out.println("Trabalhou ...");
    }
    
}
