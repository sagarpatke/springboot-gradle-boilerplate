package in.stackroute.learning;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Hello {

  public String helloMessage() {
    return "Hello, Gradle!";
  }

  public static void main(String... args) {
    SpringApplication.run(Hello.class, args);
    System.out.println("Hello, Gradle!");
  }

  @RequestMapping("/")
  public static String sayHello() {
    return "Hello, SpringBoot!";
  }
}
