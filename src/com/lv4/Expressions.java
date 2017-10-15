//숫자의 표현
package com.lv4;

public class Expressions {
	public int expressions(int num) {
		int answer = 0;
		
		int res = 0;
		for(int j = 1; j<=num; j++) {
			for(int i=j; i<=num; i++) {
				res += i;
				if(res == num) {
					answer++;
					break;
				}
			}
			res = 0;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Expressions expressions = new Expressions();
		System.out.println(expressions.expressions(3));
	}
}
