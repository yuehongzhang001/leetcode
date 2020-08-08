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
public class No1078 {
    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> ans = new ArrayList();
        String[] arr = text.split(" ");
        for(int i=0;i<arr.length-2;i++){
            if(arr[i].equals(first) && arr[i+1].equals(second)){
                ans.add(arr[i+2]);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}
