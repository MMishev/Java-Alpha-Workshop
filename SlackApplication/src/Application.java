import java.util.ArrayList;
import java.util.List;

public class Application {
    String name;
    List<Channel> channels ;

    public Application() {
        this.name = "Slack";
        this.channels = new ArrayList<>();
    }
}
