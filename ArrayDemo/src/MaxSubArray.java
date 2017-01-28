

import java.io.*;
//Java program to print largest contiguous array sum
import java.util.*;

class MaxSubArray
{
	public static void main (String[] args)
	{
		int [] a = {-2,5,-1,4,-3};
		System.out.println("Maximum contiguous sum is " +
									maxSubArraySum(a));
	}

	static int maxSubArraySum(int a[])
	{
		int size = a.length;
		int max_so_far = 0, max_ending_here = 0;

		for (int i = 0; i < size; i++)
		{
			max_ending_here = max_ending_here + a[i];
			if (max_ending_here < 0)
				max_ending_here = 0;
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
		}
		return max_so_far;
	}
}