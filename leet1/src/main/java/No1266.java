/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans=0;
        for(int i=0;i<points.length-1;i++){
            int x1=points[i][0];
            int x2=points[i+1][0];
            int y1=points[i][1];
            int y2=points[i+1][1];
            int d1=Math.abs(x1-x2);
            ans+=Math.max(Math.abs(x1-x2), Math.abs(y1-y2));
        }
        return ans;
    }
}
