
package lista2.exe0;

public class TestaAluno {
    public static void main(String[] args) {
        
        Aluno leo = new Aluno();
        
        leo.setIdade(10);
        leo.setP1(10f);
        leo.setP2(10f);
        leo.setRa(1090482211006l);
        
        System.out.println(leo.getIdade());
        System.out.println(leo.mostra());
        
    }
}
