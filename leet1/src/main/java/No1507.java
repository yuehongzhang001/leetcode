/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1507 {
    public String reformatDate(String date) {
        String[] ss= date.split(" ");
        int d=Integer.parseInt(ss[0].substring(0,ss[0].length()-2));
        String[] month={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int m=0;
        for(int i=0;i<12;i++){
            if(month[i].equals(ss[1])){
                m=i+1;
                break;
            }  
        }

        return String.format("%s-%02d-%02d", ss[2],m,d);
    }
}
