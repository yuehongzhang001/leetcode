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
public class No1046 {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        Stack<Integer> stack = new Stack();
        for(int n:stones)
            stack.push(n);
        //test(stack);
        while(stack.size()>2){
            int diff = stack.pop()-stack.pop();
            if(diff!=0){
                int i=stack.size()-1;
                while(i>=0){
                    if(diff<=stack.get(i))
                        i--;
                    else
                        break;
                }
                stack.insertElementAt(diff, i+1);
            } 
            //test(stack);
        }
        if(stack.size()==1)
            return stack.pop();
        else
            return stack.pop()-stack.pop();
    }
    public void test(Stack<Integer> stack){
        for(int n:stack)
            System.out.print(n+",");
        System.out.println();
    }
    
    public int lastStoneWeight1(int[] stones){

        Arrays.sort(stones);
        int index = stones.length-1;
        if(index==0) return stones[0];
        while(stones[index-1]!=0){
            stones[index-1]=stones[index]-stones[index-1];
            stones[index]=0;
            Arrays.sort(stones);
        }
        return stones[index];
    }
}
