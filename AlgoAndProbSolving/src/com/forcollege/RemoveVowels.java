package com.forcollege;

public class RemoveVowels {

	public static void main(String[] args) {
		String string = "My name is Vilas Varghese";
		System.out.println("Input String : "+string);
		string = string.replaceAll("[AaEeIiOoUu]", "");
		System.out.println(string);
	}
}
