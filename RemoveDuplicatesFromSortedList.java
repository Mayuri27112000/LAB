class ListNode 
{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RemoveDuplicatesFromSortedList
{
	public static void main(String[] args) 
	{
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next.next = new ListNode(6);

        head = removeDuplicates(head);

        // Print the updated list
        ListNode current = head;
        while (current != null) 
        {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static ListNode removeDuplicates(ListNode head) 
    {
        if (head == null) 
        {
            return null;
        }

        ListNode current = head;
        while (current != null && current.next != null) 
        {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

}
