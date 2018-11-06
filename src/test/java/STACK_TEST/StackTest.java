package STACK_TEST;

import STACK.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StackTest {
  Stack s;

  @BeforeEach
  public void init() {
    s = new Stack(3);
    s.push('a');
    s.push('b');
  }

  @Test
  void push() {
    s.push('z');
    char[] c = s.getItems();
    assertEquals('z', c[2]);
  }

  @Test
  void pop() {
    s.pop();
    char[] c = s.getItems();
    assertEquals('b', c[1]);
  }

  @Test
  void full() {
    s.push('x');
    assertTrue(s.full());
  }

  @Test
  void empty() {
    s.pop();
    s.pop();
    assertTrue(s.empty());
  }
}
