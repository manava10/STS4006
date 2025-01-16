//This Stack is implemented using Array;
class stackMethod{
    private int maxSize;
    private int top;
    private int[] stackArray;

    //Constructor to initialize them
    //The constructor is public to support the object creation from outside the class
    public stackMethod( int size ){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    //Check if Stack is empty 
    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==maxSize-1;
    }
    //push a element into array 
    public void push(int value){
        if(isFull()){
            System.out.println("Stack Overflow");
        }else{
            stackArray[++top] = value;
            System.out.println(value + " Pushed into stack");
        }
    }   
    public int pop(){
        if(isEmpty()){
            System.out.println("Nothing can be popped as stack is empty");
            return -1;

        }else{
            int poppedValue = stackArray[top--];
            return poppedValue;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("The given stack is empty");
            return -1;
        }else{
            int topValue = stackArray[top];
            return topValue;
        }
    }

}
public class Stack{
    public static void main(String[] args) {
        stackMethod stack1 = new stackMethod(10);
        stack1.push(12);
        stack1.push(23);
        System.out.println(stack1.pop());
        System.out.println(stack1.peek());
        
    }
}
//if any variable is set as private , then it cannot be accessed outside the class, to access or modify 
// them you have do it through the public method of that class.

//
