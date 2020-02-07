package com.qa.infiniteterrain;

import java.util.Random;


public class Monster {
	Random rand = new Random();
	private int[] monsterPositionx = new int[4];
	private int[] monsterPositiony= new int[4];
	private int[] hp = {3,5,7,10};

	private String[] monsterTypes = {"Ogre","Head crabs","Floor master", "Super mutant"};




	public int[] getMonsterPositionx() {
		return monsterPositionx;
	}

	public void setMonsterpositionx(Menu m) {
		for(int i=0; i<4;i++) {
			this.monsterPositionx[i]=rand.nextInt(m.getinfinteterrainDimensions());
		}
		
	}

	public int[] getMonsterPositiony() {
		return monsterPositiony;
	}

	public void setMonsterpositiony(Menu y) {
		for(int i=0; i<4;i++) {
			this.monsterPositiony[i]=rand.nextInt(y.getinfinteterrainDimensions());
		}
	}

	public String[] getMonsterTypes() {
		return monsterTypes;
	}

	public int[] getHp() {
		return hp;
	}

}
