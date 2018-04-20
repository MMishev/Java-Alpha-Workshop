public class TextMessage extends Message implements Likeable {
    int likesCount;
    public TextMessage(Author author,String content) {
        super(author,content);
        likesCount = 0;
    }

    @Override
    public void like() {

    }
}
