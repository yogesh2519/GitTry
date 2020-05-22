package myFirstProject;
import nu.xom.Element;

public class TimeSeriesConfig {
	
	  private String active;
	  private String id;
	  private String tsd_name;
	  private String type;
	  private String group_id;
	  private String object;
	  private String row_gpt;
	  private String col_gpt;
	  private String src_object;
	  private String start_date;
	  private String end_date;
	  private String prior_value_method;
	  private String returns_method;
	  private String formula;
	  
	  
	public TimeSeriesConfig(String active, String id, String tsd_name, String type, String group_id, String object,
			String row_gpt, String col_gpt, String src_object, String start_date, String end_date,
			String prior_value_method, String returns_method, String formula) {
		this.active = active;
		this.id = id;
		this.tsd_name = tsd_name;
		this.type = type;
		this.group_id = group_id;
		this.object = object;
		this.row_gpt = row_gpt;
		this.col_gpt = col_gpt;
		this.src_object = src_object;
		this.start_date = start_date;
		this.end_date = end_date;
		this.prior_value_method = prior_value_method;
		this.returns_method = returns_method;
		this.formula = formula;
	}
	
	 public Element getXML() {
		 
		 
		    String nameSpace = "urn:or-TimeSeriesDataConfigurations";
		    Element root = new Element("tsc:TimeSeriesConfigurations", nameSpace);
		    
		    Element active = new Element("tsc:active",nameSpace);
		    Element id = new Element("tsc:id",nameSpace);
		    Element tsd_name = new Element("tsc:tsd_name",nameSpace);
		    Element type = new Element("tsc:type",nameSpace);
		    Element group_id = new Element("tsc:group_id",nameSpace);
		    Element object = new Element("tsc:object",nameSpace);
		    Element row_gpt = new Element("tsc:row_gpt",nameSpace);
		    Element col_gpt = new Element("tsc:col_gpt",nameSpace);
		    Element src_object = new Element("tsc:src_object",nameSpace);
		    Element start_date = new Element("tsc:start_date",nameSpace);
		    Element end_date = new Element("tsc:end_date",nameSpace);
		    Element prior_value_method = new Element("tsc:prior_value_method",nameSpace);
		    Element returns_method = new Element("tsc:returns_method",nameSpace);
		    Element formula = new Element("tsc:formula",nameSpace);
		    
		    
		   // String nameSpace = "urn:or-TimeSeriesDataConfigurations";
			
		    
		    active.appendChild(this.active);
		    id.appendChild(this.id);
		    tsd_name.appendChild(this.tsd_name);
		    type.appendChild(this.type);
		    group_id.appendChild(this.group_id);
		    object.appendChild(this.object);
		    row_gpt.appendChild(this.row_gpt);
		    col_gpt.appendChild(this.col_gpt);
		    src_object.appendChild(this.src_object);
		    start_date.appendChild(this.start_date);
		    end_date.appendChild(this.end_date);
		    prior_value_method.appendChild(this.prior_value_method);
		    returns_method.appendChild(this.returns_method);
		    formula.appendChild(this.formula);
		    
		    
		    root.appendChild(active);
		    root.appendChild(id);
		    root.appendChild(tsd_name);
		    root.appendChild(type);
		    root.appendChild(group_id);
		    root.appendChild(object);
		    root.appendChild(row_gpt);
		    root.appendChild(col_gpt);
		    root.appendChild(src_object);
		    root.appendChild(start_date);
		    root.appendChild(end_date);
		    root.appendChild(prior_value_method);
		    root.appendChild(returns_method);
		    root.appendChild(formula);
		    
		    
		    
		    return root;
	 
	 }
	
	
	  
	  
	  
	  
	  
	  
	  

}
