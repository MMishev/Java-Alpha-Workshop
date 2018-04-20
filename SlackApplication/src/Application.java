import java.util.ArrayList;
import java.util.List;
import java.util.zip.CheckedInputStream;

public class Application {
    String name;
    List<Channel> channels;
    Channel currentChannel;
    private static final Channel general = new Channel("General");

    public Application() {
        this.name = "Slack";
        this.channels = new ArrayList<Channel>();
        channels.add(general);
        currentChannel = general;
    }

    public Channel getCurrentChannel() {
        return currentChannel;
    }

    public void createChannel(Channel channel) {
        channels.add(new Channel(channel.name));
    }

    public void switchCurrentChannel(String to) {

        Channel temp = new Channel(to);
        if (channels.indexOf(temp)<0){
            System.out.println("Invalid chanel !!!");
        }else {
            currentChannel = channels.get(channels.indexOf(temp));
        }
    }
    public void getChannels() {
        for (Channel channel : channels) {
            System.out.println(channel);
        }
    }

    public void postMessage(Message message){
        currentChannel.messages.add(message);
    }
}
