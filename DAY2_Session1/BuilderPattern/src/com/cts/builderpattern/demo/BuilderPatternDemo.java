package com.cts.builderpattern.demo;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();
		
		//VEG MEAL DEMO

		Meal vegMeal = mealBuilder.prepareVegMeal();

		System.out.println("Veg Meal");

		vegMeal.showItems();

		System.out.println("Total Cost: " + vegMeal.getCost());

		
		//NON-VEG MEAL DEMO
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		
		System.out.println("Non Veg Meal");
		
		nonVegMeal.showItems();
		
		System.out.println("Total Cost: " + nonVegMeal.getCost());

	}

}