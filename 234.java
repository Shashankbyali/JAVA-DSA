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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list1.add(temp.val);
            temp = temp.next;
        }
        ArrayList<Integer> list2 = new ArrayList<>(list1);
        Collections.reverse(list2);
        if(list1.equals(list2)){
            return true;
        }
        return false;
    }
}
