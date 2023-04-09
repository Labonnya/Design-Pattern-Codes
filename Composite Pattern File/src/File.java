public abstract class File implements FileManager{
    @Override
    public void copyFiles() {
        System.out.println("File is copied.");
    }

    @Override
    public void moveFiles() {
        System.out.println("File is moved.");
    }

    @Override
    public void deleteFiles() {
        System.out.println("File is deleted.");
    }
}
