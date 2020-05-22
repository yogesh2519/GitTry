package myFirstProject;

import java.io.IOException;

import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

public class XMLTestClass {

	public static void main(String[] args) {
		XMLTestClass xmlTestClass = new XMLTestClass();
		xmlTestClass.testXmlDocumentWithNamespaces();
	}

	private void testXmlDocumentWithNamespaces() {

		//TimeSeriesConfig tc = new TimeSeriesConfig("Yes", "2002", "sVar_ARGUS_DATED_BRENT_BFO_@01lom", "Index",
			//	"sVar_ARGUS_DATED_BRENT_BFO_grp", "sVar_ARGUS_DATED_BRENT_BFO", "@01lom"," ","ARGUS_DATED_BRENT_BFO", "@01lom", "@01lom",
			//	"Series","Log", "contract_px(src_obj)");
		
		
		TimeSeriesXML tc = new TimeSeriesXML();
		
		String nameSpace = "urn:or-TimeSeriesDataConfigurations";
		Element root = new Element("tsc:TimeSeriesConfigurations", nameSpace);
		Element element = tc.getXML();
		root.appendChild(element);
		Document document = new Document(root);
		
		
		 try {
		      Serializer serializer = new Serializer(System.out, "ISO-8859-1");
		      serializer.setIndent(4);
		      serializer.setMaxLength(64);
		      serializer.write(document);  
		    }
		    catch (IOException ex) {
		       System.err.println(ex); 
		    }  
		    
		
		
		/*Element root = tc.getXML();
		Document document = new Document(root);
		System.out.print(document.toXML());*/
		
		
	}

}