/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1287 {
    public int findSpecialInteger(int[] arr) {
        int len=arr.length;
        int num=-1;
        int count=0;
        for(int i=0;i<len;i++){
            if(arr[i]!=num){
                num=arr[i];
                count=1;
            }else{
                count++;
            }
            if(count>0.25*len)
                return num;
        }
        return -1;
    }
    
    
    public int findSpecialInteger1(int[] arr){
        int len=arr.length;
        int span =len/4+1;
        for(int i=0;i<len;i+=span){
            int n=arr[i];
            int low=0;
            int high=len-1;
            while(low<=high){
                int mid=(high+low)/2;
                if(arr[mid]<n)
                    low=mid+1;
                else
                    high=mid-1;
                System.out.println("for l->low:"+low+"high:"+high);
            }
            int left=low;
            low=0;
            high=len-1;
            while(low<=high){
                int mid=(high+low)/2;
                if(arr[mid]>n)
                    high=mid-1;
                else
                    low=mid+1;
                 System.out.println("for r->low:"+low+"high:"+high);
            }
            int right=high;
            if(right-left+1>=span) return n;
        }
        return -1;
    }
    public void test(int n){
        System.out.println(n);
    }
}
