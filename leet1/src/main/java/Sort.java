/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class Sort {
    public static int[] mergeSort(int[] arr){
        int len=arr.length;
        if(len<2){
            return arr;
        }
        int[] arrLeft=slice(arr,0,len/2);
        int[] arrRight=slice(arr,len/2,len);
        return merge(mergeSort(arrLeft),mergeSort(arrRight));
    }
    
    public static int[] merge(int[] left,int[] right){
        int[] temp=new int[left.length+right.length];
        int j=0;
        int k=0;
        for(int i=0;i<temp.length;i++){
            int min;
            if(j==left.length){
                min=right[k];
                k++;
            }else if(k==right.length){
                min=left[j];
                j++;
            }else{
                if(left[j]<right[k]){
                    min=left[j];
                    j++;
                }else{
                    min=right[k];
                    k++;    
                }
            }
            temp[i]=min;
        }
        return temp;
    }
    
    public static int[] slice(int[] arr,int start,int end){
        int[] temp=new int[end-start];
        int j=0;
        for(int i=start;i<end;i++){
            temp[j]=arr[i];
            j++;
        }
        return temp;
    }
    
    public static void insertsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int temp= arr[i];
            int j=i-1;
            while(j>=0&&temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    
    public static int[] bublesort(int[] arr){
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]+' ');
        }
        boolean noSwap=true;
        while(noSwap!=true){
            noSwap=true;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    noSwap=false;
                }
            }
        }
        
        return arr;
    }
    
    public static void printArray(int[] arr){
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("}");
    }
}
