package com.lv1;

public class FindKim {
	public String findKim(String[] seoul) {
		int x = 0;
		for(x=0; x<seoul.length; x++) {
			if(seoul[x].charAt(0) == 'K') {
				break;
			}
		}
		return "김서방은 "+ x +"에 있다";
	}
	public static void main(String[] args) {
		FindKim kim = new FindKim();
		String[] names = {"Queen", "Tod", "Kim"};
		System.out.println(kim.findKim(names));
	}

}
