package com.lftechnology.training.databasepractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * This class established connection to mysqldatabase.
 * @author srizna
 *
 */
public class DbConnection {

	private static final Logger LOGGER = Logger.getLogger(DatabaseDemo.class.getName());
	private static Connection con;

	public DbConnection() {
		LOGGER.info("Establishing Connection....");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/lftraining", "root", "root");
			LOGGER.info("Connection Establised");
		} catch (ClassNotFoundException | SQLException e) {
			LOGGER.info(e.getClass().getSimpleName() + " DbConnection.");
			LOGGER.info("Connection Closed");
			closeConnection();
		}
	}

	public static Connection getConnection() {
		return con;
	}
	
	private static void closeConnection(){
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
					LOGGER.log(Level.SEVERE,e.getClass().getSimpleName()+e.getMessage());
			}
		}
	}

}
