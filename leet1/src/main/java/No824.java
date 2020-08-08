/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No824 {
    public String toGoatLatin(String S) {
        String[] ss=S.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ss.length;i++){
            sb.append(" ");
            char c=Character.toLowerCase(ss[i].charAt(0));
            if(c!='a'&& c!='e'&& c!='i'&& c!='o' && c!='u'){
                sb.append(ss[i].substring(1)).append(ss[i].charAt(0));
            }else{
                sb.append(ss[i]);
            }
            sb.append("ma");
            for(int j=0;j<=i;j++){
                sb.append("a");
            }
        }
        sb.deleteCharAt(0);
       return sb.toString();
    }
}
