
public class TimeSeriesConfigParameter {
	public String active;
	public int id;
	public String tsd_name;
	public String type;
	public String group_id;
	public String object;
	public String row_gpt;
	public String col_gpt;
	public String src_object;
	public String start_date;
	public String end_date;
	public String prior_value_method;
	public String returns_method;
	public String formula;

	public TimeSeriesConfigParameter(String active, int id, String tsd_name, String type, String group_id,
			String object, String row_gpt, String col_gpt, String src_object, String start_date, String end_date,
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
}