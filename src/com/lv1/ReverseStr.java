package com.lv1;

import java.util.*;

//문자열 내림차순으로 배치하기

public class ReverseStr {
	public String reverseStr(String str) {
		String array[] = str.split("");
		Arrays.sort(array);
		List<String> list = Arrays.asList(array);
		Collections.reverse(list);
		array = list.toArray(new String[list.size()]);
		String result = "";
		for(int i=0; i<array.length; i++) {
			result += array[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println(rs.reverseStr("Zbcdefg"));
	}

}
