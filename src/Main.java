import org.xml.sax.SAXException;
<<<<<<< HEAD
fhifdhfshdcsdcsedhcdsiyvhds
=======

>>>>>>> 609c25c02fd0e0ebe6321c7bf452a9b0ba4af2de
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;

<<<<<<< HEAD

public class Main {

=======
qweqweqw
public class Main {
	Привет Маша, я решил сломать программу этой строчкой. Лол. Кек.
>>>>>>> 609c25c02fd0e0ebe6321c7bf452a9b0ba4af2de
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
<<<<<<< HEAD
=======
		123123123345345
>>>>>>> 609c25c02fd0e0ebe6321c7bf452a9b0ba4af2de
    }
}
