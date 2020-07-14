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
public class No443 {
    public int compress(char[] chars) {
        if(chars.length==0) return 0;
        int count=1;
        int j=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                count++;
            }
            else{
                if(count>1){
                    String s = ""+count;
                    for(int k=0;k<s.length();k++){
                        chars[j++]=s.charAt(k);
                    }
                }
                chars[j]=chars[i];
                j++;
                count=1;
            } 
        }
        if(count>1){
            String s = ""+count;
            for(int k=0;k<s.length();k++){
                chars[j++]=s.charAt(k);
            }
        }
        return j;
    }
    public int compress1(char[] chars){
        if(chars.length==0) return 0;
        ArrayList<String> list = new ArrayList();
        list.add(""+chars[0]);
        int count=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1])
                count++;
            else{
                if(count>1)
                    list.add(""+count);
                list.add(""+chars[i]);
                count=1;
            }
        }
        if(count>1)
            list.add(""+count);
        int k=0;
        for(String s:list){
            for(int i=0;i<s.length();i++){
                chars[k++]=s.charAt(i);
            }
        }
        return k-1;
    }
    
    public int compress2(char[] chars){
        int anchor=0,write=0;
        for(int read=0;read<chars.length;read++){
            if(read+1==chars.length || chars[read]!=chars[read+1]){
                chars[write++]=chars[anchor];
                int count = read-anchor+1;
                if(count>1){
                    String num = ""+count;
                    for(char c:num.toCharArray()){
                        chars[write++]=c;
                    }
                }
                anchor=read+1;
            }
        }
        return write;
    }
}
