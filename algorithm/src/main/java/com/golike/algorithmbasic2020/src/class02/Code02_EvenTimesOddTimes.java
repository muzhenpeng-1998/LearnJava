package com.golike.algorithmbasic2020.src.class02;

public class Code02_EvenTimesOddTimes {

	// arr中，只有一种数，出现奇数次
	public static void printOddTimesNum1(int[] arr) {
		int eor = 0;
		for (int i = 0; i < arr.length; i++) {
			eor ^= arr[i];
		}
		System.out.println(eor);
	}

	/**
	 * 假设 arr = [6,6,6,10,4,4,12,12]
	 * 思路：
	 * 1。把奇数^出来
	 * 2。找出最右侧为1的数据
	 * 3。
	 * @param arr
	 */
	// arr中，有两种数，出现奇数次
	public static void printOddTimesNum2(int[] arr) {
		int eor = 0;
		for (int i = 0; i < arr.length; i++) {
			eor ^= arr[i];
		}
		// a 和 b是两种数
		// eor != 0
		// eor = 6 ^ 10
		// eor最右侧的1，提取出来
		// eor :     00110010110111000
		// rightOne :00000000000001000
		int rightOne = eor & (-eor); // 因为最后剩下6^ 10 肯定是有数据的 且不一样的
		// 提取出最右的1，
		
		
		int onlyOne = 0; // eor'
		for (int i = 0 ; i < arr.length;i++) {
			//  arr[1] =  111100011110000
			// rightOne=  000000000010000
			if ((arr[i] & rightOne) != 0) {
				onlyOne ^= arr[i];
			}
		}
		// onlyOne 第一个奇数
		// 与eor 与或运算就能算出第二个
		System.out.println(onlyOne + " " + (eor ^ onlyOne));
	}

	
	public static int bit1counts(int N) {
		int count = 0;
		
		//   011011010000
		//   000000010000     1
		
		//   011011000000
		// 
		
		
		
		while(N != 0) {
			int rightOne = N & ((~N) + 1);
			count++;
			N ^= rightOne;
			// N -= rightOne
		}
		
		
		return count;
		
	}
	
	
	public static void main(String[] args) {
		int a = 5;
		int b = 7;

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println(a);
		System.out.println(b);

		int[] arr1 = { 3, 3, 2, 3, 1, 1, 1, 3, 1, 1, 1 };
		printOddTimesNum1(arr1);

		int[] arr2 = { 4, 3, 4, 2, 2, 2, 4, 1, 1, 1, 3, 3, 1, 1, 1, 4, 2, 2 };
		printOddTimesNum2(arr2);

	}

}
