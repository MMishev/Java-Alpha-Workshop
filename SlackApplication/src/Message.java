import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Message {
    Author author ;
    String content;
    Date timestamp ;
    SimpleDateFormat form;

    public Message(Author author,String  content) {
        this.author = author;
        this.content = content;
        this.timestamp = new Date();
        form = new SimpleDateFormat("E dd.MM.yyyy 'at' hh:mm:ss");
    }
    @Override
    public String toString(){
        return String.format("[%s] %s: %s",form.format(timestamp),author,content);
    }
}
