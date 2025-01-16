package Stacks;
public class DynamicStack extends StaticStack{
    public DynamicStack(){
        super(); //It will call custom Stack;
    }
    
    public DynamicStack(int size){
        super();  //It will call stack of size provided in arguments.
    }

    //All the method of Stack2 class will remain same here ,
    //But only push method will change . So if we want to implement that method differently
    //We we override them

    @Override
    public boolean push(int item){
        if(this.isFull()){
            int[] temp = new int[data.length*2];
            for(int i=0; i<data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        data[++top] = item;
        return true;
    }

}
