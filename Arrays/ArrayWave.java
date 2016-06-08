/*Given an array of integers, sort the array into a wave like array and return it, 
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....

Example

Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2] */ 


public class Solution {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    
	    // There is a pattern of crossing values which creates the wave.
	    
	    // First sort the arraylist 
	    Collections.sort(a);
	    //Swap first and second values of each "pair"
	    for(int x = 0; x<a.size()-1; x++){
	        result.add(a.get(x+1));
	        result.add(a.get(x));
	        x++;
	    }
	    // Odd list size case, add the last value due to for loop being cut short by -1
	    if(a.size()%2 != 0){
	        result.add(a.get(a.size()-1)); 
	    }
	    
	    
	 
	 return result;
	    
	}
}
