package com.korea;

import java.util.Arrays;

public class Divisible {
	public int[] divisible(int[] array, int divisor) {
		int num = 0;
		int[] tmp = new int[array.length];
		for(int i=0; i<array.length; i++) {
			if(array[i] % divisor == 0) {
				tmp[num] = array[i];
				num++;
			}
		}
		int[] ret = new int[num];
		for(int j=0; j<ret.length; j++) {
			ret[j] = tmp[j];
		}
		return ret;
	}
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5,9,7,10};
		System.out.println(Arrays.toString(div.divisible(array, 5)));
	}
}
