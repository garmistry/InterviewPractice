/*Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example:

Given the following matrix:

[
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
]
You should return

[1, 2, 3, 6, 9, 8, 7, 4, 5]


Source: Interviewbit.com */

public class Solution {
	// List is given, do not change list.
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
	    int top = 0, bottom = a.size()-1, left = 0, right = a.get(0).size() - 1;
	    int direction = 0; 
	    
	   while(top<=bottom && left <= right){
	       if(direction == 0){ // Top going left to Right
	           for(int x = left; x<=right; x++){
	               result.add(a.get(top).get(x)); 
	           }
	           top++; 
	           direction = 1; 
	       }
	       else if(direction==1){ // Top To bottom from top right
	           for(int x = top; x<=bottom; x++){
	               result.add(a.get(x).get(right)); 
	           }
	           right--; 
	           direction = 2; 
	       }
	       else if(direction==2){ // Right to left from bottom right
	           for(int x = right; x>=left; x--){
	               result.add(a.get(bottom).get(x)); 
	           }
	           bottom--;
	           direction = 3; 
	       }
	       else if(direction==3){ //Bottom to top from bottom left
	           for(int x = bottom; x>=top; x--){
	               result.add(a.get(x).get(left)); 
	           }
	           left++; 
	           direction = 0;
	       }
	   }
		 return result;
	}
}