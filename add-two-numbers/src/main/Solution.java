package main;

/**
 * @author miket
 *
 */
public class Solution {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(9);
		
		ListNode node9 = new ListNode(9);
		ListNode node8 = new ListNode(9, node9);
		ListNode node7 = new ListNode(9, node8);
		ListNode node6 = new ListNode(9, node7);
		ListNode node5 = new ListNode(9, node6);
		ListNode node4 = new ListNode(9, node5);
		ListNode node3 = new ListNode(9, node4);
		ListNode node2 = new ListNode(9, node3);
		ListNode node1 = new ListNode(9, node2);
		ListNode l2 = new ListNode(1, node1);
		
		int[] a1 = convertToArray(l1);
		printArray(a1);
		
		System.out.println();
		
		int[] a2 = convertToArray(l2);
		printArray(a2);
		
		System.out.println();
		
		ListNode sum = addTwoArrays(a1, a2);
		int[] sumA = convertToArray(sum);
		printArray(sumA);
	}
	
	private static void printArray(int[] array) {
		System.out.print("[");
		
		for (int i = 0; i < array.length; i ++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.print("]\n");
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// This will hold the sum of the two linked lists
		ListNode answer = new ListNode();
		
		// Put the values from the ListNodes into an array
		int[] a1 = convertToArray(l1);
		int[] a2 = convertToArray(l2);
		
		// Add the arrays together
		answer = addTwoArrays(a1, a2);
		
		return answer;
	}

	private static ListNode addTwoArrays(int[] a1, int[] a2) {
		ListNode ln = new ListNode(0);
		
		// Make the first array longer if necessary
		while (a1.length < a2.length) {
			a1 = increaseLengthByOne(a1);
		}
		
		// Make the second array longer if necessary
		while (a1.length > a2.length) {
			a2 = increaseLengthByOne(a2);
		}
		
		// Add the two arrays together with elementary-style addition
		int carry = 0;
		int sum = 0;
		ListNode current = ln;
		for (int i = 0; i < a1.length; i++) {
			sum = a1[i] + a2[i] + carry;
			
			carry = sum / 10;
			sum = sum % 10;
			
			current.next = new ListNode(sum);
			current = current.next;
		}
		if (carry > 0) {
			current.next = new ListNode(carry);
		}
		
		return ln.next;
	}

	private static int[] convertToArray(ListNode node) {
		int[] array = new int[1];
		
		int i = 0;
		ListNode current = node;
		
		while (true) {
			array[i] = current.val;
			
			if (current.next != null) {
				array = increaseLengthByOne(array);
				current = current.next;
				i++;
			} else break;
		}
		
		return array;
	}

	private static int[] increaseLengthByOne(int[] array) {
		int length = array.length;
		int[] newArray = new int[length + 1];
		
		for (int i = 0; i < length; i++) {
			newArray[i] = array[i];
		}
		newArray[length] = 0;
		
		return newArray;
	}
}
