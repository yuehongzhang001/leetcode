/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1523 {
    public int countOdds(int low, int high) {
        return (high+1)/2-(low+1)/2+low%2;
    }
}
