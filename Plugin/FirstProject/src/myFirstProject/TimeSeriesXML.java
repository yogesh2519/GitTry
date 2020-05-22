package myFirstProject;
import nu.xom.Element;

 class TimeSeriesXML {
	
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
	  
	  
	
	 public TimeSeriesXML() {
		// TODO Auto-generated constructor stub
	}



	public String getActive() {
		return active;
	}



	public void setActive(String active) {
		this.active = active;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getTsd_name() {
		return tsd_name;
	}



	public void setTsd_name(String tsd_name) {
		this.tsd_name = tsd_name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getGroup_id() {
		return group_id;
	}



	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}



	public String getObject() {
		return object;
	}



	public void setObject(String object) {
		this.object = object;
	}



	public String getRow_gpt() {
		return row_gpt;
	}



	public void setRow_gpt(String row_gpt) {
		this.row_gpt = row_gpt;
	}



	public String getCol_gpt() {
		return col_gpt;
	}



	public void setCol_gpt(String col_gpt) {
		this.col_gpt = col_gpt;
	}



	public String getSrc_object() {
		return src_object;
	}



	public void setSrc_object(String src_object) {
		this.src_object = src_object;
	}



	public String getStart_date() {
		return start_date;
	}



	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}



	public String getEnd_date() {
		return end_date;
	}



	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}



	public String getPrior_value_method() {
		return prior_value_method;
	}



	public void setPrior_value_method(String prior_value_method) {
		this.prior_value_method = prior_value_method;
	}



	public String getReturns_method() {
		return returns_method;
	}



	public void setReturns_method(String returns_method) {
		this.returns_method = returns_method;
	}



	public String getFormula() {
		return formula;
	}



	public void setFormula(String formula) {
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
