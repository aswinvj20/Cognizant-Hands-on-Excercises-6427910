
interface Document {
    void open();
    void save();
}
class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document...");
    }
    @Override
    public void save() {
        System.out.println("Saving Word document...");
    }
}
class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document...");
    }
    @Override
    public void save() {
        System.out.println("Saving PDF document...");
    }
}
class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel document...");
    }
    @Override
    public void save() {
        System.out.println("Saving Excel document...");
    }
}
abstract class DocumentFactory {
    public Document getDocument() {
        System.out.println("Preparing to create document...");
        Document doc = createDocument();
        System.out.println("Document created successfully.");
        return doc;
    }
    protected abstract Document createDocument();
}
class WordDocumentFactory extends DocumentFactory {
    @Override
    protected Document createDocument() {
        return new WordDocument();
    }
}
class PdfDocumentFactory extends DocumentFactory {
    @Override
    protected Document createDocument() {
        return new PdfDocument();
    }
}
class ExcelDocumentFactory extends DocumentFactory {
    @Override
    protected Document createDocument() {
        return new ExcelDocument();
    }
}
public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        System.out.println("Testing Word Document:");
        Document word = wordFactory.getDocument();
        word.open();
        word.save();
        System.out.println("\nTesting PDF Document:");
        Document pdf = pdfFactory.getDocument();
        pdf.open();
        pdf.save();
        System.out.println("\nTesting Excel Document:");
        Document excel = excelFactory.getDocument();
        excel.open();
        excel.save();
    }
}
