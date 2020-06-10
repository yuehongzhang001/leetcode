/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。你可以假设 nums1 和 nums2 不会同时为空。
 * @author yuehongzhang
 */
public class FindMiddleOfTwoArray {
    public static double execute(int[] nums1, int[] nums2){
        int m=nums1.length;
        int n=nums2.length;
        int min=nums1[0]<nums2[0]?nums1[0]:nums2[0];
        int max=nums1[m]>nums2[n]?nums1[m]:nums2[n];
        for(int i=1;i<m+n;i++){
            min=nums1[i];
        }
        return 0;
    }
}
