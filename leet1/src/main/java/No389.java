
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No389 {
    public char findTheDifference(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        for(;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
                return arr2[i];
        }
        return arr2[i];
    }
    public char findTheDifference1(String s, String t){
        int[] map = new int[26];
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i)-'a';
            map[c] = map[c]+1;
        }
        int i=0;
        for(;i<t.length();i++){
            int c = t.charAt(i)-'a';
            if(map[c]==0)
                return t.charAt(i);
            else
               map[c]=map[c]-1;
        }
        return t.charAt(i);
    }
    
    public char findTheDifference3(String s, String t){
        int result = 0;
        for(int i=0;i<s.length();i++){
            result+=t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            result-=s.charAt(i);
        }
        
        return (char)result;
    }
}
