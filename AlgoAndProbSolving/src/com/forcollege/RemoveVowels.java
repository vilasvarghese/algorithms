package com.forcollege;

public class RemoveVowels {

	public static void main(String[] args) {
		String string = "Welcome to Candid Java Programming";
		System.out.println("Input String : "+string);
		string = string.replaceAll("[AaEeIiOoUu]", "");
		System.out.println(string);
	}
}
