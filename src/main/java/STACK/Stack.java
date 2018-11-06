package STACK;

public class Stack {
    private int maxStack;
    private int emptyStack;
    private int top;
    private char[] items;

    public Stack(int size) {
        this.maxStack = size;
        this.emptyStack = -1;
        this.top = emptyStack;
        this.items = new char[maxStack];
    }

    public void push(char c){
        items[++top] = c;
    }

    public char pop(){
        return items[top--];
    }
}


