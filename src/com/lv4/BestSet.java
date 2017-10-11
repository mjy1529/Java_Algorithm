//최고의 집합
package com.lv4;

public class BestSet {
	public int[] bestSet(int n, int s) {
		int[] answer = new int[n];
		int rest = s;
		for(int i=0; i<answer.length; i++) {
			answer[i] = rest/n;
			rest -= answer[i];
			n--;
		}
		return answer;
	}
	public static void main(String[] args) {
		BestSet c = new BestSet();
		System.out.println(c.bestSet(3, 13));
	}
}
