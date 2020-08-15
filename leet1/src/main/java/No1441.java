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
public class No1441 {
    public List<String> buildArray(int[] target, int n) {
        LinkedList<String> ans= new LinkedList();
        int num=1;
        for(int i=0;i<target.length;i++){
            if(target[i]!=num){
                while(target[i]!=num){
                    ans.add("Push");
                    ans.add("Pop");
                    num++;
                }
                
            }
            ans.add("Push");
            num++;
        }
        return ans;
    }
    public List<String> buildArray1(int[] target, int n){
        LinkedList<String> ans= new LinkedList();
        for(int i=1,j=0;i<=n;i++){
            if(j==target.length)
                break;
            if(target[j]==i){
                ans.add("Push");
                j++;
            }  
            else{
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }
}
