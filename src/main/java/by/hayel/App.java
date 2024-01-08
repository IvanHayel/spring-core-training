package by.hayel;

import by.hayel.service.MessageService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    var context = new ClassPathXmlApplicationContext("beans.xml");

    var messageService = context.getBean("messageService", MessageService.class);
    messageService.printMessage();
  }
}
