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
public class No811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> list = new ArrayList();
        HashMap<String, Integer> map = new HashMap();
        for(String s:cpdomains){
            String[] ss=s.split(" ");
            int n=Integer.parseInt(ss[0]);
            String domain=ss[1];
            for(int i=domain.length()-1;i>=0;i--){
                if(domain.charAt(i)=='.'){
                    String sub = domain.substring(i+1);
                    map.put(sub, map.getOrDefault(sub,0)+n);
                }   
            }
            map.put(domain, map.getOrDefault(domain, 0)+n);
        }
        for(String s:map.keySet()){
            list.add(map.get(s)+" "+s);
        }
        return list;
    }
}
