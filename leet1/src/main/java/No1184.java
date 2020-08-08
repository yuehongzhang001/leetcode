/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int distance1 =0;
        int distance2 =0;
        int i=start;
        int n=distance.length;
        while(i!=destination){
            distance1+=distance[i];
            i=(i+1)%n;
        }
        while(i!=start){
            distance2+=distance[i];
            i=(i+1)%n;
        }
        return Math.min(distance1, distance2);
    }
}
