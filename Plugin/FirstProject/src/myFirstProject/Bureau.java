
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
 * <cite><a 
 * href="http://www.cafeconleche.org/books/xmljava/">Processing 
 * XML with Java</a></cite>.
 * </p>
 * 
 * @author Elliotte Rusty Harold
 * @version 1.3.1
 *
 */
public class Bureau {
 
  // Agency code plus bureau code uniquely identify a bureau  
  // Bureau code alone is definitely not sufficient
  private String code;
  private String name;
  private String year;
  private String agencyCode;
  
  private List<Account> accounts = new ArrayList<Account>();
  
  private static Map<String, Bureau> instances = new HashMap<String, Bureau>();

  // Use a private constructor so instantiators 
  // have to use the factory method
  private Bureau(String name, String code, String agencyCode, 
    String year) {
        
    this.name = name;
    this.code = code;
    this.agencyCode = agencyCode;
    this.year = year;
    
  }
  
  public static Bureau getInstance(String name, String code, 
   String agencyCode, String year) {
        
    String key = agencyCode+" "+code+" "+year;
    Bureau bureau = (Bureau) instances.get(key);
    if (bureau == null) {
      bureau = new Bureau(name, code, agencyCode, year);
      instances.put(key, bureau);
    }
    
    return bureau;
        
  }
  
  public void add(Account account) {
    if (!accounts.contains(account)) accounts.add(account);     
  }
  
  public Element getXML() {
        
    Element bureau = new Element("Bureau");
    Element name = new Element("Name");
    Element code = new Element("Code");

    name.appendChild(this.name);
    code.appendChild(this.code);
    bureau.appendChild(name);
    bureau.appendChild(code);
    
    for (Account account : accounts) {
      bureau.appendChild(account.getXML());
    }
    return bureau;
    
  }
          
}