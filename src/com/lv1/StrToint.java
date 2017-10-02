package com.lv1;

public class StrToint {
	public int getStrToint(String str) {
		return Integer.parseInt(str);
	}
	
	public static void main(String[] args) {
		StrToint strToint = new StrToint();
		System.out.println(strToint.getStrToint("-1234"));
	}
}
