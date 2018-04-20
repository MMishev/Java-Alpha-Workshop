public class Main {
    public static void main(String[] args){
        Application slack = new Application();
        slack.getChannels();
        slack.createChannel(new Channel("Spam"));
        slack.getChannels();
        System.out.println(slack.getCurrentChannel());
        slack.switchCurrentChannel("Spa") ;
        System.out.println(slack.getCurrentChannel());
        slack.postMessage(new TextMessage(new Author("Misharata"),"Random message"));
        slack.currentChannel.getMessages();
    }
}
