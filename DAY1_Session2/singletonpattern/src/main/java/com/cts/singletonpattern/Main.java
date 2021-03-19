package com.cts.singletonpattern;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		DBConn dbconnobj=DBConn.getInstance();
		DBConn dbconnobj2=DBConn.getInstance();
		
		System.out.println(dbconnobj==dbconnobj2);

	}

}
