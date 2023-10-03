
package Prova.exe3;

public class Testa {
    public static void mostra(Titulo titulo) {
        System.out.println(titulo.toString());
        System.out.println("Duração total: " + titulo.getDuracao() + " minutos");
    }
    
    public static void main(String[] args) {
        
        Serie lost = new Serie("Lost", 50, "1500", 30);
        mostra(lost);
        
        Filme carros = new Filme("Carros", 140, "2006", "Tonhão");
        mostra(carros);
        
    }
}
