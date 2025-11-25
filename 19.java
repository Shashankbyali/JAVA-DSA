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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp;
        temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        if(count==1 && n==1){
            return null;
        }
        if(count==1){
            head.next = null;
            return head;
        }
        count = count - n;
        if(count==0){
            head = head.next;
            return head;
        }
        for(int i=1;i<count;i++){
            temp = temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
