class Solution {
    
    public ListNode middlenodehelper(ListNode head) {
     if(head == null || head.next == null){return head;}
     ListNode slow = head;
     ListNode fast = head;

      while(fast.next != null && fast.next.next != null){
          slow = slow.next;
          fast = fast.next.next;
      }
      return slow;
    }

    public ListNode middlenode(ListNode head){
        return middlenodehelper(head);
    }

    //---- leetcode - 206

    public ListNode reverselist(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        } 
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){return;}
         ListNode mid = middlenode(head);
         ListNode c2 = mid.next;
        mid.next = null;
         c2 = reverselist(c2);
         ListNode c1 = head;
         
          while(c1 != null && c2 != null){
              ListNode f1 = c1.next;
              ListNode f2 = c2.next;

              c1.next = c2;
              c2.next = f1;
               c1 = f1;
               c2 = f2;
          }
    }
}
