public class PdfFile extends File{
    @Override
    public void copyFiles() {
        System.out.println("PDF File is copied.");
    }

    @Override
    public void moveFiles() {
        System.out.println("PDF File is moved.");
    }

    @Override
    public void deleteFiles() {
        System.out.println("PDF File is deleted.");
    }
}
