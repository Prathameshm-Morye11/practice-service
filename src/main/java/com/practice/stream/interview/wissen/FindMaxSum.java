package com.practice.stream.interview.wissen;

public class FindMaxSum {

	// Maximum Sum of Non-Adjacent Elements

	// Input1={1,2,4};
	// Output1=5;
	// Input={2,1,1,2};
	// Output2=4;
	public static void main(String[] args) {
		int[] arr = { 2, 1, 1, 2 };
		System.out.println(maxSum(arr));

	}

	private static int maxSum(int[] arr) {
		// TODO Auto-generated method stub
		if (arr.length == 0)
			return 0;

		int incl = Math.max(0, arr[0]);
		int excl = 0;

		for (int i = 1; i < arr.length; i++) {
			int newIncl = excl + arr[i];
			int newExcl = Math.max(incl, excl);

			incl = newIncl;
			excl = newExcl;

		}

		return Math.max(incl, excl);
	}
}
