/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) 
    {
        ListNode h1=head;
        if(head==null) return null;
        ListNode h2=head.next;
        ListNode h3=h2;
        while(h2!=null && h2.next!=null)
        {
            h1.next=h2.next;
            h1=h1.next;
            h2.next=h1.next;
            h2=h2.next;
        }
        h1.next=h3;
return head;
    }
}