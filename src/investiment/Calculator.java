package investiment;

public class Calculator {

	public static void main(String[] args) {
		
		int firstInvestiment = 14000;

		// year 1
		int increased = firstInvestiment * 40 / 100;
		
		//float inc = firstInvestiment * .4F;

		System.out.println("You start with $" + firstInvestiment);

		firstInvestiment += increased;

		System.out.println("The first year you have $" + firstInvestiment);
		// year 2

		int loss = 1500;

		int loweredInvestiment = firstInvestiment - loss;

		System.out.println("You lost " + loss + " and now you have $" + loweredInvestiment);

		// year 3

		int earnings = loweredInvestiment * 12 / 100;

		loweredInvestiment += earnings;

		System.out.println("You investiments had a lot of profits and now they're worth $" + loweredInvestiment);

	}

}
