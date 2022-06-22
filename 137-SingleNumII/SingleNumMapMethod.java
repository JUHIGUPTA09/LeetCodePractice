package com.dsabusted.Array.Intialization;

import java.util.HashMap;
import java.util.Map;

public class SingleNumMapMethod {

	public static void main(String[] args) {
		int[] nums= {2,2,3,2};
		  Map<Integer,Integer> map=new HashMap<>();
	        int ans=0;
	      for(int i=0;i<nums.length;i++)
	      {
	          if(map.containsKey(nums[i]))
	          {
	              map.put(nums[i],map.get(nums[i])+1);
	          }
	          else
	          {
	               map.put(nums[i],1);
	          }
	      }
	      for(Map.Entry<Integer,Integer> e:map.entrySet())
	      {
	          if(e.getValue()==1)
	          {
	              ans=e.getKey();
	              break;
	          }
	      }
	        System.out.println(ans);
	}

}
        