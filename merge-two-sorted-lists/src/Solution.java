class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode ln = new ListNode(0);
    	
    	ListNode curr1 = l1;
    	ListNode curr2 = l2;
    	ListNode currMerge = ln;
    	while (curr1 != null || curr2 != null) {
    		if (curr1 != null && (curr2 == null || curr2.val > curr1.val)) {
    			currMerge.next = new ListNode(curr1.val);
    			curr1 = curr1.next;
    		} else if (curr2 != null && (curr1 == null || curr1.val >= curr2.val)) {
    			currMerge.next = new ListNode(curr2.val);
    			curr2 = curr2.next;
    		}
    		currMerge = currMerge.next;
    	}
		
    	return ln.next;
    }
}