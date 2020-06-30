/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No168 {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n/26!=0 || n%26!=0){
            int digit = n%26;
            if(digit==0) {
                sb.append('z');
                n/=26;
                n--;
            }
                
            else{
                sb.append((char)('A'+digit-1));
                n/=26;
            }
                
            
        }
        sb.reverse();
        return sb.toString();
    }
    
    public String convertToTitle1(int n){
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            n=n-1;
            int digit=n%26;
            char c = (char)('A'+digit);
            sb.append(c);
            n=n/26;
        }
        return sb.reverse().toString();
    }
}
