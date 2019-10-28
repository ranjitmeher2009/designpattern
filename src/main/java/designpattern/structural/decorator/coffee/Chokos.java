package designpattern.structural.decorator.coffee;

public class Chokos extends AddonsOfCoffee {

	public AbstractCoffeeRoot coffee =null;
	
	public Chokos(AbstractCoffeeRoot abstractCoffeeRoot){
		this.coffee = abstractCoffeeRoot;
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription() + " chokos " ;
	}

	@Override
	public Double getCost() {
		return coffee.getCost() + 0.17;
	}

}