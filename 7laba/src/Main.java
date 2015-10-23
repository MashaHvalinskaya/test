import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;


public class Main {
	Привет Маша, я решил сломать программу этой строчкой. Лол. Кек.
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
