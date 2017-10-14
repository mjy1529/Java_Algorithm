//땅따먹기 게임
package com.lv4;

public class Hopscotch {
	int hopscotch(int[][] board, int size) {
		int result = 0, exc = 0, final_exc = -1;
		for(int i=0; i<size; i++) {
			int max = 0; //행이 바뀔 때마다 최대값 초기화
			for(int j=0; j<4; j++) {
				if(j == final_exc) continue;
				if(board[i][j] > max) {
					max = board[i][j];
					exc = j;
				}
			}
			final_exc = exc;
			exc = 0; //행이 바뀌기 전 계산을 제외시킬 열 초기화
			System.out.println(final_exc);
			result += max;
		}
		return result;
	}
	public static void main(String[] args) {
		Hopscotch c = new Hopscotch();
		int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
		//int[][] test = {{8, 4, 1, 9}, {2, 7, 9, 7}, {1, 3, 9, 3}, {1, 8, 3, 3}, {2, 7, 9, 7}, {10, 5, 4, 9}, 
				//{8, 6, 7, 4}, {9, 3, 4, 8}, {3, 7, 6, 7}, {2, 8, 10, 10}};
		System.out.println(c.hopscotch(test, 3));
	}
}
