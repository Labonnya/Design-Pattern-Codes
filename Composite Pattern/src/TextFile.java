public class TextFile extends File{
    @Override
    public void copyFiles() {
        System.out.println("Text File is copied.");
    }

    @Override
    public void moveFiles() {
        System.out.println("Text File is moved.");
    }

    @Override
    public void deleteFiles() {
        System.out.println("Text File is deleted.");
    }
}
