package juegoRol;

public enum EnumMounts implements IMount{
	/* TODO Habr�a que separar EnumMounts de una clase abstracta
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
	
	
	
	
}
