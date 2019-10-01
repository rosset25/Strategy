package juegoRol;

public enum EnumMounts implements IMount{
	/* TODO Habría que separar EnumMounts de una clase abstracta
	 *  que englobe a todas las monturas (igual para armas)
	 */
	
	HORSE("Horse", 16.67), 
	DRAGON("Dragon", 555.50), 
	NOMOUNT("NoMount", 2.22);
	
	private String type;
	private double velocity;	//En m/s
	
	private EnumMounts(String type, double velocity) {
		this.type = type;
		this.velocity = velocity;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public double durationOfTheTrip(int distance) {
		return distance/velocity;
	}
	
	public static EnumMounts getOption(int position) {
	    return values()[position];
	}

	public static String getMenu() {
	    StringBuilder sb = new StringBuilder();
	    for(EnumMounts option: EnumMounts.values()) {
	        sb.append(option.ordinal());
	        sb.append(".- ");
	        sb.append(option.getType());
	        sb.append("\n");
	    }
	    return sb.toString();
	}
	
	
	
}
