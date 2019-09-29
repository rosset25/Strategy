package juegoRol;

public abstract class Character {
	
	String name;
	
	IWeapon weapon; //cambiados por interfaces
	IMount mount;
	
	public Character(String nombre) {
		this.name = nombre;
	}
	
	public void selectWeapon(IWeapon arma) {
		this.weapon = arma;
	}
	
	public void useWeapon() {
		//TODO UTILIZAR ARMA (HACER)
	}
	
	public void selectMount(EnumMounts montura) {
		this.mount = montura;
	}
	
	public void useMount(int distancia, EnumDirection direccion) {
		//TODO UTILIZAR ARMA (HACER)
	}
	
	public void info() {
		//TODO PONER TIPOPERSONAJE, NOMBRE, ARMA, PUNTOS DAÑO ARMA, TIPO MONTURA
	}
}
