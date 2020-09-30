package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws SQLException, IOException, ClassNotFoundException {
		Connection con= null;
		//ConnectionManager connectionmanager =new ConnectionManager();
		con=ConnectionManager.getConnection();
		if(con!=null) {
			System.out.println("Connection Established");
			
		}
		else
		{
			System.out.println("Check your connection");
		}
		
	}
}