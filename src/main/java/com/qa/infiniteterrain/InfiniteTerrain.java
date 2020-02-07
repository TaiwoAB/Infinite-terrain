package com.qa.infiniteterrain;


public class InfiniteTerrain {
	/**
	 * Declaring the variables of the terrain
	 */
	private int xLength;
	private int yWidth;
	/**
	 * This method returns the length of the terrain
	 * @return
	 */
	public int getXlength() {
		return xLength;
	}
	/**
	 * setting the length of the terrain
	 * @param m
	 */
	public void setXlength(Menu m) {
		this.xLength = m.getinfinteterrainDimensions();
	}
	/**
	 * This method returns the width of the terrain
	 * @return
	 */
	
	public int getYwidth() {
		return yWidth;
	}
	/**
	 * setting the width of the terrain
	 * @param m
	 */
	public void setYwidth(Menu y) {
		this.yWidth = y.getinfinteterrainDimensions();
	}
}
