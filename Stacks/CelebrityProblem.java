import java.util.*;
public class CelebrityProblem{
    static int celebrity(int[][] matrix , int n){
        int[] knowMe = new int[n];
        int[] iKnow = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    //this means i know j, and j is known by i;
                    iKnow[i]+=1;
                    knowMe[j]+=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(iKnow[i]==0 && knowMe[i]==n-1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the value of "+i+"th row");
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The entered matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("So the person at  "+celebrity(matrix,n)+ " index is celebrity");
    }
}
//A celebrity is a person who doesn't know anyone , but everyone around him know him appaeatantly