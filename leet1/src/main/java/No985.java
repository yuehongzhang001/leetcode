/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No985 {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        
        int[] ans=new int[queries.length];
        int sum = 0;
        for(int n:A){
            if(n%2==0) sum+=n;
        }
        int j=0;
        for(int[] q:queries){
            int i=q[1];
            int n=q[0];
            if(A[i]%2==0){
                if(n%2==0)
                    sum+=n;
                else
                    sum-=A[i];
            }else{
                if(n%2!=0)
                    sum+=A[i]+n;
            }
            ans[j++]=sum;
            A[i]+=n;
        }
        return ans;
    }
}
