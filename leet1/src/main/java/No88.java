/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length;
        int start = len-m;
        for(int i=m-1,j=len-1;i>=0;i--){
            nums1[j--]=nums1[i];
        }
        System.out.println();
        int i=start,j=0,k=0;
        while(i<len || j<n){
            if(i==len){
                nums1[k++]=nums2[j++];
            }else if(j==n){
                nums1[k++]=nums1[i++];
            }else{
                int val1=nums1[i];
                int val2=nums2[j];
                if(val1<val2){
                    nums1[k]=nums1[i];
                    i++;
                }else{
                    nums1[k]=nums2[j];
                    j++;
                }
                k++;
            }
        }
    }
    
     public static void merge1(int[] nums1, int m, int[] nums2, int n){
         int i=m-1,j=n-1,k=m+n-1;
         while(i>=0&&j>=0){
             nums1[k--]=nums1[i]>nums2[j]?nums1[i--]:nums2[j--];
         }
         System.arraycopy(nums2, 0, nums1, 0, j+1);
     }
}
