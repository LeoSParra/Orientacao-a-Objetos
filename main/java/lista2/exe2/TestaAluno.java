
package lista2.exe2;

public class TestaAluno {
    public static void main(String[] args) {
        
        Aluno mel = new Aluno(109048, "Mel", 20, 10f, 10f);
        mel.dadosAluno();
        mel.notaFinal();
        
        Aluno faisca = new Aluno();
        faisca.setIdade(-22);
        faisca.setNome("Faisca");
        faisca.setNumeroAluno(1090400);
        faisca.setP1(90f);
        faisca.setP2(90f);
        
        faisca.notaFinal();
        faisca.dadosAluno();
    }
}
