package d26_abstractClasses;

public abstract class GameCalculator {
	
	
	// This abstract method should be override in other classes.
	public abstract void calculate();
	
	
	// This final method cannot be override in other classes.
	public final void finish() {
		System.out.println("Game Over!");
	}
}
