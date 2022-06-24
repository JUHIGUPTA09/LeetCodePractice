package com.dsabusted.Array.Intialization;

import java.util.HashMap;
import java.util.Map;

public class SingleNumOptimalSol {

	public static void main(String[] args) {
		int[] nums= {2,2,3,2};
		int one=0;
		int twice=0;
		for(int num:nums)
		{
			one=(one^num)& ~twice;
			twice=(twice^num) & ~one;
		}
	    System.out.println(one);
	}

}
        