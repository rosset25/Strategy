package juegoRol;

public enum EnumDirection {
	NORTH(1,0, "North"), 
	SOUTH(-1,0, "South"), 
	EST(0,1, "Est"), 
	WEST(0,-1, "West");
	
	private int x;
	private int y;
	private String direction;
	
	private EnumDirection(int x, int y, String direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getDirection() {
		return direction;
	}
	
	public static EnumDirection getOption(int position) {
	    return values()[position];
	}

	public static String getMenu() {
	    StringBuilder sb = new StringBuilder();
	    for(EnumDirection option: EnumDirection.values()) {
	        sb.append(option.ordinal());
	        sb.append(".- ");
	        sb.append(option.getDirection());
	        sb.append("\n");
	    }
	    return sb.toString();
	}
	
	
}
