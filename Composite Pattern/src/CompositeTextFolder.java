public class CompositeTextFolder extends CompositeFolder{
    @Override
    public void copyFiles() {
        for(FileManager fileManager: newFileManager){
            fileManager.copyFiles();
        }
    }

    @Override
    public void moveFiles() {
        for(FileManager fileManager: newFileManager){
            fileManager.moveFiles();
        }
    }

    @Override
    public void deleteFiles() {
        for (FileManager fileManager: newFileManager){
            fileManager.deleteFiles();
        }
    }
}
