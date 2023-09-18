package com.practice;

public class Symbol {

	public void meth(char ch) {
		if(ch>='a' && ch<='z')
			System.out.println("symbol is Alphabet");
		else
			System.out.println("symbol is NotAlphabet");
	}
	
	public static void main(String[] args) {

		Symbol s = new Symbol();
		s.meth('*');
	}

}
