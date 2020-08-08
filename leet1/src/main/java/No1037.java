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
public class No1037 {
    public boolean isBoomerang(int[][] points) {

return (points[1][0]-points[0][0])*(points[2][1]-points[0][1])!=(points[2][0]-points[0][0])*(points[1][1]-points[0][1]);    }
}
