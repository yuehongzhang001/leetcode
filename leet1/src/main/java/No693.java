/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No693 {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))
                return false;
        }
        return true;
    }
    
    public boolean hasAlternatingBits1(int n){
        int prev = n%2;
        n/=2;
        while(n!=0){
            if(n%2==prev)
                return false;
            prev=n%2;
            n/=2;
        }
        return true;
    }
}
