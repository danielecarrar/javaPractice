package marsProject;

class MarsApplication {
	public static void main(String[] arguments) {
		
		MarsRobot opportunity = new MarsRobot();
		opportunity.temperature = -60;
		opportunity.speed = 4;
		opportunity.status = "exploring unknown area";
		opportunity.showAttributes();
		
		
		
		
		
		
		
		
		
		
		MarsRobot spirit = new MarsRobot();
		spirit.status = "exploring";
		spirit.speed = 2;
		spirit.temperature = -60;

		spirit.showAttributes();
		System.out.println("Increasing speed to 3.");
		spirit.speed = 3;
		spirit.showAttributes();
		System.out.println("Changing temperature to -90.");
		spirit.temperature = -90;
		spirit.showAttributes();
		System.out.println("Checking the temperature.");
		spirit.checkTemperature();
		spirit.showAttributes();
	}
}
