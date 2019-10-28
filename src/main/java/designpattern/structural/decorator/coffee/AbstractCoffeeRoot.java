package designpattern.structural.decorator.coffee;

public abstract class AbstractCoffeeRoot {

	String description = " Coffee root ";
	String name = "undefined ";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract Double getCost(); 
}