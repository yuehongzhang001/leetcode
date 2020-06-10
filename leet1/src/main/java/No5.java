/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.HashMap;
import java.util.Map;
public class No5 {
    public static String longestPalindrome(String s){
        if(s.length()<=1) return s;
        int maxLen=1;
        String maxStr=""+s.charAt(0);
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>i&&j-i+1>maxLen;j--){
                if(s.charAt(i)!=s.charAt(j)) continue;
                String subStr=s.substring(i,j+1);
                String reverseStr=new StringBuffer(subStr).reverse().toString();
                if(subStr.equals(reverseStr)){
                    int len=subStr.length();
                    if(maxLen<len){
                        maxLen=len;
                        maxStr=subStr;
                    }
                }
            }
        }
        return maxStr;
    }
    
    /*
    Map<String,int[]> map= new HashMap();
        for(int i=0;i<s.length();i++){
            String ss=""+s.charAt(i);
            if(!map.containsKey(ss)){
                int[] range={i,i+1};
                map.put(ss, range);
            }else{
                map.get(ss)[1]=i+1;
            }
        }
        
        String maxChar=""+s.charAt(0);
        int[] firstRange=map.get(maxChar);
        int maxLen=firstRange[1]-firstRange[0];
        for(Map.Entry<String, int[]> entry : map.entrySet()){
            String mapKey = entry.getKey();
            int[] mapValue = entry.getValue();
            int len=mapValue[1]-mapValue[0];
            if(maxLen<len){
                maxLen=len;
                maxChar=mapKey;
            }
        }
        int start=map.get(maxChar)[0];
        int end=map.get(maxChar)[1];
        return s.substring(start, end);
    
    */
    
}
