package com.renz.mealPlan;
import java.util.Arrays;
import java.util.Scanner;
/*
 * 
 * @ Jayson Mallari
 */
public class mealPlan {
	
	
	
	public static void main(String[] args){
		//call getTotalMealWeeks method, which returns the number of weeks
		int numOfWeeks = getTotalMealWeeks();
		double[] dailyMealCost = new double[7]; 
		
		//print array contents before calling the method, should be all zeros
		System.out.println("My array list before calling the method : " + Arrays.toString(dailyMealCost));
		
		//call getDailyMealCost method - uses call by reference
		getDailyMealCost(dailyMealCost);
		
		//print array contents after calling the method
		System.out.println("My array list after calling the method : " + Arrays.toString(dailyMealCost));
		
		double totalCost = computeMealPlanTotalCost(numOfWeeks, dailyMealCost);
		
		printTotalCost(totalCost);
		
	}
	
	public static int getTotalMealWeeks(){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please eneter the number of weeks per semester : ");
		int totalWeeks = in.nextInt();
		return totalWeeks;
	}
	
	public static void getDailyMealCost(double[] dailyCost){
		Scanner in = new Scanner(System.in);
		String day[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		for(int x=0;x<dailyCost.length;x++){
			System.out.println(day[x]+ " : ");
			dailyCost[x] = in.nextDouble();
		}
	}
	
	
	public static double computeMealPlanTotalCost(int numWeeks, double[] dailyCost){
		double totalCost=0, costPerWeek=0;
			for(int x=0;x<dailyCost.length;x++){
				costPerWeek += dailyCost[x];
			}
			
			totalCost = costPerWeek * numWeeks;
			return totalCost;
	}
		
	
	public static void printTotalCost(double total){
		System.out.printf("The estimated total cost of your meal plan for the whole semester is : $%5.2f ",total);
		System.out.println();
	}

}
