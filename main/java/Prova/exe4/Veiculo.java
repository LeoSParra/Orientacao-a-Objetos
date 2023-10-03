
package Prova.exe4;
import java.util.ArrayList;

public class Veiculo {
    private String marca;
    private String modelo;
    private String ano;
    private ArrayList<Pecas> pecas;
     
    public Veiculo() {
        pecas = new ArrayList();
    }

    public Veiculo(String marca, String modelo, String ano) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        pecas = new ArrayList();
    }
    
    public void addPecas(Pecas peca){
        this.pecas.add(peca);
    }
    // remove um item do carrinho 
    public boolean removePecas(Pecas peca){
        return this.pecas.remove(peca);
    }
    
    public String getMarca() {
        return marca;
    }

    public final void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public final void setAno(String ano) {
        this.ano = ano;
    }

    public ArrayList<Pecas> getPecas() {
        return pecas;
    }

    public final void setPecas(ArrayList<Pecas> peca) {
        this.pecas = peca;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", pecas=" + pecas + '}';
    }
}
