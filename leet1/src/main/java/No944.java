/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No944 {
    public int minDeletionSize(String[] A) {
        int ans=0;
        for(int i=0;i<A[0].length();i++){
            boolean flag=true;
            for(int j=0;j<A.length-1;j++){
                if(A[j].charAt(i)>A[j+1].charAt(i)){
                    ans++;
                    break;
                }   
            }
        }
        return ans;
    }
}
