/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1360 {
    
    public int daysBetweenDates(String date1, String date2) {
        int[] month={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] first = date1.split("-");
        String[] second = date2.split("-");
        if(first[0].equals(second[0])){
            return Math.abs(days(Integer.parseInt(first[0]),Integer.parseInt(first[1]),Integer.parseInt(first[2]))[0]-
                    days(Integer.parseInt(second[0]),Integer.parseInt(second[1]),Integer.parseInt(second[2]))[0]);
        }else{
            int sY,sM,sD,lY,lM,lD;
            int ans=0;
            if(Integer.parseInt(first[0])<Integer.parseInt(second[0])){
                sY=Integer.parseInt(first[0]);
                sM=Integer.parseInt(first[1]);
                sD=Integer.parseInt(first[2]);
                lY=Integer.parseInt(second[0]);
                lM=Integer.parseInt(second[1]);
                lD=Integer.parseInt(second[2]);
            }else{
                sY=Integer.parseInt(second[0]);
                sM=Integer.parseInt(second[1]);
                sD=Integer.parseInt(second[2]);
                lY=Integer.parseInt(first[0]);
                lM=Integer.parseInt(first[1]);
                lD=Integer.parseInt(first[2]);
            }
            int y=sY+1;
            while(y<lY){
                ans+=isLeap(y)?366:365;
                y++;
            }
            ans+=days(sY,sM,sD)[1]+days(lY,lM,lD)[0];
            return ans;
        }
    }
    public boolean isLeap(int n){
        if(n%400==0||n%100!=0 && n%4==0)
            return true;
        return false;
    }
    public int[] days(int y,int m,int d){
        int[] ans=new int[2];
        int[] month={0,31,28,31,30,31,30,31,31,30,31,30,31};
        boolean leap=false;
        if(isLeap(y)){
            month[2]=29;
            leap=true;
        }
        for(int i=0;i<m;i++){
            ans[0]+=month[i];
        }
        ans[0]+=d;
        ans[1]=leap?366-ans[0]:365-ans[0];
        return ans;
    }

     public int daysBetweenDates1(String date1, String date2){
         return Math.abs(dateTo1971(date1)-dateTo1971(date2));
     }
     public int dateTo1971(String s){
         int[] date=new int[3];
         int[] month={0,31,28,31,30,31,30,31,31,30,31,30,31};
         int ans=0;
         int j=0;
         for(String ss:s.split("-")){
             date[j++]=Integer.parseInt(ss);
         }
         int y=1971;
         while(y<date[0]){
             ans+=isLeap(y)?366:365;
             y++;
         }
         for(int i=1;i<date[1];i++)
             ans+=month[i];
         if(isLeap(date[0])&&date[1]>2)
             ans++;
         ans+=date[2];
         return ans;
     }
}
