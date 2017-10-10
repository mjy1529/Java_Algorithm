//다음 큰 숫자

package com.lv3;

public class NextBigNumber {
	public int nextBigNumber(int n) {
		//내가 작성한 코드
		int cnt=0, cnt2=0;
		String str = Integer.toBinaryString(n);
		String arr[] = str.split("");
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("1")) cnt++;
		}
		while(true) {
			n++;
			String str2 = Integer.toBinaryString(n);
			String arr2[] = str2.split("");
			for(int i=0; i<arr2.length; i++) {
				if(arr2[i].equals("1")) cnt2++;
			}
			if(cnt == cnt2) break;
			else cnt2=0;
		}
        return n;

        //다른 사람이 작성한 코드
        /*
		int a = Integer.bitCount(n);
        int nextnum = n+1;
        
        while(true) {
        	if(Integer.bitCount(nextnum) == a) break;
        	nextnum++;
        }
        return nextnum;
        */
	}
	public static void main(String[] args) {
		NextBigNumber test = new NextBigNumber();
		System.out.println(test.nextBigNumber(78));
	}
}
