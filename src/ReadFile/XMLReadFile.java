package ReadFile;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLReadFile {

    public static void main(String[] args) {
        try {
          DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
          Document document = documentBuilder.parse("./src/ReadFile/src/readxml.xml");

            // Получаем корневой элемент
            Node root = document.getDocumentElement();
            System.out.println("List of books:");
            System.out.println();

            NodeList books = root.getChildNodes();
            for (int i = 0; i < books.getLength(); i++) {
                System.out.println("-----");
            }


        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
        } catch (SAXException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
