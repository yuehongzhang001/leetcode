/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No28 {
     public static int strStr(String haystack, String needle) {
        if(needle.length()==0) 
            return 0;
        else if(haystack.length()==0) 
            return -1;
        int start=0;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                start=i;
                i++;
                boolean allright=true;
                for(int j=1;j<needle.length();j++){
                    if(haystack.charAt(i)!=needle.charAt(j)){
                        i=start;
                        allright=false;
                        break;
                    }else{
                        i++;
                    }
                        
                }
                if(allright) return start;
            }
        }
        return -1;
    }
    public static int strStr1(String haystack, String needle){
          int hlen=haystack.length();
          int nlen=needle.length();
          for(int i=0;i<=hlen-nlen;i++){
              if(haystack.substring(i, i+nlen).equals(needle))
                  return i;
          }
          return -1;
    }
     
}
