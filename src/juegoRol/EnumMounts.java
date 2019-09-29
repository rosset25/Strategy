package juegoRol;

public enum EnumMounts implements IMount{
	/* TODO Habría que separar EnumMounts de una clase abstracta
	 *  que englobe a todas las monturas (igual para armas)
	 */
	
	HORSE("Horse", 45.0), 
	DRAGON("Dragon", 120.0), 
	NOMOUNT("NoMount", 5.0);
	
	private String type;
	private double velocity;
	
	private EnumMounts(String type, double velocity) {
		this.type = type;
		this.velocity = velocity;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double durationOfTheTrip(int distance) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
