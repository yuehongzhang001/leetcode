/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1154 {
    public int dayOfYear(String date) {
        int[] days={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] all = date.split("-");
        int y=Integer.parseInt(all[0]);
        int m=Integer.parseInt(all[1]);
        int d=Integer.parseInt(all[2]);
        int ans=0;
        if(y%100!=0&& y%4==0 || y%100==0&&y%400==0) days[2]++;
        for(int i=0;i<m;i++)
            ans+=days[i];
        ans+=d;
        return ans;
    }
}
