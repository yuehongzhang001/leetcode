/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.Stack;
public class No66 {
    public static int[] plusOne(int[] digits) {
        Stack<Integer> stack = new Stack();
        int flag = 1;
        for(int i=digits.length-1;i>=0;i--){
            int num = digits[i]+flag;
            if(num>9){
                num = 0;
            }else{
                flag=0;
            }
            stack.push(num);
        }
        if(flag==1){
            stack.push(1);
        }
        int len = stack.size();
        int[] plus = new int[len];
        for(int i=0;i<len;i++){
            plus[i] = stack.pop();
        }
        return plus;
    }
    public static int[] plusOne1(int[] digits){
        int len = digits.length;
        for(int i=len-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        int[] plus = new int[len+1];
        plus[0]=1;
        return plus;
    }
}
