package com.qa.infiniteterrain;



public class Player {
	
	/**
	 * Declaring player attributes
	 */
	private String name;
	private int initialPlayerxPos;
	private int initialPlayeryPos;
	private int lifeCount=3;
	private int hp=5;
	
	
	

	public String getName() {
		return name;
	}
	public void setName(Menu m) {
		this.name = m.getName();
	}
	
	public int getInitialPlayerxPos() {
		return initialPlayerxPos;
	}
	public void setInitialPlayerxPos(Menu m) {
		this.initialPlayerxPos = (m.getinfinteterrainDimensions()/2)+1;
	}
	public int getInitialPlayeryPos() {
		return initialPlayeryPos;
	}
	public void setInitialPlayeryPos(Menu y) {
		this.initialPlayeryPos = (y.getinfinteterrainDimensions()/2)+1;
	}
	public int getLifeCount() {
		return lifeCount;
	}
	public int getHp() {
		return hp;
	}
}
