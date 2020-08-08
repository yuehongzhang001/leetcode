/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No717 {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        while(i<bits.length-1){
            if(bits[i]==1)
                i+=2;
            else
                i++;
        }
        return i==bits.length-1;
            
    }
    public boolean isOneBitCharacter1(int[] bits){
        if(bits.length==1) return true;
        int i=bits.length-2;
        while(i>=0 && bits[i]==1) i--;
        return (bits.length-2-i)%2==0;
    }
}
