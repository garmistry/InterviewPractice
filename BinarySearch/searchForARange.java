/* 

Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm’s runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example:

Given [5, 7, 7, 8, 8, 10]

and target value 8,

return [3, 4]. 

*/



public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
	    ArrayList<Integer> result = new ArrayList<Integer>(); 
	    result.add(0,-1);
	    result.add(1, -1);
	    int low = 0, high = a.size()-1;
	    
	    while(low<high){
	        int mid = (low+high)/2; 
	        if(a.get(mid) == b){
	           high = mid; 
	        }
	        else if(a.get(mid) < b){
	            low = mid+1;
	        }
	        else{
	            high = mid; 
	        }
	    }
	    int start;
	    if(a.get(low) != b){
	        return result;
	    }
	    else{
	        start = low;
	    }
	    
	    low = 0; high = a.size() -1; 
	    while(low<high){
	        int mid = (low+high)/2;
	        if(a.get(mid)< b+1){
	            low = mid+1;
	        }
	        else{
	            high = mid;
	        }
	    }
	    
	    if(a.get(low) == b){
	        high = low; 
	    }
	    else{
	        high = low - 1; 
	    }
	    result.set(0, start);
	    result.set(1, high);
	    return result;
	    
	}
}
