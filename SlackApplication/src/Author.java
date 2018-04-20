import java.util.ArrayList;
import java.util.List;

public class Author {
    String name;
    List<Message> messages;

    public Author(String name) {
        this.name = name;
        this.messages = new ArrayList<>();
    }
}
