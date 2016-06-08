/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode a, ListNode b) {
	    
	    ListNode head = new ListNode(0); 
	    ListNode list = head; 
	    
	    while(a != null || b != null){
	       if(a != null && b != null){    
    	        if(a.val < b.val){
        	        list.next = a;
        	        a = a.next;
        	    }
        	    else{
        	        list.next = b;
        	        b=b.next;
        	    }
        	    list = list.next;
    	     }
	        else if(a == null){
	            list.next = b;
	            break;
	        }
	        else if(b == null){
	            list.next = a;
	            break;
	        }
	    }
	    
	    
	 
	    return head.next;
	}
}
