package kata;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


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
}