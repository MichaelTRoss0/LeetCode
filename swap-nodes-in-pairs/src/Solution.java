class Solution {
    public ListNode swapPairs(ListNode head) {
    	if (head == null) return null;
    	if (head.next == null) return head;
    	
    	ListNode ln = new ListNode();
    	ln.next = new ListNode();
    	
    	ln.val = head.next.val;
    	ln.next.val = head.val;
    	ln.next.next = swapPairs(head.next.next);
    	
    	return ln;
    }
}