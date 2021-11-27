class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ln = new ListNode(0);
        
        int sz = findSize(head);
        int x = sz - n;
                
        ListNode curr = ln;
        curr.next = checkNode(head, 0, x);
        curr = curr.next;
    	
    	return ln.next;
    }
    
    private int findSize(ListNode node) {
    	int sz = 0;
    	
    	ListNode curr = node;
    	do {
    		curr = curr.next;
    		sz++;
    	} while (curr.next != null);
    	
		return sz;
	}

	private ListNode checkNode(ListNode ln, int i, int x) {
		ListNode curr = ln;
    	if (i == x) {
    		// TODO Add logic to check for null
    		curr.next = curr.next.next;
    	} else 
    		curr.next = checkNode(curr.next, i+1, x);
    	
    	curr = curr.next;
    	
    	return ln.next;
    }
}