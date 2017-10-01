package com.korea;

public class StringExercise {
	String getMiddele(String word) {
		if(word.length() % 2 == 0) { //짝수
			int a = word.length() / 2;
			return word.substring(a-1, a+1);
		}
		else { //홀수
			int b = (word.length()-1) / 2;
			return word.substring(b, b+1);
		}
	}
	
	public static void main(String[] args) {
		StringExercise se = new StringExercise();
		System.out.println(se.getMiddele("power"));
		System.out.println(se.getMiddele("tree"));
	}

}
