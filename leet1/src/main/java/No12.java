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
public class No12 {
    public String intToRoman(int num) {
        String[][] map={{"","I","II","III","IV","V","VI","VII","VIII","IX"},{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},{"","M","MM","MMM"}};
        int i=0;
        ArrayList<String> list = new ArrayList();
        while(num!=0){
            int d=num%10;
            list.add(map[i][d]);
            i++;
            num/=10;
        }
        StringBuilder sb = new StringBuilder();
        for(int j=list.size()-1;j>=0;j--){
            sb.append(list.get(j));
        }
        return sb.toString();
    }
    
    public String intToRoman1(int num) {
        String[][] map={{"","I","II","III","IV","V","VI","VII","VIII","IX"},{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},{"","M","MM","MMM"}};
        return map[3][num/1000]+map[2][num%1000/100]+map[1][num%100/10]+map[0][num%10];
    }
}
