
package myFirstProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nu.xom.Element;


/**
 * 
 * <p>
 * Demonstrates building a structured XML document,
 * from flat, tabular data. A different version of this 
 * example was originally developed for Chapter 4 of 
 * <cite><a  target="_top"
 * href="http://www.cafeconleche.org/books/xmljava/">Processing 
 * XML with Java</a></cite>.
 * </p>
 * 
 * @author Elliotte Rusty Harold
 * @version 1.3.1
 *
 */
public class Agency {
 
  private String code;
  private String name;
  private String treasuryCode;
  private String year;
  
  private List<Bureau> bureaus = new ArrayList<Bureau>();
  
  private static Map<String, Agency> instances = new HashMap<String, Agency>();

  // A private constructor so instantiators 
  // have to use the factory method
  private Agency(String name, String code, String treasuryCode, 
     String year) {
        
    this.name = name;
    this.code = code;
    this.treasuryCode = treasuryCode;
    this.year = year;
    
  }
  
  public static Agency getInstance(String name, String code, 
     String treasuryCode, String year) {
        
    // Agencies can be uniquely identified by code alone
    String key = code+" "+year;
    Agency agency = (Agency) instances.get(key);
    if (agency == null) {
      agency = new Agency(name, code, treasuryCode, year);
      instances.put(key, agency);
    }
    
    return agency;
        
  }
  
  public void add(Bureau b) {
    if (!bureaus.contains(b)) {
        bureaus.add(b);
    }
  }
  
  public Element getXML() {
        
    Element agency = new Element("Agency");
    Element name = new Element("Name");
    Element code = new Element("Code");
    Element treasuryAgencyCode = new Element("TreasuryAgencyCode");
    name.appendChild(this.name);
    code.appendChild(this.code);
    treasuryAgencyCode.appendChild(treasuryCode);
    agency.appendChild(name);
    agency.appendChild(code);
    agency.appendChild(treasuryAgencyCode);
    
    for (Bureau bureau : bureaus) {
      agency.appendChild(bureau.getXML());
    }
    return agency;
    
  }  
           
}