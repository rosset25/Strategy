package juegoRol;

public enum EnumWeapons implements IWeapon{
	
	SWORD(50, "Sword"),
	BOW(35, "Bow"),
	DISARMED(5, "Disarmed");
	
	private int damage;
	private String type;

	private EnumWeapons(int damage, String type) {
		this.damage = damage;
		this.type = type;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public int pointsDamage() {
		return damage;
	}
}
