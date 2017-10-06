//2016년 요일 맞추기

package com.lv2;

public class GuessDay {
	public String getDayName(int a, int b) {
		String answer = "";
		int sum = b;
		int[] day_num = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] Day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		for(int i = 1; i<a; i++) {
			sum += day_num[i-1];
		}
		answer = Day[sum%7-1];
		return answer;
	}
	public static void main(String[] args) {
		GuessDay test = new GuessDay();
		int a = 5, b = 24;
		System.out.println(test.getDayName(a, b));
	}
}
