package STACK;

import lombok.Getter;
import lombok.Setter;

public class Stack {
  @Getter @Setter private int maxStack;
  @Getter @Setter private int emptyStack;
  @Getter @Setter private int top;
  @Getter @Setter private char[] items;

  public Stack(int size) {
    this.maxStack = size;
    this.emptyStack = -1;
    this.top = emptyStack;
    this.items = new char[maxStack];
  }

  public void push(char c) {
    items[++top] = c;
  }

  public char pop() {
    return items[top--];
  }

  public boolean full() {
    return top + 1 == maxStack;
  }

  public boolean empty() {
    return top == emptyStack;
  }

}
