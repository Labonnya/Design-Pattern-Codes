import java.util.ArrayList;

public class CompositeFolder implements FileManager{

    public ArrayList<FileManager> newFileManager = new ArrayList();

    public void add(FileManager fileManager){
        newFileManager.add(fileManager);
    }

    public void remove(FileManager fileManager){
        newFileManager.remove(fileManager);
    }
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
