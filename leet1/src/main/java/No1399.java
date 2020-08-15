/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1399 {
    public int countLargestGroup(int n) {
        int[] map = new int[37];
        int max=0;
        for(int i=1;i<=n;i++){
            int m=i;
            int sum=0;
            while(m!=0){
                sum+=m%10;
                m/=10;
            }
            map[sum]++;
            max=Math.max(max, map[sum]);
        }
        int ans=0;
        for(int i=1;i<37;i++)
            ans+=max==map[i]?1:0;
        return ans;
    }
}
