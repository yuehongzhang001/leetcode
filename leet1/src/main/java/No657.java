/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No657 {
    public boolean judgeCircle(String moves) {
        int X=0;
        int Y=0;
        for(int i=0;i<moves.length();i++){
            switch(moves.charAt(i)){
                case 'R':X+=1;break;
                case 'L':X-=1;break;
                case 'U':Y+=1;break;
                case 'D':Y-=1;break;
            }
        }
        return X==0&&Y==0;
    }
}
