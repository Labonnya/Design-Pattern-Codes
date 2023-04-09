// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        File textFile1 = new TextFile();
        File textFile2 = new TextFile();
        File pdfFile1 = new PdfFile();
        File pdfFile2 = new PdfFile();



        CompositeTextFolder compositeTextFolder = new CompositeTextFolder();
        compositeTextFolder.add(textFile1);
        compositeTextFolder.add(textFile2);

        CompositePdfFolder compositePdfFolder = new CompositePdfFolder();
        compositePdfFolder.add(pdfFile1);
        compositePdfFolder.add(pdfFile2);

        CompositeFolder compositeFolder = new CompositeFolder();
        compositeFolder.add(compositeTextFolder);
        compositeFolder.add(compositePdfFolder);

        compositeFolder.copyFiles();

        }
    }
