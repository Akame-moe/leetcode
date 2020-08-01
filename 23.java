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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        while(lists.length > 1){
            ListNode[] remaining = new ListNode[(lists.length+1)/2];
            int j = 0;
            for(int i=0;i<lists.length;i+=2){
                remaining[j++] = merge2(lists[i],(i+1) < lists.length ? lists[i+1] : null);
            }
            lists = remaining;
        }
        return lists[0];
        
    }
    
    public ListNode merge2(ListNode a,ListNode b){
        ListNode node = new ListNode();
        ListNode head = node;
        while(a != null && b != null){
            if(a.val < b.val){
                node.next = a;
                a = a.next;
            }else{
                node.next = b;
                b = b.next;
            }
            node = node.next;
        }
        //link the remaining
        node.next = (a == null) ? b : a;
        
        return head.next;
    }
}