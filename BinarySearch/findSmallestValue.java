/*Suppose a sorted array A is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

The array will not contain duplicates.


Question found at www.interviewbit.com */



public class Solution {
	// DO NOT MODIFY THE LIST
	public int findMin(final List<Integer> a) {
	    int low = 0, high = a.size() - 1; 
	    while(low<=high){
	    if(a.get(low) <= a.get(high)){
	        return a.get(low);
	    }
	    int mid = (low+high)/2; 
	    int next = (mid+1)%a.size(), prev = (mid-1)%a.size();
	    if(a.get(mid) <= a.get(next) && a.get(mid) <= a.get(prev)){
	        return a.get(mid);
	    }
	    else if(a.get(mid) <= a.get(high)){
	        high = mid-1;
	    }
	    else if(a.get(mid) >= a.get(low)){
	        low = mid+1;
	    }
	    
	    }
	    
	 return -1;   
	}
}
