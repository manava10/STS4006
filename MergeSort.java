public class MergeSort{
    public static void main(String args[]){
        int[] arr = {3,1,4,5,3};
        mergeSort(arr);
        for(int num:arr){
            System.out.println(num+" ");
        }

    }
    static void mergeSort(int[] arr){
        if(arr.length<2){
            return ;
        }
        int middle = arr.length/2;
        int[] left = new int[middle];
        int[] right = new int[arr.length-middle];

        for(int i=0;i<middle;i++){
            left[i] = arr[i];
        }
        for(int i = middle; i<arr.length; i++){
            right[i-middle] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(arr,left,right);
    }
    static void merge(int[] arr, int[] left, int[] right){
        int i, j , k;
        i = 0;
        j = 0;
        k = 0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            arr[k]=right[j];
            k++;
            j++;
        }

    }
}