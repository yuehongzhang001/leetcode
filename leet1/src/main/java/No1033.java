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
public class No1033 {
    public int[] numMovesStones(int a, int b, int c) {
        int[] arr = {a,b,c};
        Arrays.sort(arr);
        int min=2;
        if(arr[1]-arr[0]==2||arr[2]-arr[1]==2)
            min--;
        else{
            if(arr[1]-arr[0]==1 ) min--;
            if(arr[2]-arr[1]==1) min--;
        }
        int max=arr[1]-arr[0]-1+arr[2]-arr[1]-1;
        return new int[]{min,max};
    }
}
