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
public class S06 {
    public int[] reversePrint(ListNode head) {
            Stack<ListNode> stack = new Stack<ListNode>();
            ListNode p = head;
            while(p!=null){
                stack.push(p);
                p=p.next;
            }
            int size =stack.size();
            int[] ans = new int[stack.size()];
            for(int i=0;i<size;i++){
                ans[i]=stack.pop().val;
            }
            return ans;
    }
}
