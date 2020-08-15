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
public class No1496 {
    public boolean isPathCrossing(String path) {
        HashSet<String> set = new HashSet();
        int x=0,y=0;
        set.add("0,0");
        for(char c:path.toCharArray()){
            switch(c){
                case 'N': y++;break;
                case 'S': y--;break;
                case 'E': x++;break;
                case 'W': x--;break;
            }
            if(!set.add(""+x+","+y)) return true;
        }
        return false;
    }
    
    public boolean isPathCrossing1(String path) {
        HashSet<Integer> set = new HashSet();
        int x=0,y=0;
        set.add(getHash(x,y));
        for(char c:path.toCharArray()){
            switch(c){
                case 'N': y++;break;
                case 'S': y--;break;
                case 'E': x++;break;
                case 'W': x--;break;
            }
            if(!set.add(getHash(x,y))) return true;
        }
        return false;
    }
    
    public int getHash(int x,int y){
        return x*20001+y;
    }
}
