/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1025 {
    public boolean divisorGame(int N) {
        return N%2==0;
    }
    public boolean divisorGame1(int N){
        boolean[] game = new boolean[N+1];
        game[1]=false;
        game[2]=true;
        for(int i=3;i<=N;i++){
            for(int j=1;j<N;j++){
                if(i%j==0 && !game[i-j]){
                    game[i]=true;
                    break;
                }
                    
            }
        }
        return game[N];
    }
}
