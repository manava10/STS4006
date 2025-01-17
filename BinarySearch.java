public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int key = 5;

        if(binarySearch(arr, key)==-1){
            System.out.println("The element is not found in the array");
        }else{
            System.out.println("The element is found at index :"+binarySearch(arr, key)+"th index.");
        }   
    }
    static int binarySearch(int[] arr, int key){
        int low =0;
        int high = arr.length-1;
        if(arr.length==1){
            return 0;
        }else{
            int mid = (low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}