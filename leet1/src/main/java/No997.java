/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No997 {
    public int findJudge(int N, int[][] trust) {
        int[] map =new int[N];
        for(int i=0;i<trust.length;i++){
            int index=trust[i][1]-1;
            map[index]++;
        }
        int judge=-1;
        for(int i=0;i<N;i++){
            if(map[i]==N-1)
                judge=i+1;
        }
        if(judge==-1) return -1;
        for(int i=0;i<trust.length;i++){
            if(trust[i][0]==judge)
                return -1;
        }
        return judge;
    }
    
    public int findJudge1(int N, int[][] trust){
        int[] map =new int[N+1];
        for(int[] vote:trust){
            map[vote[0]]--;
            map[vote[1]]++;
        }
        for(int n:map){
            if(n==N-1) return n;
        }
        return -1;
    }
}
