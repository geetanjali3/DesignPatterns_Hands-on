package com.cts.facadepattern.demo;

import java.util.Scanner;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeMaker shapeMaker=new ShapeMaker();
		
		Scanner in = new Scanner(System.in);
		while(true) {
		System.out.println("Enter the shape you want to draw:\n 1.circle \n 2.rectangle \n 3.square" );
		String shape=in.next().toLowerCase();
		if(shape.equals("circle"))
		{
			shapeMaker.drawCircle();
			System.exit(0);
		}
		else if(shape.equals("rectangle"))
		{
			shapeMaker.drawRectangle();
			System.exit(0);
		}	
		else if(shape.equals("square"))
		{
			shapeMaker.drawSquare();
			System.exit(0);
		}
			
		else
			System.out.println("Please Choose one shape from above list");
		}
				

	}

}
