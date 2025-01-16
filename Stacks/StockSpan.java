package Stacks;
import java.util.*;
import java.util.Stack;
class StockSpan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the arr.");
        int n= sc.nextInt();
        int[] a = new int[n];
        int[] s = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        stockspan(n,a,s);
        for(int i=0; i<n;i++){
            System.out.print(s[i] + " ");
        }
    }
    public static void stockspan(int n, int a[],int s[]){
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && a[stack.peek()]<a[i]){
                stack.pop(); 
            }
            if(stack.isEmpty()){
                s[i] = i+1;
            }
            else{
                s[i] = i - stack.peek();
            }
            stack.push(i); 
        }

    }
}