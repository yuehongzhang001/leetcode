/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1290 {
    public int getDecimalValue(ListNode head) {
        int ans=0;
        while(head!=null){
            ans*=2;
            ans+=head.val;
            head=head.next;
        }
        return ans;
    }
}
