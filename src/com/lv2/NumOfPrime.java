package com.lv2;

public class NumOfPrime {
	int numberOfPrime(int n) {
		int result = 0;
		int cnt = 0;
		for(int i=2; i<=n; i++) {
			for(int j=2; j<=i; j++) {
				if(i%j == 0) {
					cnt++;
				}
			}
			if(cnt == 1) {
				result++;
			}
			cnt = 0;
		}
		return result;
	}
	
	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println(prime.numberOfPrime(10));
	}
}
