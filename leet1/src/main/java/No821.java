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
public class No821 {
    public int[] shortestToChar(String S, char C) {
        Deque<Integer> q = new LinkedList();
        char[] chs = S.toCharArray();
        int[] res=new int[chs.length];
        for(int i=0;i<chs.length;i++){
            if(chs[i]==C)
                q.add(i);
        }
        q.add(null);
        Integer prev=null;
        Integer next=q.pollFirst();
        for(int i=0;i<chs.length;i++){
            if(next==null){
                res[i]=i-prev;
            }else if(i<next){
                res[i]=prev==null?next-i:Math.min(next-i, i-prev);
            }else if(i==next){
                res[i]=0;
                prev=next;
                next=q.pollFirst();
            }
        }
        return res;
    }
    
    public int[] shortestToChar1(String S, char C){
        int N=S.length();
        int[] ans = new int[N];
        int prev=-N+1;
        for(int i=0;i<N;i++){
            if(S.charAt(i)==C)
                prev=i;
            ans[i]=i-prev;
        }
        
        prev=2*N-2;
        for(int i=N-1;i>=0;i--){
            if(S.charAt(i)==C)
                prev=i;
            ans[i]=Math.min(prev-i, ans[i]);
        }
        return ans;
    }
}
