public class CustomQueue{
    private int[] data;
    int end = 0;

    private static final int Default_size = 10;

    public CustomQueue(){
        this(Default_size);
    }
    public CustomQueue(int size){
        this.data = new int[size];

    }
    public boolean isFull(){
        return  end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;

    }
    public boolean insert(int item){
        if(isFull()){
            System.out.println("The queue is Full ");
            return false;
        }
        data[end++] = item;
        return true;
    }
    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int removed = data[0];
        //Shift all the elements to left
        for(int i=1;i<end ; i++){
            data[i-1]= data[i];
        }
        end--;
        return removed;
    }
    public int front(){
        if(isEmpty()) return -1;
        return data[0];
    }
    //To dislplay all the elements in a queue
    public void display(){
        for(int i=0;i<end; i++){
            System.out.print(data[i]+" ");

        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.insert(12);
        queue.insert(24);
        queue.insert(34);
        queue.display();
    }

}