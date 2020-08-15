/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1374 {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n-1;i++)
            sb.append('a');
        if(n%2==0)
            sb.append('b');
        else
            sb.append('a');
        return sb.toString();
    }
}
