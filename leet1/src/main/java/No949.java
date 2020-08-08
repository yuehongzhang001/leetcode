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
public class No949 {
    public String largestTimeFromDigits(int[] A) {
       int len = A.length;
       Integer maxH = null;
       Integer maxM = null;
       for(int i=0;i<len;i++){
           for(int j=0;j<len;j++){
               if(j!=i)
               for(int m=0;m<len; m++){
                   if( m!=i && m!=j)
                   for(int n=0;n<len;n++){
                       if(n!=i&&n!=j &&n !=m){
                           int hour=A[i]*10+A[j];
                       int min = A[m]*10+A[n];
                        if(hour<=23 && min<=59){
                            if(maxH==null){
                                maxH=hour;
                                maxM=min;
                            }else{
                                if(maxH<hour){
                                    maxH=hour;
                                    maxM=min;
                                }else if(maxH==hour){
                                    if(maxM<min){
                                        maxM=min;
                                    }
                                }
                            }
                        }
                       }
                       
                   }
               }
           }
       }
       
       if(maxH==null)
           return "";
       return ""+maxH/10+maxH%10+":"+maxM/10+maxM%10;
    }
    
   
}
