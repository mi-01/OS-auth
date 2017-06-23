package lu.mihaela;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lu.mihaela.DBInfo;

public class DBTools {
	
	private long lastInsertedRowID;

	public DBTools() {
		try {
			// registering the driver
			Class.forName(DBInfo.getDriver());
		} catch (ClassNotFoundException e) {
			System.out.println("Error. Driver class not found: " + e);
		}
	}

	public long getlastInsertedRowID() {
		return lastInsertedRowID;
	}

	public void setlastInsertedRowID(long lastInsertedRowID) {
		this.lastInsertedRowID = lastInsertedRowID;
	}

	Connection getConnection() {
		String dbURL = DBInfo.getDBURL();
		String user = DBInfo.getUser();
		String password = DBInfo.getPassword();
		Connection connection = null;
		
		// connecting
		try {
			connection = DriverManager.getConnection(dbURL, user, password);

		} catch (SQLException e) {
			System.out.println("Error. Connection problem: " + e);
		}
		return connection;
	}
	
	//*********************
	boolean isUserRegistered(String username){
		boolean isRegistered = false;
		PreparedStatement pstmt = null;
		ResultSet result = null;
		
		Connection connection = getConnection();
		try {
			pstmt = connection.prepareStatement("SELECT * FROM users WHERE user_name=?");
			pstmt.setString(1, username);
		} catch (SQLException e) {
			System.out.println("Statement creation error: " + e);
			return false;
		}
		
		try {
			result = pstmt.executeQuery();
			if (result.next()){
				isRegistered = true;
				pstmt.close();
			}
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("Execution error: " + e);
			return false;
		}
		return isRegistered;
	}
}