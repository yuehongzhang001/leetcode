
import java.util.Arrays;

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
public class No937 {
    public String[] reorderLogFiles(String[] logs) {
       ArrayList<String> llist = new ArrayList();
       ArrayList<String> dlist = new ArrayList();
       for(String s:logs){
           if(Character.isDigit(s.substring(s.indexOf(" ")+1).charAt(0)))
               dlist.add(s);
           else
               llist.add(s);
       }
       Collections.sort(llist, (String s1,String s2)->{
           int space1 = s1.indexOf(" ");
           int space2 = s2.indexOf(" ");
           if(s1.substring(space1).equals(s2.substring(space2)))
               return s1.substring(0, space1).compareTo(s2.substring(0, space2));
           else
               return s1.substring(space1).compareTo(s2.substring(space2));
       }
       );
       int i=0;
       for(;i<llist.size();i++){
           logs[i]=llist.get(i);
       }
       for(String s:dlist){
           logs[i++]=s;
       }
       return logs;
    }
}
