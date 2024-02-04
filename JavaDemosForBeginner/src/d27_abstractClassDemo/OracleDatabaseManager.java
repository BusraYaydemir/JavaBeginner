package d27_abstractClassDemo;

public class OracleDatabaseManager extends BaseDatabaseManager {

	@Override
	void getData() {
		System.out.println("Data is loaded : Oracle");
	}

}
