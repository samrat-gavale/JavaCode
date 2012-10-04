package Bits;

import java.util.Queue;

public class TestBits {

	public static void main(String[] args){
		System.out.print("Answer - "+updateBits(100000,101,1,3)+"\n");
	}
	public static int updateBits(int n, int m, int i, int j) {
		int max = ~0; /* All 1’s */
		// 1’s through position j, then 0’s	
		int left = max - ((1 << j) - 1);
		System.out.print("Left - "+left+"\n");
		// 1’s after position i
		int right = ((1 << i) - 1);
		System.out.print("Right - "+right+"\n");
		// 1’s, with 0s between i and j
		int mask = left | right;
		System.out.print("Mask - "+mask+"\n");
		// Clear i through j, then put m in there
		return (n & mask) | (m << i);
		} 
}
