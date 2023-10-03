
package lista5.exe1;

public class JogadorBasquete implements IBasquete{

    @Override
    public void arremessar() {
        System.out.println("Arremessou ...");
    }

    @Override
    public void pegarRebote() {
        System.out.println("Pegou rebote ...");
    }

    @Override
    public void fazerBloqueio() {
        System.out.println("Fez bloqueio ...");
    }
    
    @Override
    public void darToco() {
        System.out.println("Deu toco ...");
    }

}
