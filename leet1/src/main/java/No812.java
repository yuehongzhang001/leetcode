/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No812 {
    public double largestTriangleArea(int[][] points) {
        double res=0;
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                for(int k=j+1;k<points.length;k++){
                    double area = area(points[i],points[j],points[k]);
                    res=Math.max(area, res);
                }
            }
        }
        return res;
    }
    public double area(int[] p,int[]q,int[] r){
        return 0.5*Math.abs(p[0]*q[1]+q[0]*r[1]+r[0]*p[1]-p[1]*q[0]-q[1]*r[0]-r[1]*p[0]);
    }
}
