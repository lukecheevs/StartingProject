package com.MarygraceProject.tony;

public class Tony {
	private String pet;
	private String game;

	private static String[] friends = { "Luke", "Prin", "Ryan", "Andy" };

	public Tony(String pet) {
		this.pet = pet;
	}

	public static void hello() {
		System.out.println("Hello There");
	}

	public String getPet() {
		return pet;
	}

	public void setPet(String pet) {
		this.pet = pet;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public static void printFriends() {
		for (String name : friends) {
			System.out.println("My name is: " + name);
		}
	}
}
