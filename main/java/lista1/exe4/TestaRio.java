
package lista1.exe4;

public class TestaRio {
    public static void main(String[] args){
        Rio rio1 = new Rio("Sapucai",100.0f,true);
        Rio rio2 = new Rio("Grande",300.0f,false);

        rio1.ensolarar(0.3f);
        rio1.sujar();
        
        rio2.chover(0.4f);
        rio2.limpar();
        
        rio1.mostrarDados();
        rio2.mostrarDados();
       

    }
}
