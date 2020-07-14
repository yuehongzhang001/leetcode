/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No415 {
    public String addStrings(String num1, String num2) {
        int flag=0;
        String shortS, longS;
        if(num1.length()>num2.length()){
            shortS = num2;
            longS = num1;
        }else{
            shortS = num1;
            longS = num2;
        }
        
        String ans = "";
        int len = longS.length()-shortS.length();
        for(int i=shortS.length()-1;i>=0;i--){
            int d1 = shortS.charAt(i)-'0';
            int d2 = longS.charAt(len+i)-'0';
            int d = d1+d2+flag;
            if(d>9){
                d%=10;
                flag=1;
            }else
                flag=0;
            ans = d+ans;
        }
        for(int i=len-1;i>=0;i--){
            int d = longS.charAt(i)-'0'+flag;
            if(d>9){
                d%=10;
                flag=1;
            }else
                flag=0;
            ans = d+ans;
        }
        if(flag==1)
            ans = 1+ans;
        return ans;
    }
    public String addStrings1(String num1, String num2){
        
        int i=num1.length()-1;
        int j=num2.length()-1;
        int flag=0;
        String s="";
        while(i>=0||j>=0){
            int n1 = i>=0?num1.charAt(i)-'0':0;
            int n2 = j>=0?num2.charAt(j)-'0':0;
            int digit = n1+n2+flag;
            flag=digit/10;
            digit%=10;
            s = digit+s;
            i--;
            j--;
        }
        return flag==1?1+s:s;
    }
        
        
}
