import java.util.ArrayList;
import java.util.Scanner;
public class MergeSort2{
    static void mergeSort(int[] arr, int low, int high){
        if(low<high){
            int mid = (low + high )/2;

            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer>  sorted = new ArrayList<>();
        int i=low;
        int j= mid+1;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                sorted.add(arr[i]);
                i++;
            }else{
                sorted.add(arr[j]);
                j++;
            }
        }
        if(i<=mid){
            while(i<=mid){
                sorted.add(arr[i++]);
            }
        }else{
            while(j<=high){
                sorted.add(arr[j++]);
            }
        }
        for(int k=low; k<=high;k++){
            arr[k] = sorted.get(k-low);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Now enter the elements of array one by one");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,n-1);

        System.out.println("Sorted Array is:");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}