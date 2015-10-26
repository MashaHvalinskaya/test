import org.xml.sax.SAXException;
fhifdhfshdcsdcsedhcdsiyvhds
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;


public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory parserF = SAXParserFactory.newInstance();
        Handler handler=new Handler();
        try {
            SAXParser saxparser = parserF.newSAXParser();
            saxparser.parse(new File("src/XML.xml"), handler);
        } catch (ParserConfigurationException | SAXException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}