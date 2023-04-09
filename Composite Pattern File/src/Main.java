// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        File file1 = new TextFile();
        File file2 = new TextFile();
        File file3 = new PdfFile();
        File file4 = new PdfFile();

        CompositeFolder compositeFolder1 = new CompositeFolder();
        compositeFolder1.add(file1);
        compositeFolder1.add(file2);

        CompositeFolder compositeFolder2 = new CompositeFolder();
        compositeFolder2.add(file3);
        compositeFolder2.add(file4);

        CompositeFolder compositeFolder = new CompositeFolder();
        compositeFolder.add(compositeFolder1);
        compositeFolder.add(compositeFolder2);

        compositeFolder.copyFiles();
        compositeFolder.moveFiles();
        compositeFolder.remove(compositeFolder2);
        compositeFolder.copyFiles();
        }
    }
