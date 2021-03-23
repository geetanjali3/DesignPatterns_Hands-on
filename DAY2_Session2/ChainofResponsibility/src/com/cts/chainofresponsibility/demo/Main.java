package com.cts.chainofresponsibility.demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the employee name:");
		String name=in.nextLine();
		System.out.println("Enter the number of days yow want to apply leave for: ");
		int noOfdays=Integer.parseInt(in.nextLine());
		
		LeaveRequest obj= new LeaveRequest(name,noOfdays);
		ILeaveRequestHandler handler=new Supervisor();
		handler.handleRequest(obj);

	}

}
