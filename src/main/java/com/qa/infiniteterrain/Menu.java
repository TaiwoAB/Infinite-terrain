package com.qa.infiniteterrain;

import java.util.Scanner;

public class Menu {
	private String name;
	private int infinteTerrainDimensions;
	Scanner input = new Scanner(System.in);
	public void start() {
		
		System.out.println("To begin the game, please enter your username ");
		 this.name = input.nextLine();
    	System.out.println("Welcome " +this.name+ " to the infinite terrain adventure game where you can find and win a treasure\n");		
		
		
	}
	public void dimension() {
		System.out.println("The dimensions of the infinite terrain metres the length of the grid is the row in the grid in metres and the width of infinite terrain in metres the column in the grid\n");

		
		while(true) {
			System.out.println("Enter the length of the swamp in metres i.e. it is must be an odd number and greater than 10 to attain the middle of the swamp; you can choose above 30 for difficulty");
			String dimstring = input.nextLine();
			if(dimstring.matches("\\d+")) {
				int dimension = Integer.parseInt(dimstring);
				if(dimension>10 && dimension%2!=0 ) {
					this.infinteTerrainDimensions=dimension;
					System.out.println("The dimension of the infinte terrain is "+ this.infinteTerrainDimensions +"X"+ this.infinteTerrainDimensions);
					break;
				}else {
					System.out.println("invalid input given");
				}
			}else {
				System.out.println("invalid input given");
			}
			
		}		
    	
	}
	public String getName() {
		return name;
	}

	public int getinfinteterrainDimensions() {
		return infinteTerrainDimensions;
	}
	public void setinfinteterrainDimensions( int infinteTerrainDimensions) {
		this.infinteTerrainDimensions = infinteTerrainDimensions;
	}
}
