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
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode flag = head;
        int i=1;
        while(flag.next != null){
            flag = flag.next;
            i++;
        }
        flag = head;
        for(int j=0; j<i/2; j++){
            flag = flag.next;
        }
        head = flag;
        return head;
    }
}