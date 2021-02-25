package kata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


class StackTest {
  KataStack stack;

  @BeforeEach
  void setup() {
    stack = new KataStack();
  }

  @Test
  void test() {
    assertThat(stack.size(), is(0));
  }

  @Test
  void testPushone() {
    stack.push("test");

    assertThat(stack.size(), is(1));
  }

  @Test
  void testPushtwo() {
    stack.push("test");
    stack.push("test");

    assertThat(stack.size(), is(2));
  }

  @Test
  void testPop() throws Exception {
    stack.push("test");
    stack.pop();
    assertThat(stack.size(), is(0));
  }

  @Test
  void testPopEmpty(){
    assertThrows(Exception.class, () -> stack.pop());
  }


  @Test
  void testPopReturnsCorrectItem() throws Exception {
    stack.push("item1");
    assertThat(stack.pop(), is("item1"));
    
    stack.push("item2");
    assertThat(stack.pop(), is("item2"));
  }
  
  @Test
  void testPopTwoTimes() throws Exception {
    stack.push("item1");
    stack.push("item2");
    
    assertThat(stack.pop(), is("item2"));
    assertThat(stack.pop(), is("item1"));
  }
  
  @Test
  void testOverflow() {
    for (var i = 0;i < 10;i++)
      stack.push("item" + i);
    
    assertThrows(IllegalStateException.class, () -> stack.push("item11"));
  }
}
