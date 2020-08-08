
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
public class No1170 {
     public int[] numSmallerByFrequency(String[] queries, String[] words) {
         int len=queries.length;
         int[] ans=new int[len];
         for(int i=0;i<len;i++){
             ans[i]=frequent(queries[i]);
         }
         int len2=words.length;
         int[] wordfrequent = new int[len2];
         for(int i=0;i<len2;i++){
             wordfrequent[i]=frequent(words[i]);
         }
         Arrays.sort(wordfrequent);
         for(int i=0;i<len;i++){
             int n=ans[i];
             int j=0;
             while(j<len2 && n>=wordfrequent[j]) j++;
             ans[i]=len2-j;
         }
         return ans;
    }
    public int frequent(String word){
        int[] m=new int[26];
        for(char c:word.toCharArray())
                 m[c-'a']++;
        int i=0;
        while(m[i]==0)i++;
        return m[i];
    }
}
