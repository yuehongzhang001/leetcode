/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.*;
public class S22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        Stack<ListNode> stack = new Stack();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        ListNode ans = null;
        for(int i=1;i<=k;i++){
            ans = stack.pop();
        }
        return ans;
    }
    public ListNode getKthFromEnd1(ListNode head, int k){
        ListNode p2 = head;
        for(int i=0;i<k;i++){
            p2=p2.next;
        }
        ListNode p1 = head;
        while(p2!=null){
            p1=p1.next;
            p2=p2.next;
        }
            
        return p1;
    }
}
