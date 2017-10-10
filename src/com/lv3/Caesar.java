//시저암호

package com.lv3;

public class Caesar {
	String caesar(String s, int n) {
		char[] arr = s.toCharArray();
		char[] new_arr = new char[arr.length];
		n = n%26;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= 'A' && arr[i] <= 'Z') {
				new_arr[i] = (char) (arr[i] + n);
				if(new_arr[i] > 90)
					new_arr[i] = (char) (new_arr[i] - 26);
			}else if(arr[i] >= 'a' && arr[i] <= 'z') {
				new_arr[i] = (char)(arr[i] + n);
				if(new_arr[i] > 122)
					new_arr[i] = (char) (new_arr[i] - 26);
			}else if(arr[i] == ' ') //띄어쓰기
				new_arr[i] = (char)(arr[i]);
		}
		String result = new String(new_arr);
		return result;
	}
	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
	}
}
