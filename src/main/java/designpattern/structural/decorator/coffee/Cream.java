package designpattern.structural.decorator.coffee;

public class Cream extends AddonsOfCoffee {

	public AbstractCoffeeRoot coffee =null;
	
	public Cream(AbstractCoffeeRoot abstractCoffeRoot){
		this.coffee = abstractCoffeRoot;
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription() + " cream " ;
	}

	@Override
	public Double getCost() {
		return coffee.getCost() + 0.15;
	}

}