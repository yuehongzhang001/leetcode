/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
public class No299 {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> map = new HashMap();
        int bullCount = 0;
        for(int i=0;i<secret.length();i++){
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);
            if(c1==c2)
                bullCount++;
            if(!map.containsKey(c1))
                map.put(c1, 1);
            else{
                int count = map.get(c1);
                map.put(c1, count+1);
            }          
        }
        int duplicate = 0;
        for(int i=0;i<guess.length();i++){
            char c = guess.charAt(i);
            if(map.containsKey(c)){
                duplicate++;
                int count=map.get(c);
                if(count==1) 
                    map.remove(c);
                else
                    map.put(c, count-1);
            }
        }
        return bullCount+"A"+(duplicate-bullCount)+"B";
    }
    
    public String getHint1(String secret, String guess){
        int bullCount = 0;
        int len = secret.length();
        int[] s = new int[len];
        int[] g = new int[len];
        for(int i=0;i<len;i++){
            s[i]=secret.charAt(i);
            g[i]=guess.charAt(i);
            if(s[i]==g[i])
                bullCount++;
        }
        Arrays.sort(s);
        Arrays.sort(g);
        int duplicate = 0;
        for(int i=0,j=0;i<len && j<len;){
            if(s[i]==g[j]){
                duplicate++;
                i++;
                j++;
            }
            else if(s[i]>g[j]){
                j++;
            }else
                i++;    
        }
        return bullCount+"A"+(duplicate-bullCount)+"B";
        
    }
    
    public String getHint2(String secret, String guess){
        int bullCount = 0;
        int len = secret.length();
        int[] times = new int[10];
        for(int i=0;i<len;i++){
            char c1=secret.charAt(i);
            char c2=guess.charAt(i);
            if(c1==c2)
                bullCount++;
            times[c1-'0']++;
        }
        int duplicate = 0;
        for(int i=0;i<len;i++){
            char c = guess.charAt(i);
            if(times[c-'0']>0)
                duplicate++;
            times[c-'0']=times[c-'0']-1;
        }
        return bullCount+"A"+(duplicate-bullCount)+"B";
    }
    
    public String getHint3(String secret, String guess){
        int bullCount = 0;
        int cowCount = 0;
        int[] times = new int[10];
        for(int i=0;i<secret.length();i++){
            int s = secret.charAt(i)-'0';
            int g = guess.charAt(i)-'0';
            if(s==g) 
                bullCount++;
            else{
                if(times[g]>0) cowCount++;
                if(times[s]<0) cowCount++;
                times[s]++;
                times[g]--;
                
            }
        }
        return  bullCount+"A"+cowCount+"B";
    }
}
