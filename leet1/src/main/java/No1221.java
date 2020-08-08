/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1221 {
    public int balancedStringSplit(String s) {
        int ans=0;
        char first=s.charAt(0);
        char second=first=='L'?'R':'L';
        int firstNum=0;
        int secondNum=0;
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if(c==first)  firstNum++;
            else secondNum++;
            if(firstNum==secondNum){
                ans++;
                if(i<s.length()-1){
                    first=s.charAt(i+1);
                    second=first=='L'?'R':'L';
                    firstNum=0;
                    secondNum=0;
                }
            }
            i++;
        }
        return ans;
    }
    
    public int balancedStringSplit1(String s) {
        int num=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')
                num++;
            else
                num--;
            if(num==0) res++;
        }
        return res;
    }
}
