package Stacks;
import java.util.Stack;
class TowerOfHanoi{
    static void towerOfHanoi(int numDisks, char source, char auxiliary, char destination){
        Stack<Integer> sourceStack = new Stack<>();
        Stack<Integer> auxiliaryStack = new Stack<>();
        Stack<Integer> destinationStack = new Stack<>();

        int totalMoves = (int)Math.pow(2,numDisks)-1;

        //If number of disks is even , swap destination and auxiliary
    }

}