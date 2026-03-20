class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        int n = 1;
        while(temp.next != null){
            temp = temp.next;
            n++;
        }

        temp.next = head;

        k = k % n;
        if(k == 0){
            temp.next = null;
            return head;
        }

        int steps = n - k;
        ListNode newTail = head;
        for(int i = 1; i < steps; i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}