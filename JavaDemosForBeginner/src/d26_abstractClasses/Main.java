package d26_abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		/*
		GameCalculator gameCalculator = new GameCalculator() {
			
			@Override
			public void calculate() {
				System.out.println("You should override all abstact method, when you want to create an object from abstarct class");
				
			}
		};
		*/
		
		GameCalculator gameCalculator = new KidsGameCalculator();
		gameCalculator.calculate();
		gameCalculator.finish();
		
		GameCalculator[] gameCalculators = {new WomanGameCalculator(), new ManGameCalculator(), new KidsGameCalculator()};
		
		for (GameCalculator gamer : gameCalculators) {
			gamer.calculate();
			gamer.finish();
		}
	}

}
