package com.qa.infiniteterrain;

import java.util.Random;


public class Treasure {
	Random rand = new Random();
	private int xTreasureLocation;
	private int yTreasureLocation;
	public int getXtreasureLocation() {
		return xTreasureLocation;
	}
	public void setXTreasureLocation(Menu m) {
		
		this.xTreasureLocation = rand.nextInt(m.getinfinteterrainDimensions());
	}
	public int getYTreasureLocation() {
		return yTreasureLocation;
	}
	public void setYTreasureLocation(Menu y) {
		this.yTreasureLocation = rand.nextInt(y.getinfinteterrainDimensions());
	}
}
