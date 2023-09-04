
package lista3.exe0;

public class Cliente {
    private int id;
    private String nome, rg, cpf;
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(int id, String nome, String rg, String cpf, Endereco endereco) {
        this.setId(id);
        this.setNome(nome);
        this.setRg(rg);
        this.setCpf(cpf);
        this.setEndereco(endereco);
    }
    
    public int getId() {
        return id;
    }

    public final void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public final void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public final void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", endereco=" + endereco + '}';
    }   
}
