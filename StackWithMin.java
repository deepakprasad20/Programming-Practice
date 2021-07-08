import java.util.Stack;

public class StackWithMin {
    public static void main(String[] args){

    }


}
class StackImpl{
    Stack mainStack = new Stack();
    Stack min = new Stack();
    public void push(int num){
        mainStack.push(num);
        if(min.isEmpty()){
            min.push(num);
        } else{

        }
    }
    //public int pop(){}
    //public int getMin(){}
}

