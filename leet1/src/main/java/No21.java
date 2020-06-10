/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No21 {
     
     public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode merged = new ListNode();
        ListNode pointer = merged;
        while(!(l2==null&&l1==null)){
            if(l2==null){
                pointer.next=l1;
                l1=l1.next;
            }else if(l1==null){
                 pointer.next=l2;
                 l2=l2.next;
            }else{
                if(l1.val<l2.val){
                    pointer.next=l1;
                    l1=l1.next;
                }else{
                    pointer.next=l2;
                    l2=l2.next;
                }    
            }
            pointer=pointer.next;
        }
        return merged.next;
     }
     public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
         if(l1==null)
             return l2;
         else if(l2==null){
             return l1;
         }else{
             if(l1.val<l2.val){
                 l1.next = mergeTwoLists1(l1.next,l2);
                 return l1;
             }else{
                 l2.next = mergeTwoLists1(l1,l2.next);
                 return l2;
             }
         }
     }
     
}
