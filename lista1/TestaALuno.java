
package lista1;

public class TestaALuno {
    
    public static void main(String args[]) {
        Aluno leo = new Aluno (15,"leo", 19, 10f, 9.5f);
        
        leo.notaFinal();
        leo.dadosAluno();
        leo.passou(leo);
    }
}
