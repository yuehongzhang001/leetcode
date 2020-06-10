/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author yuehongzhang
 */
import java.util.ArrayDeque;
public class No6 {
    
    
    public static String convert1(String s, int numRows) {
        ArrayDeque<Character>[] deques=new ArrayDeque[numRows];
        for(int i=0;i<numRows;i++){
            deques[i]=new ArrayDeque();
        }
        int n=numRows*2-2;
        for(int i=0;i<s.length();i++){
            int r=i%n;
            if(r<numRows){
                deques[r].add(s.charAt(i));
            }else{
                deques[n-r].add(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++){
            while(!deques[i].isEmpty()){
                sb.append(deques[i].poll());
            }
        }
        return sb.toString();
    }
}
