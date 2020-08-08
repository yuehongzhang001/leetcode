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
public class No989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> ans = new ArrayList();
        int flag=0;
        int i=A.length-1;
        while(i>=0 || K!=0){
            int n=i>=0?A[i--]:0;
            int sum = n+K%10+flag;
            if(sum>9){
                ans.add(0,sum%10);
                flag=1;
            }else{
                ans.add(0,sum);
                flag=0;
            }
            K/=10;
        }
        if(flag==1)
            ans.add(0,1);
        return ans;
    }
    
    public List<Integer> addToArrayForm1(int[] A, int K){
        List<Integer> ans = new ArrayList();
        int i=A.length-1;
        while(i>=0 || K>0){
            if(i>=0)
                K+=A[i--];
            ans.add(K%10);
            K/=10;
        }
        Collections.reverse(ans);
        return ans;
    }
}
