class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {        
        int sz = findSize(head);
        int x = sz - n;
        
        if (sz == 1) return null;
    	
    	return checkNode(head, 0, x);
    }
    
    private int findSize(ListNode node) {
    	int sz = 0;
    	
    	ListNode curr = node;
    	while (curr != null) {
    		curr = curr.next;
    		sz++;
    	}
    	
		return sz;
	}

	private ListNode checkNode(ListNode tail, int i, int x) {
		ListNode curr = tail;
        
    	if (i == x)
            curr = tail.next;
    	else 
    		curr.next = checkNode(tail.next, i+1, x);
    	    	
    	return curr;
    }
}