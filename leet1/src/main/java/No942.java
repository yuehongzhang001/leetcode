/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No942 {
    public int[] diStringMatch(String S) {
        int[] ans = new int[S.length()+1];
        for(int i=0;i<ans.length;i++){
            ans[i]=i;
        }
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='D'){
                int left=i;
                while(i<S.length() && S.charAt(i)=='D'){
                    i++;
                }
                reverse(ans, left,i);
            }   
        }
        return ans;
    }
    public void reverse(int[] arr,int l,int r){
        while(l<r){
            int tmp = arr[r];
            arr[r]=arr[l];
            arr[l]=tmp;
            l++;
            r--;
        }
    }
    
    public int[] diStringMatch1(String S){
        int N=S.length();
        int[] ans = new int[N+1];
        int low = 0;
        int high = N;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='I')
                ans[i]=low++;
            else
                ans[i]=high--;
        }
        ans[N]=low;
        return ans;
    }
}
