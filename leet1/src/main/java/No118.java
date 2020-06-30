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
public class No118 {
    
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0) return new LinkedList();

        if(numRows==1){
            List<List<Integer>> ll = new LinkedList();
            List<Integer> il = new LinkedList();
            il.add(1);
            ll.add(il);
            return ll;
        }
        List<List<Integer>> ll = generate(numRows-1);
        
        List<Integer> lastLine = ll.get(ll.size()-1);
        List<Integer> currentLine = new LinkedList();
        currentLine.add(1);
        currentLine.add(1);
        for(int i=1;i<numRows-1;i++){
            int num = lastLine.get(i-1)+lastLine.get(i);
            currentLine.add(i, num);
        }
        ll.add(currentLine);
        return ll;
    }
    public List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> ll = new LinkedList();
        if(numRows==0) return ll;
        ll.add(new LinkedList());
        ll.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> currentLine = new LinkedList();
            List<Integer> lastLine = ll.get(i-1);
            currentLine.add(1);
            currentLine.add(1);
            for(int j=1;j<i;j++){
                int num = lastLine.get(j-1)+lastLine.get(j);
                currentLine.add(j,num);
            }
            ll.add(currentLine);
        }
        return ll;
    }
    
}
