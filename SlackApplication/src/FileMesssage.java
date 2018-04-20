public class FileMesssage extends Message implements Downloadable{
    public FileMesssage(Author author,String content) {
        super(author,content);
    }

    @Override
    public void download() {

    }
}
