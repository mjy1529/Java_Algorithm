package com.lv1;

import java.util.Arrays;

public class GetMinMaxString {
	public String getMinMaxString(String str) {
		String[] arr = str.split("\\s");
		int[] int_arr = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			int_arr[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(int_arr);
		return int_arr[int_arr.length-1]+" "+int_arr[0];
	}
	
	public static void main(String[] args) {
		String str = "1 2 3 4";
		GetMinMaxString minMax = new GetMinMaxString();
		System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));		
	}
}
