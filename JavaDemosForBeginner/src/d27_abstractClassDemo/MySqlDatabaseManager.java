package d27_abstractClassDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager {

	@Override
	void getData() {
		System.out.println("Data is loaded : My Sql");
	}

}
