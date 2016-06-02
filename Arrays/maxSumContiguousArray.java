/*

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.

**Interview Question found on www.interviewbit.com. Provided is the correct function for the solution.

 */ 


public class Solution {
	public int maxSubArray(final List<Integer> a) {
	    int returnMax = a.get(0); 
	    List<Integer> sum = new ArrayList<Integer>(); 
	    
	    sum.add(0, returnMax); 
	    
	    for(int x = 1; x<a.size(); x++){
	        sum.add(x, Math.max(a.get(x),sum.get(x-1)+a.get(x))); 
	        returnMax = Math.max(returnMax,sum.get(x));
	    }
	    
	    
	    
	    return returnMax;
	}
}
