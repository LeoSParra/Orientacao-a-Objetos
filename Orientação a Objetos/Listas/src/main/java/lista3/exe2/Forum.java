package lista3.exe2;

import java.util.ArrayList;

public class Forum {
    private String name;
    private String url;
    private ArrayList<Message> forumMessages; // vetor
    
    public Forum() {
        // alocar espaço na memória para o vetor
        forumMessages = new ArrayList();
    }

    public Forum(String name, String url) {
        this.name = name;
        this.url = url;
    }
    
    public void postMessage(Message message) {
        this.forumMessages.add(message);
    }
    
    public boolean removeMessage(Message message) {
        return this.forumMessages.remove(message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<Message> getForumMessages() {
        return forumMessages;
    }

    public void setForumMessages(ArrayList<Message> forumMessages) {
        this.forumMessages = forumMessages;
    }

    @Override
    public String toString() {
        // messages -> percorre o vetor e executa toString() de cada message
        return "Forum{" + "name=" + name + ", url=" + url + ", forumMessages=" + forumMessages + '}';
    }
    
    
    
}
