package com.lv1;

public class WaterMelon {
	public String watermelon(int n) {
		String result = "";
		for(int i=1; i<=n; i++) {
			if(i%2 == 0) {
				result += "박";
			}else {
				result += "수";
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우 : " + wm.watermelon(5));
		System.out.println("n이 4인 경우 : " + wm.watermelon(6));
	}
}
