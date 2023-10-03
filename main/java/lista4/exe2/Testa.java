
package lista4.exe2;

public class Testa {
    public static void show(Animal camaleao){
        System.out.println(camaleao.toString());
        System.out.println(camaleao.move());
    }
        
    public static void main(String[] args) {
        Snake objSnake = new Snake(true,
                false, "víbora", 3);
        show(objSnake);
        Horse objHorse = new Horse(true, 
                "Pé de pano", 5);
        show(objHorse);
        
    }
    
    
    
}