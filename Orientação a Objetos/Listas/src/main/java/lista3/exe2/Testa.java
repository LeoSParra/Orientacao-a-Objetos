package lista3.exe2;

public class Testa {
   
    public static void main(String[] args) {
        
        Person person1 = new Person("Jobias", "Jobias_online");
        
        Message message1 = new Message("Pai ta on", person1);
        
        Message message2 = new Message("Ta de sacanagem", person1);
        
        Message message3 = new Message("PENTA KIIIILLL!!!", person1);
        
        Forum ideias = new Forum();
        ideias.setName("Fórum de smite");
        ideias.setUrl("http://foruns.smitanos.com");
        
        // adiciona a mensagem no vetor
        ideias.postMessage(message1);
        ideias.postMessage(message2);
        ideias.postMessage(message3);
        
        System.out.println(ideias.toString());
    }
}
