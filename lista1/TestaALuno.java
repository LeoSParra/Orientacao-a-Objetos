
package lista1;

public class TestaALuno {
    
    public static void main(String[] args) {
        Aluno leo = new Aluno (15,"leo", 19, 4f, 3f);
        
        leo.notaFinal();
        leo.dadosAluno();
        leo.passou(leo);
    }
}
