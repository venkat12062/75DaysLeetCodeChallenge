/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        ListNode cur1=h1;
        ListNode cur2=h2;
        int l1=0;
        int l2=0;
        while(cur1!=null){
            l1++;
            cur1=cur1.next;
        }
         while(cur2!=null){
            l2++;
            cur2=cur2.next;
        }
        int diff=Math.abs(l1-l2);
        while(diff>0){
            if(l2>l1){
         h2=h2.next;}
         else{
            h1=h1.next;
         }
         diff--;
        }
        while(h1!=null&&h2!=null){
            if(h1==h2){
                break;
            }h1=h1.next;
                h2=h2.next;
        }
        return h1;
    }
}