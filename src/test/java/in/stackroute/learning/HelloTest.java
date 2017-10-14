package in.stackroute.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloTest {
  @Test
  public void onePlusOneEqualsTwo() {
    assertEquals(1+1, 2);
  }

  @Test
  public void testHelloDotHelloMessage() {
    Hello hello = new Hello();
    String actual = hello.helloMessage();
    assertEquals(actual, "Hello, Gradle!");
  }
}

