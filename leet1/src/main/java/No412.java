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
public class No412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        for(int i=1;i<=n;i++){
            if(i%3==0 &&i%5==0)
                list.add("FizzBuzz");
            else if(i%3==0)
                list.add("Fizz");
            else if(i%5==0)
                list.add("Buzz");
            else
                list.add(i+"");
        }
        return list;
    }
    public List<String> fizzBuzz1(int n){
        List<String> list = new ArrayList();
        for(int i=1;i<=n;i++){
            list.add(i+"");
        }
        for(int i=1; i*3<=n;i++){
            list.set(i*3, "Fizz");
        }
        for(int i=1; i*5<=n;i++){
            list.set(i*5, "Buzz");
        }
        for(int i=1; i*15<=n;i++){
            list.set(i*15, "FizzBuzz");
        }
        return list;
    }
    
    public List<String> fizzBuzz2(int n){
        List<String> list = new ArrayList();
        for(int i=1;i<=n;i++){
            String s = "";
            if(i%3==0) s+="Fizz";
            if(i%5==0) s+="Buzz";
            if(s.equals("")) s+=i;
            list.add(s);
        }
        return list;
    }
}
