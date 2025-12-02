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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ntemp=null;
        ListNode newhead;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }

        if(list1.val>list2.val){
            newhead = list2;
            ntemp = newhead;
            temp2 = temp2.next;
        }else{
            newhead = list1;
            ntemp = newhead;
            temp1 = temp1.next;
        }

        while(temp1!=null && temp2!=null){
            if(temp1.val>temp2.val){
                ntemp.next = temp2;
                ntemp = ntemp.next;
                temp2 = temp2.next;
            }else{
                ntemp.next = temp1;
                ntemp = ntemp.next;
                temp1 = temp1.next;
            }
        }

        if(temp1!=null){
            ntemp.next = temp1;
        }
        if(temp2!=null){
            ntemp.next = temp2;
        }
    return newhead;
    }
}
