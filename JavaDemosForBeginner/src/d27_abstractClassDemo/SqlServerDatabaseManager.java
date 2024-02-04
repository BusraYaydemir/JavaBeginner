package d27_abstractClassDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager {

	@Override
	void getData() {
		System.out.println("Data is loaded : Sql Server");
	}

}
