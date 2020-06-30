/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.List;
import java.util.LinkedList;
public class No119 {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex<0) return null;
        List<Integer> current = new LinkedList();
        current.add(1);
        if(rowIndex==0) 
            return current;
        current.add(1);
        List<Integer> prev = getRow(rowIndex-1);
        for(int i=1;i<rowIndex;i++){
            current.add(i, (prev.get(i-1)+prev.get(i)));
        }
        return current;
    }
}
