package com.qa.infiniteterrain;


import java.util.Random;
import java.util.Scanner;

public class Game implements Action{
	private int playerHp;
	private int lifeCount;
	private boolean bool=false;
	private boolean foo =false;
	private boolean endGame = false;
	private int playerPosX;
	private int playerPosY;
	Menu menu= new Menu();
	Treasure treasure = new Treasure();
	Player player = new Player();
	Monster monsters= new Monster();
	Compass compass = new Compass();
	Items items = new Items();
	Scanner scanner = new Scanner(System.in);
	
	public void startGame( ) {
	   this.lifeCount= player.getLifeCount();
	   this.playerHp= player.getHp();
	   menu.start();
	   menu.dimension();
	   treasure.setXTreasureLocation(menu);
	   treasure.setYTreasureLocation(menu);
	   player.setInitialPlayerxPos(menu);
	   player.setInitialPlayeryPos(menu);
	   monsters.setMonsterpositionx(menu);
	   monsters.setMonsterpositiony(menu);
	   this.setPlayerposx(player);
	   this.setPlayerposy(player);
	   
	   //THIS IS USED TO TEST THE CODE AND FIND THE TREASURE QUICKLY
//	   	System.out.println("This treasure's x coordinate is " + treasure.getXtreasureLocation());
//  	System.out.println("This treasure's y coordinate is " + treasure.getYTreasureLocation());
//  	for(int i=0; i<monsters.getMonsterPositionx().length;i++) {
//		   System.out.println("The monster number "+(i+1)+" is in the coodinates ["+monsters.getMonsterPositionx()[i]+" "+monsters.getMonsterPositiony()[i] +"]");
//	   
//	   }
	   
	   
	}
	
	public void gamePlay() {
		System.out.println("Grey foggy clouds float oppressively close to you,reflected in the murky grey water which reaches up your shins. Some black plants barely poke out of the shallow water. Try \"north\", \"south\", \"east\", or \"west\"You notice a small watch-like device in your left hand.It has hands like a watch, but the hands don't seem to tell time");
		while(!endGame) {
		foo =false;
		for(int i=0;i<monsters.getMonsterPositionx().length;i++) {
			if(playerPosX== monsters.getMonsterPositionx()[i] && playerPosY ==monsters.getMonsterPositiony()[i]) {
				System.out.println("You've have encountered the monster "+ monsters.getMonsterTypes()[i]);
				while(!foo) {
					System.out.println("Choose the action to take (1) run or (2)");
					String action =scanner.nextLine();
					if(action.matches("\\d")) {
						int actionnum= Integer.parseInt(action);
						actionTaken(actionnum, monsters.getHp()[i]);
						foo=true;
					}else {
						System.out.println("invalid input");
					}
				}
				
				
			}
			
		}
		System.out.println("Enter your direction. Try North, South, East or West");
		String direction = scanner.nextLine().toLowerCase();
		if(direction.equalsIgnoreCase(compass.getNorthDirection())) {
			
			if(playerPosY==0) {
				System.out.println("You can't proceed further you are at boundary of the grid");
			}else {
				playerPosY+=-1;
			}
		}else if (direction.equalsIgnoreCase(compass.getEastDirection())){
			if(playerPosX==menu.getinfinteterrainDimensions()-1) {
				System.out.println("You can't proceed further you are at boundary of the grid");
			}else {
				playerPosX+=+1;
	
			}
			
		}else if(direction.equalsIgnoreCase(compass.getWestDirection())){
			if(playerPosX==0) {
				System.out.println("You can't proceed further you are at boundary of the grid");
			}else {
				playerPosX+=-1;
			}
			
		}else if(direction.equalsIgnoreCase(compass.getSouthDirection())) {
			if(playerPosY==menu.getinfinteterrainDimensions()-1) {
				System.out.println("You can't proceed further you are at boundary of the grid");
			}else {
				playerPosY+=+1;
			}
			
		}else {
			System.out.println("Invalid input");
		}
		
		System.out.println("Your coordinates are "+ "[" +playerPosX + ","+playerPosY+"]");
		
		
		if(playerPosX== treasure.getXtreasureLocation() && playerPosY ==treasure.getYTreasureLocation()) {
			System.out.println("The dial reads that you are about  "+ (Math.round(Math.sqrt((Math.abs(treasure.getXtreasureLocation()-playerPosX)*Math.abs(treasure.getXtreasureLocation()-playerPosX)+ (Math.abs(treasure.getYTreasureLocation()-playerPosY)*Math.abs(treasure.getYTreasureLocation()-playerPosY))))))+"m");
			System.out.println("Congrats you have found the treasure");
			endGame=true;
		}else {
			System.out.println("The dial reads that you are about  "+ (Math.round(Math.sqrt((Math.abs(treasure.getXtreasureLocation()-playerPosX)*Math.abs(treasure.getXtreasureLocation()-playerPosX)+ (Math.abs(treasure.getYTreasureLocation()-playerPosY)*Math.abs(treasure.getYTreasureLocation()-playerPosY))))))+"m away from the treasure however you might encounter some monsters on the way");
		}
	}
		

		
		

		}

	
	public void setPlayerposx(Player p) {
		this.playerPosX = p.getInitialPlayerxPos();
	}

	public void setPlayerposy(Player p) {
		this.playerPosY = p.getInitialPlayeryPos();
	}

	public void actionTaken(int action, int hp) {
		if(action==1) {
			System.out.println("Run away from the monster");
			bool=true;
		}else if(action==2) {
			System.out.println("Choose an item number (0) Swords, (1) Bow and arrow, (2) laser beam ");
			String item = scanner.nextLine();
			if(item.matches("\\d")) {
				int itemnum= Integer.parseInt(item);
				System.out.println("You have chosen the "+items.getItem()[itemnum]);
			}else {
				System.out.println("invalid input");
			}
			while(!bool) {
				Random rind = new Random();
				System.out.println("Choose a number between 0 to 2");
				String num= scanner.nextLine();
				if(num.matches("\\d")){
					int integernum = Integer.parseInt(num);
					if(integernum==0||integernum==1||integernum==2) {
						if(integernum==rind.nextInt(3)) {
							hp = hp-1;
							System.out.println("You've have landed a hit on the monster and the monster's hp is "+hp);
							if(hp==0) {
								System.out.println("You have defeated the monster");
								bool=true;
							}
						}else {
						     playerHp= playerHp-1;
						     System.out.println("The monster landed a hit on you and the your hp is "+ playerHp);
						     if(playerHp==0) {
						    	 lifeCount=player.getLifeCount()-1;
						    	 System.out.println("Your life count is "+lifeCount);
						    	 playerHp= player.getHp();

						    	 
						    	 if(lifeCount==0) {
						    		 System.out.println("You are dead");
						    		 bool=true;
						    		 endGame=true;
						    	 }
						     }
						}
					}else {
						System.out.println("invalid input");
					}
				}else {
					System.out.println("invalid input");
				}
				
				
			}
		}

	}

	


	





	







	


}
