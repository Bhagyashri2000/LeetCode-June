/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode( ListNode node) 
    {
        ListNode ptr=node.next;
        ListNode prev=node;
        while(ptr!=null)
        {
            prev.val=ptr.val;       //copy the value of next node to previous node
            if(ptr.next==null)      //if last node of linked list
            {
                prev.next=null;
            }
            prev=ptr;
            ptr=ptr.next;
        }
        
       
    }
}
