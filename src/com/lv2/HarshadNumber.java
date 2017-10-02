package com.lv2;

//하샤드 수

public class HarshadNumber {
	public boolean isHarshad(int num) {
		String ori_str = Integer.toString(num);
		String[] new_str = ori_str.split("");
		int[] int_str = new int[new_str.length];
		int sum = 0;
		for(int i=0; i<new_str.length; i++) {
			int_str[i] = Integer.parseInt(new_str[i]);
			sum += int_str[i];
		}
		if(num % sum == 0) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(12));
	}
}
