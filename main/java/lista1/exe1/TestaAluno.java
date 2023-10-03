
package lista1.exe1;

public class TestaAluno {
    
    public static void main(String[] args) {
        
        Aluno leo = new Aluno (15,"leo", 19, 10f, 10f);
        
        System.out.println(leo.dadosAluno());
        leo.passou();
    }
}
