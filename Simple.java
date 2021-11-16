// import org.w3c.dom.*;
import org.cyberneko.html.parsers.DOMParser;
import org.w3c.dom.Document;

public class Simple {
    public static void main ( String [] args ) {
    DOMParser parser = new DOMParser () ;
    parser . parse ( "./bouquins.xml" ) ;
    Document doc = parser . getDocument () ;
    
    doc . getNodeName () ;
    doc . getChildNodes () . item (0) ;
    doc . getChildNodes () . item (0) . getNodeName () ;
    doc . getChildNodes () . item (0) . getChildNodes () . item (1) ;
    doc . getChildNodes () . item (0) . getChildNodes () . item (0) ;
    doc . getChildNodes () . item (0) . getChildNodes () . item (0) . getNodeName () ;
     doc . getChildNodes () . item (0) . getChildNodes () .
     item (1) . getChildNodes () . item (1) . getChildNodes () .
     item (0) . getNodeName () ;
     doc . getChildNodes () . item (0) . getChildNodes () .
     item (1) . getChildNodes () . item (1) . getChildNodes () .
     item (0) . getNodeValue () ;
     doc . getElementsByTagName ( " titre " ) . item (0) .
     getChildNodes () . item (0) . getNodeValue () ;
     doc . getElementsByTagName ( " livre " ) . item (0) . hasAttributes () ;
    
    doc . getElementsByTagName ( " livre " ) . item (1) . hasAttributes () ;
    }
    }
    