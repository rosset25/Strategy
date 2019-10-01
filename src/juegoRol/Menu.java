package juegoRol;

import java.util.Scanner;

public class Menu {
	
	public Character characterOptions(int option) {

		EnumCharacters opMenu = EnumCharacters.getOption(option);
		
		switch (opMenu) {
		case SOLDIER:
			return newSoldier();
		case KNIGHT:
			return newKnight();
		case WIZARD:
			return newWizard();
		
		}
		return null;
	}
	
	public IWeapon weaponOptions(int option) {

		EnumWeapons opMenu = EnumWeapons.getOption(option);
		
		switch (opMenu) {
		case SWORD:
			return EnumWeapons.SWORD;
		case BOW:
			return EnumWeapons.BOW;
		case DISARMED:
			return EnumWeapons.DISARMED;
		
		}
		return null;
	}
	
	public EnumDirection directionOptions(int option) {

		EnumDirection opMenu = EnumDirection.getOption(option);
		
		switch (opMenu) {
		case NORTH:
			return EnumDirection.NORTH;
		case SOUTH:
			return EnumDirection.SOUTH;
		case WEST:
			return EnumDirection.WEST;
		case EST:
			return EnumDirection.EST;
		
		}
		return null;
	}
	
	public IMount mountOptions(int option) {

		EnumMounts opMenu = EnumMounts.getOption(option);
		
		switch (opMenu) {
		case HORSE:
			return EnumMounts.HORSE;
		case DRAGON:
			return EnumMounts.DRAGON;
		case NOMOUNT:
			return EnumMounts.NOMOUNT;
		
		}
		return null;
	}

	private Character newWizard() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the name of the wizard? : ");
		String name = scan.nextLine();
		return new Wizard(name);
		
	}

	private Character newKnight() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the name of the knight? : ");
		String name = scan.nextLine();
		return new Knight(name);
		
	}

	private Character newSoldier() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the name of the soldier? : ");
		String name = scan.nextLine();
		return new Soldier(name);
		
	}
}
