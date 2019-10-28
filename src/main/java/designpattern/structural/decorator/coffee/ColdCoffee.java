package designpattern.structural.decorator.coffee;

public class ColdCoffee extends AbstractCoffeeRoot {

	public ColdCoffee(){
		setName("Cold Coffee ");
		setDescription("Cold coffee with - ");
	}
	
	@Override
	public Double getCost() {
		return 12.0;
	}
}