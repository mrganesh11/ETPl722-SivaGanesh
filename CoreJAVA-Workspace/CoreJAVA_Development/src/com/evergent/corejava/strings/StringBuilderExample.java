package com.evergent.corejava.strings;
/*
 * append():adds a string to the end of the current string.
 * insert():adds a string at a specific position in the current string.
 * replace():replaces a substring with a new string.
 * delete():removes a substring from the current string.
 * reverse():reverse the order of characters in the current string.
 * */
public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println("Initial String : "+sb);
		sb.append(" world!");
		System.out.println("After append : "+sb);
		sb.insert(6,"Beautiful");
		System.out.println("After insert : "+sb);
		sb.replace(0, 5, "Hi");
		System.out.println("After replace : "+sb);
		sb.delete(0, 3);
		System.out.println("After delete : "+sb);
		sb.reverse();
		System.out.println("After reverse : "+sb);
	}

}
