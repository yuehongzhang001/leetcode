/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        int x=coordinates[1][0]-coordinates[0][0];
        int y=coordinates[1][1]-coordinates[0][1];
        for(int i=2;i<coordinates.length;i++){
            if(x*(coordinates[i][1]-coordinates[0][1])!=y*(coordinates[i][0]-coordinates[0][0]))
                return false;
        }
        return true;
    }
}
