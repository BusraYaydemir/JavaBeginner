package d25_polymorphism;

public class FileLogger extends BaseLogger{
	public void log (String message) {
		System.out.println("Log to File: " + message);
	}
}
