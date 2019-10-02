package juegoRol;

import java.util.Scanner;

public class DynamicMain {
	
	public static void main(String[] args) {
		System.out.println("Choose a character:");
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		
		System.out.println(EnumCharacters.getMenu());
		int option = Integer.parseInt(sc.nextLine());
		Character character = menu.characterOptions(option);
		
		
		System.out.println("Choose a weapon:");
		System.out.println(EnumWeapons.getMenu());
		int option2 = Integer.parseInt(sc.nextLine());
		System.out.println("\n");

		IWeapon weapon = menu.weaponOptions(option2);
		character.selectWeapon(weapon);
		
		
		System.out.println("Choose a mount:");
		System.out.println(EnumMounts.getMenu());
		int option3 = Integer.parseInt(sc.nextLine());
		System.out.println("\n");

		IMount mount = menu.mountOptions(option3);
		character.selectMount(mount);
		
		character.info();
		System.out.println("\n");


		
		System.out.println("Where you want to travel?:");
		System.out.println(EnumDirection.getMenu());
		int option4 = Integer.parseInt(sc.nextLine());
		System.out.println("\n");

		EnumDirection dir = menu.directionOptions(option4);
		
		
		System.out.println("How many meters do you want to travel?");
		int meters = Integer.parseInt(sc.nextLine());
		System.out.println("\n");

		

		character.useMount(meters, dir);
		System.out.println("\n");

		character.useWeapon();
		
		sc.close();

		
		
	}

}
