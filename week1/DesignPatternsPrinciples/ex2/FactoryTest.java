package DesignPatternsPrinciples.ex2;

public class FactoryTest extends DocumentFactory {

    private String type;

    public FactoryTest(String type) {
        this.type = type;
    }

    @Override
    public Document createDocument() {

        if (type.equalsIgnoreCase("word")) {
            return new WordDocument();
        } else if (type.equalsIgnoreCase("pdf")) {
            return new PdfDocument();
        } else if (type.equalsIgnoreCase("excel")) {
            return new ExcelDocument();
        }

        return null;
    }

    public static void main(String[] args) {

        DocumentFactory wordFactory = new FactoryTest("word");
        Document word = wordFactory.createDocument();
        word.open();

        DocumentFactory pdfFactory = new FactoryTest("pdf");
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        DocumentFactory excelFactory = new FactoryTest("excel");
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}