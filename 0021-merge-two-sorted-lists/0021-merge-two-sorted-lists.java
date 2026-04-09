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
        ListNode res=new ListNode(0);
        ListNode r=res;
      ListNode c1=list1;
      ListNode c2=list2;
    while(c1!=null&&c2!=null){
        if(c1.val<=c2.val){
            res.next=c1;
            c1=c1.next;
            res=res.next;
        }else if(c2.val<=c1.val){
            res.next=c2;
            c2=c2.next;
            res=res.next;
        }
    }
    while(c1!=null){
        res.next=c1;
            c1=c1.next;
            res=res.next;
    }
    while(c2!=null){
        res.next=c2;
            c2=c2.next;
            res=res.next;
    }

     
    return r.next;
    }
}