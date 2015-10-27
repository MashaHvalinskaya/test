rfdfrd
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;
ЛОЛ КЕК

public class Handler extends DefaultHandler{

    Doctor doc = new Doctor();
    Client kl = new Client();
    String thisElement = "";

    public Doctor getResultDoctor(){
        return doc;
    }

    public Client getResultKlient(){
        return kl;
    }


    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parse XML...");
    }

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
        thisElement = qName;
    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        thisElement = "";
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (thisElement.equals("root")) {}
            if (thisElement.equals("doc")) {}
                if (thisElement.equals("fam")) {
                    doc.setFam(new String(ch, start, length));
                }
                if (thisElement.equals("name")) {
                    doc.setName(new String(ch, start, length));
                }
                if (thisElement.equals("otc")) {
                    doc.setOtc(new String(ch, start, length));
                }
                if (thisElement.equals("date")) {
                    doc.setDate(new String(ch, start, length));
                }
                if (thisElement.equals("vdolid")) {
                    doc.setVdolid(new Integer(new String(ch, start, length)));
                }
                if (thisElement.equals("specid")) {
                    doc.setSpecid(new Integer(new String(ch, start, length)));
                }
                if (thisElement.equals("klavid")) {
                    doc.setKlavid(new Integer(new String(ch, start, length)));
                }
                if (thisElement.equals("stav")) {
                    doc.setStav(new Float(new String(ch, start, length)));
                }

         if(thisElement.equals("client")){}
                if (thisElement.equals("fam")) {
                    kl.setFam(new String(ch, start, length));
                }
                if (thisElement.equals("name")) {
                    kl.setName(new String(ch, start, length));
                }
                if (thisElement.equals("date")) {
                    kl.setDate(new String(ch, start, length));
                }
                if (thisElement.equals("disease")) {
                    kl.setDisease(new String(new String(ch, start, length)));
                }
            }




    @Override
    public void endDocument() {
        System.out.println("Stop parse XML...");
        System.out.println(doc.toString());
        System.out.println(kl.toString());
    }
}