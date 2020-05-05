/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class TurnMatrix {
    public static void rotate(int[][] matrix) {
        int temp;
        int n = matrix.length;
        int Xmin = 0;
        int Ymin = 0;
        int Xmax = n-1;
        int Ymax = n-1;
        for(int i=0;i<=n&&Ymin<Ymax;i++){
            for(int j=Xmin;j<Xmax;j++){
                int x1=j;
                int y1=i;
                int x2=Xmin;
                int y2=Ymax+Xmin-x1;
                int x3=Xmax+y2-Ymax;
                int y3=Ymax;
                int y4=Xmax-x3+Ymin;
                int x4=Xmax;
                
                temp = matrix[y1][x1];
                matrix[y1][x1]=matrix[y2][x2];
                matrix[y2][x2]=matrix[y3][x3];
                matrix[y3][x3]=matrix[y4][x4];
                matrix[y4][x4]=temp;
            }
            Xmin++;
            Xmax--;
            Ymin++;
            Ymax--;     
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+",");
            }
            System.out.println();
        }
    }
    
}
