import java.util.Date;

public abstract class Message {
    Author author ;
    String content;
    Date timestamp ;

    public Message(String content) {
        this.content = content;
        this.timestamp = new Date();
    }
}
