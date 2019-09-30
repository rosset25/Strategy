package juegoRol;

public abstract class Character {
	
	String name;
	
	IWeapon weapon; 
	IMount mount;
	
	int posX; 
	int posY;
	
	public Character(String name) {
		this.name = name;
		this.posX = 0;
		this.posY = 0;
	}
	
	abstract public String getType();
	
	public void selectWeapon(IWeapon weapon) {
		this.weapon = weapon;
	}
	
	public void useWeapon() {
		
		StringBuilder message = new StringBuilder();
		message.append(name);
		message.append(" uses " + weapon.getType());
		message.append(" and makes ");
		message.append(weapon.pointsDamage() + " points of damage.");
	}
	
	public void selectMount(IMount mount) {
		this.mount = mount;
	}
	
	public void useMount(int distance, EnumDirection direction) {
		
		this.posX = this.posX + distance*direction.getX();
		this.posY = this.posY + distance*direction.getY();
		
		StringBuilder message = new StringBuilder();
		message.append(name);
		message.append(" uses " + mount.getType());
		message.append(", go to "+ direction.getDirection()+". \n");
		message.append("current position: (" + posX + ", " + posY + ") \n");
		message.append("duration: " + mount.durationOfTheTrip(distance) + "km.");
	}
	
	public void info() {
		
		StringBuilder message = new StringBuilder();
		message.append("Name: " + name + "\n");
		message.append("Type: " + getType() + "\n");
		message.append("Wepaon: " + weapon.getType() + "\n");
		message.append("Position: " + posX + ", " + posY);
		
		//TODO PONER TIPOPERSONAJE, NOMBRE, ARMA, PUNTOS DAÑO ARMA, TIPO MONTURA
	}
}
