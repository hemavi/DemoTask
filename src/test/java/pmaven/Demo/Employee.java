package pmaven.Demo;

import java.util.List;

@XMLRootElement
public class Employee {

	private List<Details> details;

	public List<Details> getDetails() {
		return details;
	}

	public void setDetails(List<Details> details) {
		this.details = details;
	}

}
