/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No507 {
    public boolean checkPerfectNumber(int num) {
        if(num<=0) return false;
        int sum = 0;
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                if(num/i==i)
                    sum+=i;
                else
                    sum+=i+num/i;
            }
        }
        return sum==2*num;
        
    }
}
