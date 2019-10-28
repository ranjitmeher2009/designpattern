package designpattern.structural.decorator.coffee;

import java.util.Scanner;

public class ClientCofeeBiller {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {

			System.out.println("This is the Client Main Decorator Pattern ");

			System.out.println("What kind of coffee would you like to have ? ");
			System.out.println("Press 1 for Hot Coffee ");
			System.out.println("Press 2 for Cold Coffee ");
			Integer coffeeType =   scan.nextInt();
			AbstractCoffeeRoot abstractCoffeeRoot =null;
			if(coffeeType == 1){
				abstractCoffeeRoot = new HotCoffee();
			}else{
				abstractCoffeeRoot = new ColdCoffee();
			}
			
			System.out.println("Do you want Cream ? ");
			System.out.println("Press 1 for YES and 0 for NO ");
			Integer coffeeCream=   scan.nextInt();
			if(coffeeCream == 1){
				abstractCoffeeRoot = new Cream(abstractCoffeeRoot);
			}
			
			System.out.println("Do you want Whip ? ");
			System.out.println("Press 1 for YES and 0 for NO ");
			if(scan.nextInt() == 1){
				abstractCoffeeRoot = new Whip(abstractCoffeeRoot);
			}
			
			System.out.println("Do you want Chokos ? ");
			System.out.println("Press 1 for YES and 0 for NO ");
			if(scan.nextInt() == 1){
				abstractCoffeeRoot = new Chokos(abstractCoffeeRoot);
			}
			
			System.out.println("Your final order is");
			System.out.println(abstractCoffeeRoot.getDescription());
			System.out.println("Toal cost of order is " + abstractCoffeeRoot.getCost());
			System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
			repeatRunFlag = scan.nextInt();
		}
	}
}