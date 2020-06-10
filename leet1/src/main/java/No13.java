/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No13 {
    public static int romanToInt(String s) {
        int result=0;
        int preNum=getValue(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int num = getValue(s.charAt(i));
            if(preNum<num){
                result-=preNum;
            }else{
                result+=preNum;
            }
            preNum=num;
        }
        
        return result+=preNum;
    }
    
    
    public static int getValue(char ch){
        switch(ch){
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default: return 0;
            }
    }
}
