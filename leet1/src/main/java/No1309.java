/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1309 {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        String[] ss = s.split("#");
        for(int i=0;i<ss.length-1;i++){
            String s0=ss[i];
            int len=s0.length();
            String s1=s0.substring(0,len-2);
            String s2=s0.substring(len-2);
            sb.append(interpret1(s1));
            sb.append(interpret2(s2));
        }
        String last =ss[ss.length-1];
        if(s.charAt(s.length()-1)=='#'){
            int len=last.length();
            String s1=last.substring(0,len-2);
            String s2=last.substring(len-2);
            sb.append(interpret1(s1));
            sb.append(interpret2(s2));
        }else{
            sb.append(interpret1(last));
        }
        return sb.toString();
    }
    
    public String interpret1(String s){
        StringBuilder sb =new StringBuilder();
        for(int j=0;j<s.length();j++){
                char c=(char)(s.charAt(j)-'1'+'a');
                sb.append(c);
        }
        return sb.toString();
    }
     public String interpret2(String s){
         char c=(char)(Integer.parseInt(s)-10+'j');
         return ""+c;
     }
     
      public String freqAlphabets1(String s){
          StringBuilder sb = new StringBuilder();
          for(int i=0;i<s.length();i++){
              if(i+2<s.length() && s.charAt(i+2)=='#'){
                  sb.append((char)(Integer.parseInt(s.substring(i,i+2))-10+'j'));
                  i+=2;
              }else
                  sb.append((char)(s.charAt(i)-'1'+'a'));
          }
          return sb.toString();
      }
}
