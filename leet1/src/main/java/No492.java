/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No492 {
    public int[] constructRectangle(int area) {
        int w =1;
        int res = 1;
        while(w<=Math.sqrt(area)){
            if(area%w==0)
                res = w;
            w++;
        }
        return new int[]{area/res,res};
    }
    public int[] constructRectangle1(int area){
       int w =(int)Math.sqrt(area);
        while(w>=1){
            if(area%w==0)
                return new int[]{area/w,w};
            w--;
        }
        return null;
    }
}
