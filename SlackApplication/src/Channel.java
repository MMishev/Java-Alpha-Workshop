import java.util.ArrayList;
import java.util.List;

public class Channel {
    String name;
    List<Message> messages;

    public Channel(String name) {
        this.name = name;
        this.messages = new ArrayList<>();
    }
}
