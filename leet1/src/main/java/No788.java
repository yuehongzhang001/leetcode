/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No788 {
    int[] map = {0,0,1,-1,-1,1,1,-1,0,1};
    public int rotatedDigits(int N) {
        int count=0;
        for(int i=1;i<=N;i++){
            if(isGood(i))
                count++;
        }
        return count;
    }
    public boolean isGood(int n){
        boolean good=false;
        while(n!=0){
            int d=n%10;
            if(map[d]==-1)
                return false;
            else if(map[d]==1)
                good=true;
            n/=10;
        }
        return good;
    }
}
