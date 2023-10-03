
package lista2.exe0;

public class Aluno {
    private long ra;
    private int idade;
    private float p1;
    private float p2;
    
    public Aluno (long ra, int idade, float p1, float p2) {
        this.setIdade(idade);
        this.setRa(ra);
        this.setP1(p1);
        this.setP2(p2);
    }
    
    public Aluno(){
    }    

    public void setIdade(int idade) {
        if (idade > 0 && idade <= 120) {
            this.idade = idade; 
        } else {
            System.out.println("Idade inválida, foi atribuido o valor 0");
            this.idade = 0;
        }     
    }

    public void setRa(long ra) {
        // vamos criar uma string de ra convertendo long em string
        String raString = String.valueOf(ra);
        
        if (ra > 0 && raString.length() == 13) {
            this.ra = ra;
        } else {
            System.out.println("Ra inválido");
            this.ra = 0;
        }     
    }

    public void setP1(float p1) {
        if (p1 >= 0 && p1 <= 10 ) {
            this.p1 = p1;
        } else {
            System.out.println("Nota inválida");
            this.p1 = 0;
        }
    }

    public void setP2(float p2) {
        if (p2 >= 0 && p2 <= 10) {
            this.p2 = p2;
        } else {
            System.out.println("Nota inválida");
            this.p2 = 0;
        }
    }

    public long getRa() {
        return ra;
    }

    public int getIdade() {
        return idade;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }
    
    public String mostra() {
        return  "RA: " + this.ra + ", idade: " + this.idade +
        ", nota 1: " + this.p1 + ", nota 2: " + this.p2;
    }
}
