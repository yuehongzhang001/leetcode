/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1071 {
    public String gcdOfStrings(String str1, String str2) {
        String s1 = minString(str1);
        String s2 = minString(str2);
        if(s1.equals(s2)){
            int n1=str1.length()/s1.length();
            int n2=str2.length()/s2.length();
            int n=gcd(n1,n2);
            StringBuilder sb =new StringBuilder();
            for(int i=0;i<n;i++){
                sb.append(s1);
            }
            return sb.toString();
        }
        return "";
    }
    public String minString(String s){
        int len=s.length();
        for(int i=0;i<len;i++){
            String guess=s.substring(0,i+1);
            if(s.length()%guess.length()!=0)
                continue;
            int n=s.length()/guess.length();
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(guess);
                //test(sb.toString());
            }
            if(sb.toString().equals(s)) return guess;
        }
        return s;
    }
    public int gcd(int p,int q){
        return p==0?q:gcd(q%p,p);
    }
    public void test(String s){
        System.out.println(s);
    }
    
    public boolean check(String s,String t){
        int len1=s.length();
        int len2=t.length();
        if(len1%len2!=0) return false;
        int i=0;
        while(i<len1){
            if(!s.substring(i,i+len2).equals(t))
                return false;
            i+=len2;
        }
        return true;
    }
    
     public String gcdOfStrings1(String str1, String str2){
         String ls=null;
         String ss=null;
         if(str1.length()<str2.length()){
             ls=str2;
             ss=str1;
         }else{
             ss=str2;
             ls=str1;
         }
         for(int i=ss.length();i>=1;i--){
             String t = ss.substring(0,i);
             if(check(ss,t) && check(ls,t))
                 return t;
         }
         return "";
             
     }
     
     public String gcdOfStrings2(String str1, String str2){
         int n=gcd(str1.length(),str2.length());
         String s=str1.substring(0,n);
         if(check(str1,s)&&check(str2,s))
             return s;
         return "";
     }
}
