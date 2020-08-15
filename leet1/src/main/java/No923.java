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

public class No923 {

    public int threeSumMulti(int[] A, int target) {
        int len = A.length;
        int ans = 0;
        Arrays.sort(A);
        for (int i = 0; i < len - 2; i++) {
            int l = i + 1;
            int r = len - 1;
            while (l < r) {
                if (A[l] + A[r] + A[i] > target) {
                    r--;
                } else if (A[l] + A[r] + A[i] < target) {
                    l++;
                } else {
                    if(A[l]==A[r]){
                        int n=1;
                        while(l<r){
                            l++;
                            n++;
                        }
                        ans+=n*(n-1)/2;
                        ans%=1000000007;
                    }else{
                        int n1=1;
                        int n2=1;
                        int left=1,right=1;
                        while(A[l]==A[l+1]){
                            n1++;
                            l++;
                        }
                        while(A[r]==A[r-1]){
                            n2++;
                            r--;
                        }
                        ans+=n1*n2;
                        ans%=1000000007;
                        l++;
                        r--;
                    }
                }
            }
        }
        return ans;
    }
}
