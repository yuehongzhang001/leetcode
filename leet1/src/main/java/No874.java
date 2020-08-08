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
public class No874 {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x=0;
        int y=0;
        int direction = 0;
        int[] dx = {0,-1,0,1};
        int[] dy = {1,0,-1,0};
        int res=0;
        HashSet<String> set = new HashSet();
        for(int[] r:obstacles){
            set.add(r[0]+","+r[1]);
        }
        for(int n:commands){
            if(n==-1){
                direction=(direction+3)%4;
            }else if(n==-2)
                direction=(direction+1)%4;
            else{
                for(int i=0;i<n;i++){
                    int nextx=x+dx[direction];
                    int nexty=y+dy[direction];
                    if(set.contains(nextx+","+nexty)){
                        break;
                    }else{
                        x=nextx;
                        y=nexty;
                        res=Math.max(res, x*x+y*y);
                    }
                }
            }   
        }
        return res;
    }
}
