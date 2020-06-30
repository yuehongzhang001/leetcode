/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No258 {
    public int addDigits(int num) {
        if(num/10==0) return num;
        int sum = 0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return addDigits(sum);
    }
}
