
package lista1.exe4;

public class Rio {  
    public String nome;
    public  float nivel;
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
    public void ensolarado(float nivel){
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
        System.out.println("O nome do Rio é: "+this.nome);
        if(this.poluido == true){
        System.out.println("O rio "+this.nome+" esta sujo");

        }
        else{
        System.out.println("O rio "+this.nome+" esta limpo");
        }
        if(this.nivel == 0){
            System.out.println("O rio "+this.nome+" esta seco");
        }
        else{
        System.out.println("O nivel do rio "+this.nome+" esta em: "+this.nivel+" metros");
        }
    }
}

