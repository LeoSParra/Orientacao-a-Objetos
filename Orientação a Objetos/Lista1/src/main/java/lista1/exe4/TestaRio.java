
package lista1.exe4;

public class TestaRio {
    public static void main(String[] args){
        Rio rio1 = new Rio("Sapucai",100.0f,true);
        Rio rio2 = new Rio("Grande",300.0f,false);

        rio1.mostrarDados();
        rio1.chover(100.f);
        rio1.limpar();
        rio1.mostrarDados();

        rio2.mostrarDados();
        rio2.ensolarado(300.0f);
        rio2.sujar();
        rio2.mostrarDados();


    }
}
