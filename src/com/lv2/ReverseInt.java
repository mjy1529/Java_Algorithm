package com.lv2;

import java.util.*;

//정수 내림차순으로 배치하기

public class ReverseInt {
	public int reverseInt(int n) {
		String str = Integer.toString(n);
		String arr[] = str.split("");
		Arrays.sort(arr);
		List<String> list = Arrays.asList(arr);
		Collections.reverse(list);
		arr = list.toArray(new String[list.size()]);
		String res = "";
		for(int i=0; i<arr.length; i++) {
			res += arr[i];
		}
		return Integer.parseInt(res);
	}
	
	public static void main(String[] args) {
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}
