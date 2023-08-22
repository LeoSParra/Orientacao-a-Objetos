
package lista2.exe0;

public class Aluno {
    private int ra;
    private int idade;
    private float p1;
    private float p2;

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida, foi atribuido o valor 0");
            this.idade = 0;
        }     
    }

    public void setRa(int ra) {
        if (ra >= 0) {
            this.ra = ra;
        } else {
            System.out.println("Ra inválido");
            this.ra = 0;
        }     
    }

    public void setP1(float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        } else {
            System.out.println("Nota inválida");
            this.p1 = p1;
        }
    }

    public void setP2(float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        } else {
            System.out.println("Nota inválida");
            this.p2 = p2;
        }
    }

    public int getRa() {
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
}
