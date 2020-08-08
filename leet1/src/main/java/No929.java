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
public class No929 {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet();
        for(String s:emails){
            String[] ss=s.split("@");
            StringBuilder sb = new StringBuilder();
            for(char c:ss[0].toCharArray()){
                if(c=='+')
                    break;
                if(c!='.')
                    sb.append(c);
            }
            sb.append("@").append(ss[1]);
            set.add(sb.toString());
        }
        return set.size();
    }
}
