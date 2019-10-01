package juegoRol;


public enum EnumCharacters {
	SOLDIER("Soldier"),
	KNIGHT("Knight"), 
	WIZARD("Wizard");
	
	private String description;
	
	private EnumCharacters(String description){
		this.description = description;
	}
	public String getDescription() {
		return description;
	}

	public static EnumCharacters getOption(int position) {
	    return values()[position];
	}

	public static String getMenu() {
	    StringBuilder sb = new StringBuilder();
	    for(EnumCharacters option: EnumCharacters.values()) {
	        sb.append(option.ordinal());
	        sb.append(".- ");
	        sb.append(option.getDescription());
	        sb.append("\n");
	    }
	    return sb.toString();
	}
}
