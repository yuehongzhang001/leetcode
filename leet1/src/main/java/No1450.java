/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int ans=0;
        for(int i=0;i<startTime.length;i++){
            if(startTime[i]<=queryTime && endTime[i]>=queryTime){
                ans++;
            }
        }
        return ans;
    }
}
