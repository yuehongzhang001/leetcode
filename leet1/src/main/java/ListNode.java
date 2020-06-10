/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class ListNode{
         int val;
         ListNode next;
         ListNode(){}
         ListNode(int val){this.val=val;}
         ListNode(int val, ListNode next){this.val=val; this.next=next;}
         public String toString(){
             StringBuilder sb = new StringBuilder();
             ListNode pointer = this;
             while(pointer!=null){
                 sb.append(pointer.val+"->");
                 pointer=pointer.next;
             }
             return sb.toString();
         }
     }
