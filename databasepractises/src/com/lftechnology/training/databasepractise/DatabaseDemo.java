package com.lftechnology.training.databasepractise;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This Class reads the user choice to perform simple sql operations like select,insert,delete.
 * @author srizna
 * 
 */

public class DatabaseDemo {

	private static final Logger LOGGER = Logger.getLogger(DatabaseDemo.class.getName());
	private static Connection con;
	private static PreparedStatement statement=null;
	private static CallableStatement cs=null;
	private static ResultSet result;
	private static String query;
	static Scanner input = new Scanner(System.in);

	/**
	 * This selectDataFromDatabase method executes select query to list out the all the rows from the table.
	 * @author srizna
	 */
	
	public void selectDataFromDatabase() {
		query = "Select * from employee";
		try {
			statement = con.prepareStatement(query);
			LOGGER.info("Executing Select query....");
			result = statement.executeQuery();
			
			while (result.next()) {
				LOGGER.info("Reading each rows from table....");
				int id = result.getInt("empid");
				String name = result.getString("empname");
				String address = result.getString("address");
				double salary = result.getDouble("salary");
				LOGGER.info("EmpId is " + id + "\t" + "Emp Name is "+ name + "\t" + "Address is " + address + "\t"+ "Salary is " + salary);
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE,e.getClass().getSimpleName() + " inside select query");
		}
	}
	public void functionCall(){
		int id=3;
		try {
			cs=con.prepareCall("{?=call func(?)}");
			cs.registerOutParameter(1,java.sql.Types.VARCHAR);
			cs.setInt(2,id);
			cs.execute();
			String outParam = cs.getString(1);
			System.out.println("The employee name recieved from function call is "+outParam);
		} catch (SQLException e) {
			
			LOGGER.log(Level.SEVERE,e.getClass().getSimpleName() + " inside functioncall");
		}
		
	}
	/*public void procedureCall(){
		int id=3;
		String getDBUSERByUserIdSql="{?=call use_procedure(?)}";
		try {
			cs = con.prepareCall(getDBUSERByUserIdSql);
			 
			
			cs.registerOutParameter(1, java.sql.Types.VARCHAR);
			cs.setInt(2, 3);
			cs.execute();
			 
			String outParam = cs.getString(1);
			System.out.println(outParam);
		} catch (SQLException e) {
			
			LOGGER.log(Level.SEVERE,e.getClass().getSimpleName() + " inside procedurecall");
		}
		
	}*/
	/**
	 * THis deleteDataFromDatabase method executes delete query to delete the record according to user's input employee id.
	 * @author srizna
	 */
	public void deleteDataFromDatabase() {

		System.out.println("Enter employee id to delete the respective employee:");
		int i = input.nextInt();
		try {
			statement = con	.prepareStatement("delete from employee where empid=?");
			statement.setInt(1, i);
			if(statement.executeUpdate()==1){
				LOGGER.info("Row deleted successfully...");
			}else{
				LOGGER.info( "No data fround.Problem in deletion..");
			}

		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE,e.getClass().getSimpleName() + " inside delete query.");
		}
	}

	/**
	 * This insertDataToDatabase method executes insert query to insert the new employee record into the table.
	 * it reads the employee name,address, salary from the user.
	 * @author srizna
	 */
	public void insertDataToDatabase() {
		query = "insert into employee(empname,address,salary) values(?,?,?)";
		System.out.println("Enter employee name: ");
		String employeeName = input.next();
		System.out.println("Enter employee address: ");
		String address = input.next();
		System.out.println("Enter Salary: ");
		double salary = input.nextDouble();
		try {
			statement = con.prepareStatement(query);
			statement.setString(1, employeeName);
			statement.setString(2, address);
			statement.setDouble(3, salary);
			if(statement.executeUpdate()==1){
				LOGGER.info("data inserted successfully...");
			}else{
				LOGGER.info( "Data  not inserted");
			}

		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE,e.getClass().getSimpleName() + " inside insert query.");
		}

	}

	/**
	 * This enterOption method reads the user's choice to perform different operation.
	 * @author srizna
	 */
	public void enterOption() {
		int userChoice = 0;
		System.out.println("Enter the option to perform respective operations.."
						+ "\n" + "1.To view list of employees" + "\n"
						+ "2.To delete employee" + "\n"
						+ "3.To insert employee values");
		try {
			userChoice = input.nextInt();
			switch (userChoice) {
			case 1:
				selectDataFromDatabase();
				processContinue();
				break;
			case 2:
				deleteDataFromDatabase();
				processContinue();
				break;
			case 3:
				insertDataToDatabase();
				processContinue();
				break;
			default:
				LOGGER.info("Wrong choice input.enter valid inputfrom option");
				enterOption();
			}
		} catch (InputMismatchException e) {
			LOGGER.info(e.getClass().getSimpleName());
		}
		
	}

	/**
	 * This processContinue method ask the user whether to continue or not.if yes display the choice option orelse exit from the program.
	 * @author srizna
	 */
	public void processContinue() {
		
		System.out.println("Press 1 to continue. 0 to exit");
		try{
			int repeatProcessChoice= input.nextInt();
			if (repeatProcessChoice == 1) {
				enterOption();
			}else if(repeatProcessChoice==0){
				LOGGER.info("Thank you...");
				System.exit(0);
			}else{
				LOGGER.info("Wrong integer entered");
				processContinue();
			}
		}catch(InputMismatchException e){
			LOGGER.log(Level.SEVERE,"wrong input type");
		}

	}

	/**
	 * This main method calls all the methods within the class.
	 * @author srizna
	 */
	public static void main(String[] arg) {
		LOGGER.info("Inside main method");
		DbConnection connectionObject = new DbConnection();
		con = connectionObject.getConnection();
		DatabaseDemo demoClassObject = new DatabaseDemo();
		//demoClassObject.procedureCall();
		demoClassObject.functionCall();
		if(con!=null){
		demoClassObject.enterOption();
		}

	}
}
