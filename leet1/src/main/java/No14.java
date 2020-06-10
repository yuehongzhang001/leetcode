/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        for(int i=0; i<strs[0].length();i++){
            char c = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].length()==j || strs[j].charAt(i)!=c)
                    return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
    public static String longestCommonPrefix1(String[] strs) {
        if(strs.length==0) return "";
        int minLen=strs[0].length();
        for(String s: strs){
            minLen=Math.min(minLen, s.length());
        }
        int low=1;
        int high=minLen;
        while(low<=high){
            int middle=(low+high)/2;
            if(isCommon(strs,middle)){
                low=middle+1;
            }else{
                high=middle-1;
            }
        }
        return strs[0].substring(0,(low+high)/2);
    }
    public static boolean isCommon(String[] strs, int len){
        String s=strs[0].substring(0,len);
        for(int i=1;i<strs.length;i++){
            if(!strs[i].startsWith(s))
                return false;
        }
        return true;
    }
}
