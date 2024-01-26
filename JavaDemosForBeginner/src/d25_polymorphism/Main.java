package d25_polymorphism;

public class Main {

	public static void main(String[] args) {
		BaseLogger[] loggers = new BaseLogger[] {new DatabaseLogger(), new FileLogger(), new ConsoleLogger()};
		
		for(BaseLogger logger: loggers) {
			logger.log("Logged!");
		}
		
		
		// If you want to change logged type change only constructor parameter in here 
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
