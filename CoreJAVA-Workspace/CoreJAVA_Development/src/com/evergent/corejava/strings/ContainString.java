package com.evergent.corejava.strings;

public class ContainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="The quick brown fox jumps over the lazy dog.";
		String sub="fox";
		boolean contains=str.contains(sub);
		System.out.println("Contains "+sub+" : "+contains);
	}

}
