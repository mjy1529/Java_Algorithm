package com.lv1;

public class PrintTriangle {
	public String printTriangle(int num) {
		String star = "";
		for(int i = 1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				star += '*';
			}
			star += "\n";
		}
		return star;
	}
	public static void main(String[] args) {
		PrintTriangle pt = new PrintTriangle();
		System.out.println(pt.printTriangle(3));
	}
}
