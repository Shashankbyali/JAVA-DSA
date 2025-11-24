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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode prev = head;
        if(head==null){
            return head;
        }
        while(temp.next!=null){
            if(head.val==head.next.val){
                temp = temp.next;
                prev.next = temp;
                head = temp;
            }else if(temp.val==temp.next.val){
                temp = temp.next;
                prev.next = temp;
            }else{
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}
