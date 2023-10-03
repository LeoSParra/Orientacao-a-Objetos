
package lista1.exe4;

import java.text.DecimalFormat;

public class Rio {  
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio (String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;

    }
    
    public Rio(){
    }

    public void chover(float nivel){
        this.nivel += nivel;
    }
    
    public void ensolarar(float nivel){
        if(nivel > this.nivel){
            System.out.println("Nivel não pode ser negativo");
        }
        else {
            this.nivel -= nivel;
        }
    }
    
    public void limpar(){
        this.poluido = false;
    }
    
    public void sujar(){
        this.poluido = true;
    }
    
    public void mostrarDados(){
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("O nome do Rio é: "+this.nome + " nivel: " +
                df.format(this.nivel) + " Poluido: " + 
                (this.poluido ? "Sim" : "Não"));       
    }        
}

