/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No43 {
    public String multiply(String num1, String num2) {
        String ans="";
        for(int i=num2.length()-1;i>=0;i--){
            char c=num2.charAt(i);
            String mul=multiplyDigit(num1,""+c);
            ans=sum(ans,mul);
            num1=num1+"0";
        }
        return ans;
    }
    
    public String multiplyDigit(String num1,String d){
        if(num1.indexOf("0")==0 || Integer.parseInt(d)==0) return "0";
        int flag=0;
        StringBuilder sb = new StringBuilder();
        for(int i=num1.length()-1;i>=0;i--){
            char c=num1.charAt(i);
            int n=c-'0';
            int m=Integer.parseInt(d);
            int mul =n*m+flag;
            sb.append(mul%10);
            flag=mul/10;
        }
        if(flag!=0) sb.append(flag);
        sb.reverse();
        return sb.toString();
    }
    
    public String sum(String num1,String num2){
        int flag=0;
        StringBuilder sb = new StringBuilder();
       for(int i=num1.length()-1,j=num2.length()-1;i>=0||j>=0||flag!=0;i--,j--){
           int x=i>=0?num1.charAt(i)-'0':0;
           int y=j>=0?num2.charAt(j)-'0':0;
           int sum=x+y+flag;
           sb.append(sum%10);
           flag=sum/10;
       }
       sb.reverse();
        return sb.toString();
    }
    
     public String multiply1(String num1, String num2){
         if(num1.equals("0") || num2.equals("0")) return "0";
         StringBuilder sb = new StringBuilder();
         int m=num1.length();
         int n=num2.length();
         int[] ans = new int[m+n];
         for(int i=n-1;i>=0;i--){
             int d1=num2.charAt(i)-'0';
             for(int j=m-1;j>=0;j--){
                 int d2=num1.charAt(j)-'0';
                 ans[i+j+1]+=d1*d2;
             }
         }
         for(int j=m+n-1;j>0;j--){
                 ans[j-1]+=ans[j]/10;
                 ans[j]=ans[j]%10;
         }
         int index=ans[0]==0?1:0;
         while(index<m+n){
             sb.append(ans[index]);
             index++;
         }
         return sb.toString();
     }
}
