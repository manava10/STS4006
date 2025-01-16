package Stacks;
import java.util.Stack;
import java.util.*;
class StackPermutations{
    public static boolean check(int[] x,int[] y,int n){
        Stack<Integer> s = new Stack<Integer>();
        int i=0; int j=0;
        while(i<n){
            s.push(x[i++]);
            while(!s.isEmpty() && j<n && s.peek()== y[j]){
                s.pop();
                j++;
            }
        }
        return j==n;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //length of array .
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter the element of original array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Now, Enter the element of permutated array");
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        if(check(a,b,n)){
            System.out.println("Yes , the given element in a and b are permutations of each other");
        }else{
            System.out.println("No , they are not permutations of each other");
        } 
    }
}
