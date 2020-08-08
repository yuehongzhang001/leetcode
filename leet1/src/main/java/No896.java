/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No896 {
    public boolean isMonotonic(int[] A) {
        int len = A.length;
        if(len==1) return true;
        boolean increase = true;
        for(int i=1;i<len;i++){
            if(A[i-1]>A[i]){
                increase=false;
                break;
            }  
        }
        if(increase) return true;
        boolean decrease = true;
        for(int i=1;i<len;i++){
            if(A[i-1]<A[i]){
                decrease=false;
                break;
            }  
        }
        if(decrease) return true;
        return false;
        
    }
    
    public boolean isMonotonic1(int[] A){
        int c=0;
        for(int i=1;i<A.length;i++){
            int t=A[i]-A[i-1];
            if(t!=0){
                if(c*t<0)
                    return false;
                c=t;
            }
        }
        return true;
    }
}
