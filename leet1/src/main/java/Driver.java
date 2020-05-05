/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class Driver {
    public static void main(String[] args){
        int[] arr={1,3,5,4};
        int[] result=FindTarget.execute(arr, 9);
        for(int i: result)
            System.out.print(i+" ");
    }
}
