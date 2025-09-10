package PatternTmp;

public class FactoryDocument {

    public static void main(String[] args) {
        XMLDocument xmlDocument = (XMLDocument) new DocumentFactory().getInstance("XML");
    }

}

interface Document {
    public void method1();
}

class DocumentFactory {
    public Document getInstance(String docIdentifier) {
        switch (docIdentifier) {
            case "XML" : return  new XMLDocument();
            case "PDF" : return  new PDFDocument();
            case "CSV" : return  new CSVDocument();
        }
        return null;
    }
}

class PDFDocument implements  Document{
    @Override
    public void method1() {
        System.out.println("Method for PDF .....");
    }
}

class XMLDocument implements Document {
    @Override
    public void method1() {
        System.out.println("Method for XML .....");
    }
}

class CSVDocument implements Document {
    @Override
    public void method1() {
        System.out.println("Method for CSV ......");
    }
}
