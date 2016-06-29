//Given a sorted linked list, delete all duplicates such that each element appear only once.
// Question found on Interviewbit.com

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
	    if(head == null || head.next == null){
	        return head;
	    }
	    
	    ListNode temp = head;
	    
	    while(temp != null && temp.next != null){
	        if(temp.val == temp.next.val){
	            temp.next = temp.next.next;
	        }
	        else{
	            temp = temp.next;
	        }
	    }
	    
	    return head;
	}
}
