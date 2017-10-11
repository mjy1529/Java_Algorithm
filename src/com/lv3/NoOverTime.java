//야근지수
package com.lv3;

import java.util.Arrays;

public class NoOverTime {
	public int noOvertime(int no, int[] works) {
		int result = 0;
		while(no != 0) {
			Arrays.sort(works);
			works[works.length-1] -= 1;
			no--;
		}
		for(int i=0; i<works.length; i++) {
			result += Math.pow(works[i], 2);
		}
		return result;
	}
	
	public static void main(String[] args) {
		NoOverTime c = new NoOverTime();
		int[] test = {4,3,3};
		System.out.println(c.noOvertime(4, test));
	}
}
