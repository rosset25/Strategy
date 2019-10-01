package juegoRol;

public class StaticMain {

	public static void main(String[] args) {
		//We create Rafa character
		Character knight = new Knight("Rafa");
		
		//His weapon is a sword
		IWeapon weapon = EnumWeapons.SWORD;
		knight.selectWeapon(weapon);
		
		//His mount a horse
		IMount mount = EnumMounts.HORSE;
		knight.selectMount(mount);
		
		//We get his information
		knight.info();
		
		System.out.println("\n");
		
		//Travel 100 meters north
		knight.useMount(100, EnumDirection.NORTH);
		
		System.out.println("\n");
		
		//Use his weapon
		knight.useWeapon();
	}

}
