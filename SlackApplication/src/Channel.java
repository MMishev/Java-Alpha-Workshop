import java.util.ArrayList;
import java.util.List;

public class Channel {
    String name;
    List<Message> messages;

    public Channel(String name) {
        this.name = name;
        this.messages = new ArrayList<>();
    }
    @Override
    public String toString(){
       return name;
    }
    @Override
    public boolean equals(Object object){
        if(object.toString() == name){
            return true;
        }
        return false;
    }
    public void getMessages(){
        for (Message message : messages){
            System.out.println(message);
        }
    }
}
