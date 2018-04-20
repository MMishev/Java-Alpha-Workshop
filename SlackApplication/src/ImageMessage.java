public class ImageMessage extends Message implements Accessible {
    int likesCount;
    public ImageMessage(Author author,String content) {
        super(author,content);
        likesCount = 0;
    }

    @Override
    public void like() {

    }

    @Override
    public void download() {

    }
}
