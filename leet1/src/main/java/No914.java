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
public class No914 {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int n:deck){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        int min = Collections.min(map.values());
        
        for(int i=2;i<=Math.sqrt(min);i++){
            boolean flag= true;
            for(int n:map.values()){
                if(n%i!=0){
                    flag=false;
                    break;
                }    
            }
            if(flag) return true;
        }
        return false;
    }
    
    public boolean hasGroupsSizeX1(int[] deck){
        int[] map = new int[1000];
        for(int n:deck){
            map[n]++;
        }
        int g=0;
        for(int n:map){
            if(n==0)
                continue;
            else if(n==1)
                return false;
            else{
                g=gcd(g,n);
                if(g==1)
                    return false;
            }
        }
        return true;
    }
    
    public int gcd(int x,int y){
        return x==0?y:gcd(y%x,x);
    }
    
}
