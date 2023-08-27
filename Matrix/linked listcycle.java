
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) {
                while(head!=slow){
                    head=head.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
