/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.*;
public class No1417 {
    public String reformat(String s) {
        ArrayList<Character> chs = new ArrayList();
        ArrayList<Character> digits = new ArrayList();
        for(char c:s.toCharArray()){
            if(Character.isAlphabetic(c))
                chs.add(c);
            else
                digits.add(c);
        }
        if(Math.abs(chs.size()-digits.size())>1) return "";
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> longList= chs.size()>digits.size()?chs:digits;
        ArrayList<Character> shortList= chs.size()>digits.size()?digits:chs;
        int i=0;
        for(;i<shortList.size();i++){
            sb.append(longList.get(i));
            sb.append(shortList.get(i));
        }
        if(chs.size()!=digits.size())
            sb.append(longList.get(i));
        return sb.toString();
    }
    
    public String reformat1(String s){
       char[] ans = s.toCharArray();
       int numc = 0;
       int numd = 0;
       for(char c:s.toCharArray()){
           if(Character.isDigit(c)) numd++;
           else numc++;
       }
       if(numc-numd<-1||numc-numd>1) return "";
       int i=0,j=0;
       if(numc>numd) j=1;
       else i=1;
       for(char c:s.toCharArray()){
           if(Character.isDigit(c)){
               ans[j]=c;
               j+=2;
           }else{
               ans[i]=c;
               i+=2;
           }
       }
       return String.valueOf(ans);
    }
}
