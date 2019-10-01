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
	
	public static EnumWeapons getOption(int position) {
	    return values()[position];
	}

	public static String getMenu() {
	    StringBuilder sb = new StringBuilder();
	    for(EnumWeapons option: EnumWeapons.values()) {
	        sb.append(option.ordinal());
	        sb.append(".- ");
	        sb.append(option.getType());
	        sb.append("\n");
	    }
	    return sb.toString();
	}
}
