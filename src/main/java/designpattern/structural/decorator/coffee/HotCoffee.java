package designpattern.structural.decorator.coffee;

public class HotCoffee extends AbstractCoffeeRoot {

	public HotCoffee(){
		setName("Hot Coffee ");
		setDescription(" Hot coffee with - ");
	}
	
	
	@Override
	public Double getCost() {
		return 10.0;
	}

}