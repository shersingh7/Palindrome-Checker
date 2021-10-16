

public class Stack {

    private char[] stack;
    private int top;

    //Creating stack of defined length
    public Stack(int length) {

        stack = new char[length];
        top = -1;
    }

    //Checking if the stack is empty or not
    public boolean checkEmpty()
    {
        if(top == -1) return true;
        else return false;
    }

    //Returning and removing the top element
    public char pop(){return stack[top--];}

    //Adding element to the stack
    public void push(char str){stack[++top]=str;}
}
