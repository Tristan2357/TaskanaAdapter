package pro.taskana.camunda.spring.boot;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class CamundaSpringBootExample {

  public static void main(String... args) {
    SpringApplication.run(CamundaSpringBootExample.class, args);
  }
}

