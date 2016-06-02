/*Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.

 NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
For example, for this problem, following are some good questions to ask :
Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
A : For the purpose of this question, YES
Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit. 

Question Taken from www.interviewbit.com
*/





public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    ArrayList<Integer> result = new ArrayList<Integer>(); 
	    int listLength = a.size();
	    boolean carryOver = false;
	    int MSB = -1;
	    
	    for(int x = 0; x<a.size(); x++){
	        if(a.get(x) != 0 && MSB == -1){
	            MSB = x; 
	        }
	    }
	    
	    
        // get first Value 
	    int firstValue = a.get(listLength-1); 
	    
	    
	    // See if first value is > 9 
	    if(firstValue + 1 > 9){
	        carryOver = true; 
	        result.add(0,0);
	        
	    }
	    else{ // No carry over needed
	        result.add(0, firstValue+1);   
	    }
	    
	  if(a.size()<2) {
	      if(carryOver){
	         result.add(0,1);
	      }
	  }
	    // for all numbers after the singles digit if length > 2
	  else{
	    for(int x = listLength-2; x>=MSB; x--){
	        // get currentValue
	        int currentValue = a.get(x); 
	        //check if there was a carryOver
	        if(carryOver){
	            // See if you have to carry over again
	            if(currentValue + 1 > 9 && currentValue != 0){
            	        carryOver = true; 
            	        result.add(0,0);
            	  // if your largest value has a carry Over, append a 1 to the front to the MSB
            	    if(x == MSB){
            	        result.add(0,1);
            	    }     
        	    }
        	    // No carry over needed again. Turn off and add value
        	    else{
        	        result.add(0,currentValue+1); 
        	        carryOver = false;
        	    }
	        }
	        // prepend rest of value
	        else{
	           result.add(0,currentValue);
	        }
	        
	        }
	    }
	   return result;
	}
}
