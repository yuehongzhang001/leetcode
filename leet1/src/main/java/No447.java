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
public class No447 {
    public int numberOfBoomerangs(int[][] points) {
        int count=0;
        int len = points.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(j==i) continue;
                for(int k=0;k<len;k++){
                    if(k==j || k==i) continue;
                    long x0=points[i][0];
                    long y0=points[i][1];
                    long x1=points[j][0];
                    long y1=points[j][1];
                    long x2=points[k][0];
                    long y2=points[k][1];
                    if((x0-x1)*(x0-x1)+(y0-y1)*(y0-y1)==(x0-x2)*(x0-x2)+(y0-y2)*(y0-y2))
                        count++;
                }
            }
        }
        return count;
    }
    
     public int numberOfBoomerangs1(int[][] points){
         int result=0;
         HashMap<Integer,Integer> map = new HashMap();
         int len = points.length;
         for(int i=0;i<len;i++){
             map.clear();
             for(int j=0;j<len;j++){
                 if(j==i) continue;
                 int x=points[i][0];
                 int y=points[i][1];
                 int xx=points[j][0];
                 int yy=points[j][1];
                 int distance = (xx-x)*(xx-x)+(yy-y)*(yy-y);
                 int count = map.getOrDefault(distance, 0);
                 map.put(distance, count+1);
             }
             for(Integer n:map.values()){
                 result+=n*(n-1);
             }
         }
         
         return result;
     }
}
