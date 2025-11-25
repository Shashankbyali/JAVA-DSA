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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp;
        temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        if(head==null){
            return null;
        }
        int mid = (count/2);
        for(int i=1;i<=mid;i++){
            head = head.next;
        }
        return head;
    }
}
