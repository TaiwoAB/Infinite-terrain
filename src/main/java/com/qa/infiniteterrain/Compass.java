package com.qa.infiniteterrain;

public class Compass {
	/**
	 * This is where the variables are initialised
	 */
	private String northDirection= "North";
	private String eastDirection="East";
    private String westDirection="West";
	private String southDirection="South";
	
	/**
	 * This method is used to get the north direction
	 * @return returns whether North
	 */
	 
	public String getNorthDirection() {
		return northDirection;
	}
	/**
	 * This method is used to get the east direction
	 * @return returns whether east
	 */
	public String getEastDirection() {
		return eastDirection;
	}

	/**
	 * This method is used to get the west direction
	 * @return returns whether west
	 */
	 
	public String getWestDirection() {
		return westDirection;
		
	}

	/**
	 * This method is used to get the south direction
	 * @return returns whether south
	 */
	 
	public String getSouthDirection() {
		return southDirection;
	}
}
