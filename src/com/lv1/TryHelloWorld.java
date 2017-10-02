package com.lv1;

import java.util.Arrays;

public class TryHelloWorld {
	public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];
		int min = 0;
		if(a>b || a==b) {
			min = b;
		}else { 	//(a<b)
			min = a;
		}
		for(int i=1; i<=min; i++) {
			if(a%i == 0 && b%i == 0) {
				answer[0] = i;
				answer[1] = i*(a/i)*(b/i);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		TryHelloWorld c = new TryHelloWorld();
		System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
	}
}
