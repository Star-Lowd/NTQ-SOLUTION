package JDBC_MySql;

import java.sql.DriverManager;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.MySQLConnection;

public class EntityDAO <Entity extends AbstractEntity>{
	
	public EntityDAO() {
		try {
			Class.forName("com.mysql.jdbc");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
