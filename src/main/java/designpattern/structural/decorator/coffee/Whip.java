package designpattern.structural.decorator.coffee;

public class Whip extends AddonsOfCoffee {

	public AbstractCoffeeRoot coffee =null;
	
	public Whip(AbstractCoffeeRoot abstractCoffeRoot){
		this.coffee = abstractCoffeRoot;
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription() + " whip " ;
	}

	@Override
	public Double getCost() {
		return coffee.getCost() + 0.28;
	}

}